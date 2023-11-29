package AccesoDatos;

import Entidades.ventasDiarias;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ventaData {
    private Connection con =null;

    public ventaData() {
        con=Conexion.getConexion();
        
    }
    
    public void guardarVenta(ventasDiarias venta){ 
        String sql="INSERT INTO ventadiaria (fecha,cafeIng,injIng,paniIng,prodIng,cafeEg,injEg,paniEg,casaEg)" 
                + " VALUES(?,?,?,?,?,?,?,?,?)";
        try {        
            PreparedStatement ps= con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1,Date.valueOf(venta.getFecha()));
            ps.setDouble(2,venta.getIngCafe());
            ps.setDouble(3,venta.getIngInje());
            ps.setDouble(4,venta.getIngPani());
            ps.setDouble(5,venta.getIngProd());
            ps.setDouble(6,venta.getEgcafe());
            ps.setDouble(7,venta.getEgInje());
            ps.setDouble(8,venta.getEgPani());
            ps.setDouble(9,venta.getEgcasa());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();   
            if(rs.next()){                         
                JOptionPane.showMessageDialog(null,"Se agrego la venta ");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ventadiaria");
        }
    }

    public ventasDiarias buscarVentaPorFecha(LocalDate fecha){
        String sql="SELECT fecha,cafeIng,injIng,paniIng,prodIng,cafeEg,injEg,paniEg,casaEg FROM ventadiaria WHERE fecha=?";
        ventasDiarias vd=null;
        try {    
            PreparedStatement ps=con.prepareStatement(sql);  
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs=ps.executeQuery();
            if(rs.next()){      
                vd=new ventasDiarias();          
                vd.setFecha(rs.getDate("fecha").toLocalDate());
                vd.setIngCafe(rs.getDouble("cafeIng"));
                vd.setIngInje(rs.getDouble("injIng"));
                vd.setIngPani(rs.getDouble("paniIng"));
                vd.setIngProd(rs.getDouble("prodIng"));
                vd.setEgcafe(rs.getDouble("cafeEg"));
                vd.setEgInje(rs.getDouble("injEg"));
                vd.setEgPani(rs.getDouble("paniEg"));
                vd.setEgcasa(rs.getDouble("casaEg"));
            }else{
                JOptionPane.showMessageDialog(null, "Ninguna venta en esa fecha");   
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        return vd;         
    }
    
    
/*    public ArrayList<ventasDiarias> buscarVentaPorFech(){
        ventasDiarias vd=null;
        ArrayList<ventasDiarias> ventasDiarias = new ArrayList<>();
        String sql="SELECT fecha,cafeIng,injIng,paniIng,prodIng,cafeEg,injEg,paniEg,casaEg FROM ventadiaria WHERE fecha=?";
        PreparedStatement ss=null;
        try {
            ss=con.prepareStatement(sql);
            ss.setDate(1, Date.valueOf(fecha));
            ResultSet rs=ss.executeQuery();
            if (rs.next()){
                vd=new ventasDiarias();
                vd.setFecha(rs.getDate("fecha").toLocalDate());
                vd.setIngCafe(rs.getDouble("cafeIng"));
                vd.setIngInje(rs.getDouble("injIng"));
                vd.setIngPani(rs.getDouble("paniIng"));
                vd.setIngProd(rs.getDouble("prodIng"));
                vd.setEgcafe(rs.getDouble("cafeEg"));
                vd.setEgInje(rs.getDouble("injEg"));
                vd.setEgPani(rs.getDouble("paniEg"));
                vd.setEgcasa(rs.getDouble("casaEg"));
                ventasDiarias.add(vd);
            }else{
                JOptionPane.showMessageDialog(null,"No se encontro la fecha solicitada");
                ss.close();
            }
        } catch (SQLException xx){
            JOptionPane.showMessageDialog(null,"Error al acceder a buscar la fecha  "+xx.getMessage());
        }
        return ventasDiarias;
    }
  */  
}
