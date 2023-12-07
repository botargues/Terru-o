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
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ventaData {
    private Connection con =null;
    private ventasDiarias vd=null;
    
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
        //ventasDiarias vd=null;
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
    
    
    public ArrayList<ventasDiarias> buscarVentaEntreFechas(LocalDate fecha1,LocalDate fecha2){
        ArrayList<ventasDiarias> ventaDiaria = new ArrayList<>();
       
        String sql="SELECT * FROM ventadiaria WHERE fecha >= ? AND fecha <= ? ";
        
        PreparedStatement ps=null;
        try {    
            ps=con.prepareStatement(sql);  
            ps.setDate(1, Date.valueOf(fecha1));
            ps.setDate(2, Date.valueOf(fecha2));
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
                ventaDiaria.add(vd);
            }else{
                JOptionPane.showMessageDialog(null, "Ninguna venta en esa fecha");   
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
        System.out.println(ventaDiaria.size());
        return ventaDiaria;
    }

    public ArrayList<ventasDiarias> sumarLista(ArrayList lista){
        ArrayList<ventasDiarias> sumaLista = new ArrayList<>();
        Iterator<ventasDiarias> it = lista.iterator();
        
        while(it.hasNext()){
            ventasDiarias item=it.next();  
            System.out.println("tipo: " + item.getIngCafe());
        }
        /*for(Object str : lista){
            System.out.println("sergio");
            System.out.println(str.toString());
        }
        for(int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }*/
        return sumaLista;
    }
    
}
