package Vista;

import Vista.movimientoDiario;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jtfmovimientoDiario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jListados = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenu();

        escritorio.setBackground(new java.awt.Color(153, 255, 51));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        jMenu1.setText("Administarcion");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jtfmovimientoDiario.setText("Movimiento diario");
        jtfmovimientoDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfmovimientoDiarioActionPerformed(evt);
            }
        });
        jMenu1.add(jtfmovimientoDiario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jListados.setText("Listados");
        jListados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListadosActionPerformed(evt);
            }
        });
        jMenu2.add(jListados);

        jMenuBar1.add(jMenu2);

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jtfmovimientoDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfmovimientoDiarioActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        movimientoDiario md=new movimientoDiario();
        md.setVisible(true);
        escritorio.add(md);
        escritorio.moveToFront(md);
        
    }//GEN-LAST:event_jtfmovimientoDiarioActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jListadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListadosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        listadoPorFecha lpf=new listadoPorFecha();
        lpf.setVisible(true);
        escritorio.add(lpf);
        escritorio.moveToFront(lpf);
        
    }//GEN-LAST:event_jListadosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jListados;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jSalir;
    private javax.swing.JMenuItem jtfmovimientoDiario;
    // End of variables declaration//GEN-END:variables
}
