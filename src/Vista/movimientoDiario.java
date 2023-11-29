package Vista;

import AccesoDatos.Conexion;
import AccesoDatos.ventaData;
import Entidades.ventasDiarias;
import java.sql.Connection;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

public class movimientoDiario extends javax.swing.JInternalFrame {
    private Connection con = null;
    private ventasDiarias venta=null;
    private ventaData venData= new ventaData();
    
    public movimientoDiario() {
        initComponents();
        con = Conexion.getConexion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jEgCafe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jEgInjertado = new javax.swing.JTextField();
        jEgPani = new javax.swing.JTextField();
        jEgCasa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jIngInjertado = new javax.swing.JTextField();
        jIngPani = new javax.swing.JTextField();
        jIngProduccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jIngCafe = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jFecha = new com.toedter.calendar.JDateChooser();
        jsalir = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();
        jsumaIng = new javax.swing.JLabel();

        jTextField7.setText("jTextField7");

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(550, 500));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Movimiento Diario");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jLabel1.setPreferredSize(new java.awt.Dimension(334, 46));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("EGRESOS");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setText("CAFE");

        jEgCafe.setText("0");
        jEgCafe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jEgCafeKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setText("INJERTADOS");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel4.setText("PANIFICACION");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setText("CASA");

        jEgInjertado.setText("0");
        jEgInjertado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEgInjertadoActionPerformed(evt);
            }
        });
        jEgInjertado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jEgInjertadoKeyTyped(evt);
            }
        });

        jEgPani.setText("0");
        jEgPani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEgPaniActionPerformed(evt);
            }
        });
        jEgPani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jEgPaniKeyTyped(evt);
            }
        });

        jEgCasa.setText("0");
        jEgCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEgCasaActionPerformed(evt);
            }
        });
        jEgCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jEgCasaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel6.setText("PANIFICACION");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel7.setText("PRODUCCION");

        jIngInjertado.setText("0");
        jIngInjertado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIngInjertadoActionPerformed(evt);
            }
        });
        jIngInjertado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jIngInjertadoKeyTyped(evt);
            }
        });

        jIngPani.setText("0");
        jIngPani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jIngPaniKeyTyped(evt);
            }
        });

        jIngProduccion.setText("0");
        jIngProduccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jIngProduccionKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 255));
        jLabel9.setText("INGRESOS");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel10.setText("CAFE");

        jIngCafe.setText("0");
        jIngCafe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jIngCafeKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel11.setText("INJERTADOS");

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel12.setText("FECHA");

        jsalir.setText("Salir");
        jsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsalirMouseClicked(evt);
            }
        });
        jsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsalirActionPerformed(evt);
            }
        });

        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jGuardar))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jsalir)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jIngInjertado)
                                    .addComponent(jIngCafe)
                                    .addComponent(jEgPani)
                                    .addComponent(jEgInjertado)
                                    .addComponent(jIngPani)
                                    .addComponent(jEgCafe)
                                    .addComponent(jEgCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jIngProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jsumaIng, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(32, 32, 32)
                                .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jIngCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jIngInjertado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIngPani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jIngProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsumaIng, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEgCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEgInjertado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEgPani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jEgCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsalir)
                    .addComponent(jGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEgInjertadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEgInjertadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEgInjertadoActionPerformed

    private void jIngInjertadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIngInjertadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIngInjertadoActionPerformed

    private void jEgPaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEgPaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEgPaniActionPerformed

    private void jEgCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEgCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEgCasaActionPerformed

    private void jsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsalirActionPerformed
        dispose();
    }//GEN-LAST:event_jsalirActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        Date fecha = jFecha.getDate();
        Instant intal = fecha.toInstant();
        LocalDate fc = intal.atZone(ZoneId.systemDefault()).toLocalDate();
        if(jFecha.getDate()==null){
            JOptionPane.showMessageDialog(this, "Fecha invalida");
            return;
        }
        double ingCafe = Double.parseDouble(jIngCafe.getText());
        double ingInje = Double.parseDouble(jIngInjertado.getText());
        double ingPani = Double.parseDouble(jIngPani.getText());
        double ingProd = Double.parseDouble(jIngProduccion.getText());
        double egCafe = Double.parseDouble(jEgCafe.getText());
        double egInje = Double.parseDouble(jEgInjertado.getText());
        double egPani = Double.parseDouble(jEgPani.getText());
        double egCasa = Double.parseDouble(jEgCasa.getText());
        venta=new ventasDiarias(fc,ingCafe,ingInje,ingPani,ingProd,egCafe,egInje,egPani,egCasa);
        venData.guardarVenta(venta);
        limpiar();
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jIngCafeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIngCafeKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 46 && key <= 57 || key == 46 ;
        if (!numeros || jIngCafe.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_jIngCafeKeyTyped

    private void jIngInjertadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIngInjertadoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 46 && key <= 57 || key == 46 ;
        if (!numeros || jIngInjertado.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_jIngInjertadoKeyTyped

    private void jIngPaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIngPaniKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 46 && key <= 57 || key == 46 ;
        if (!numeros || jIngPani.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_jIngPaniKeyTyped

    private void jIngProduccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jIngProduccionKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 46 && key <= 57 || key == 46 ;
        if (!numeros || jIngProduccion.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_jIngProduccionKeyTyped

    private void jEgCafeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEgCafeKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 46 && key <= 57 || key == 46 ;
        if (!numeros || jEgCafe.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_jEgCafeKeyTyped

    private void jEgInjertadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEgInjertadoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 46 && key <= 57 || key == 46 ;
        if (!numeros || jEgInjertado.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_jEgInjertadoKeyTyped

    private void jEgPaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEgPaniKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 46 && key <= 57 || key == 46 ;
        if (!numeros || jEgPani.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_jEgPaniKeyTyped

    private void jEgCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jEgCasaKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 46 && key <= 57 || key == 46 ;
        if (!numeros || jEgCasa.getText().length() >= 8){
            evt.consume();
        }
    }//GEN-LAST:event_jEgCasaKeyTyped

    private void jsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsalirMouseClicked
        dispose();
    }//GEN-LAST:event_jsalirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JTextField jEgCafe;
    private javax.swing.JTextField jEgCasa;
    private javax.swing.JTextField jEgInjertado;
    private javax.swing.JTextField jEgPani;
    private com.toedter.calendar.JDateChooser jFecha;
    private javax.swing.JButton jGuardar;
    private javax.swing.JTextField jIngCafe;
    private javax.swing.JTextField jIngInjertado;
    private javax.swing.JTextField jIngPani;
    private javax.swing.JTextField jIngProduccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton jsalir;
    private javax.swing.JLabel jsumaIng;
    // End of variables declaration//GEN-END:variables

    private void limpiar(){
        jFecha.setDate(null);
        jIngCafe.setText("0");
        jIngInjertado.setText("0");
        jIngPani.setText("0");
        jIngProduccion.setText("0");
        jEgCafe.setText("0");
        jEgInjertado.setText("0");
        jEgPani.setText("0");
        jEgCasa.setText("0");
    }
}
