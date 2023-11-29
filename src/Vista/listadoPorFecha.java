/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import AccesoDatos.ventaData;
import Entidades.ventasDiarias;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class listadoPorFecha extends javax.swing.JInternalFrame {
    private ventaData vtaData=new ventaData();
    private ArrayList<ventasDiarias> listaVta;
    private ventasDiarias venta=null;
    private double sumaI=0;
    private double sumaE=0;
    
    public listadoPorFecha() {
        initComponents();
        limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFecha1 = new com.toedter.calendar.JDateChooser();
        jBuscarFecha1 = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTotalIng = new javax.swing.JLabel();
        jIngCafe = new javax.swing.JLabel();
        jIngInjertados = new javax.swing.JLabel();
        jIngPanificacion = new javax.swing.JLabel();
        jIngProduccion = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTotalEgresos = new javax.swing.JLabel();
        jEgPanificacion = new javax.swing.JLabel();
        jEgCasa = new javax.swing.JLabel();
        jEgCafe = new javax.swing.JLabel();
        jEgInjertados = new javax.swing.JLabel();

        setClosable(true);

        jLabel1.setText("LISTADO POR FECHA");

        jLabel2.setText("Ingrese Fecha");

        jBuscarFecha1.setText("Buscar");
        jBuscarFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarFecha1ActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        jLimpiar.setText("Limpiar");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setText("INGRESOS");

        jIngCafe.setText("Cafe");

        jIngInjertados.setText("injertados");

        jIngPanificacion.setText("panificacion");

        jIngProduccion.setText("produccion");

        jLabel8.setText("EGRESOS");

        jEgPanificacion.setText("panificacion");

        jEgCasa.setText("casa");

        jEgCafe.setText("cafe");

        jEgInjertados.setText("injertados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jIngCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jTotalIng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(jBuscarFecha1)))
                        .addGap(28, 28, 28)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(56, 56, 56)
                        .addComponent(jTotalEgresos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jEgCasa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jEgPanificacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jEgInjertados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jEgCafe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jIngProduccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jIngPanificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                .addComponent(jIngInjertados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscarFecha1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTotalIng, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jIngCafe)
                .addGap(1, 1, 1)
                .addComponent(jIngInjertados)
                .addGap(2, 2, 2)
                .addComponent(jIngPanificacion)
                .addGap(2, 2, 2)
                .addComponent(jIngProduccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTotalEgresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEgCafe)
                .addGap(1, 1, 1)
                .addComponent(jEgInjertados)
                .addGap(2, 2, 2)
                .addComponent(jEgPanificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jEgCasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSalir)
                    .addComponent(jLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jBuscarFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarFecha1ActionPerformed
        try{
            Date fecha = jFecha1.getDate();
            ZoneId defaultZoneId = ZoneId.systemDefault();
            Instant intal = fecha.toInstant();
            LocalDate fc = intal.atZone(ZoneId.systemDefault()).toLocalDate();
            venta = vtaData.buscarVentaPorFecha(fc);
            if (venta!=null){
                jIngCafe.setText("CAFE         "+venta.getIngCafe());
                sumaI+=venta.getIngCafe();
                jIngInjertados.setText("INJERTADOS   "+venta.getIngInje());
                sumaI+=venta.getIngInje();
                jIngPanificacion.setText("PANIFICACION "+venta.getIngPani());
                sumaI+=venta.getIngPani();
                jIngProduccion.setText("PRODUCCION   "+venta.getIngProd());
                sumaI+=venta.getIngProd();
                jEgCafe.setText( "CAFE         "+venta.getEgcafe());
                sumaE+=venta.getEgcafe();
                jEgInjertados.setText( "INJERTADOS   "+venta.getEgInje());
                sumaE+=venta.getEgInje();
                jEgPanificacion.setText( "PANIFICACION "+venta.getEgPani());
                sumaE+=venta.getEgPani();
                jEgCasa.setText( "CASA         "+venta.getEgcasa());
                sumaE+=venta.getEgcasa();
                jTotalIng.setText("TOTAL "+sumaI);
                jTotalEgresos.setText("TOTAL "+sumaE);
            }else{
                JOptionPane.showMessageDialog(this, "Fecha sin actividad registrada");
            }
        }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla"+ e);
        }
    }//GEN-LAST:event_jBuscarFecha1ActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscarFecha1;
    private javax.swing.JLabel jEgCafe;
    private javax.swing.JLabel jEgCasa;
    private javax.swing.JLabel jEgInjertados;
    private javax.swing.JLabel jEgPanificacion;
    private com.toedter.calendar.JDateChooser jFecha1;
    private javax.swing.JLabel jIngCafe;
    private javax.swing.JLabel jIngInjertados;
    private javax.swing.JLabel jIngPanificacion;
    private javax.swing.JLabel jIngProduccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JButton jSalir;
    private javax.swing.JLabel jTotalEgresos;
    private javax.swing.JLabel jTotalIng;
    // End of variables declaration//GEN-END:variables

    private void limpiar(){
        jFecha1.setDate(null);
        jTotalIng.setText("");
        jTotalEgresos.setText("");
        jIngCafe.setText("");
        jIngInjertados.setText("");
        jIngPanificacion.setText("");
        jIngProduccion.setText("");
        jEgCafe.setText("");
        jEgInjertados.setText("");
        jEgPanificacion.setText("");
        jEgCasa.setText("");
    }
    
}
