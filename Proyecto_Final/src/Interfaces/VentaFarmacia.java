/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author DyMGaming
 */
public class VentaFarmacia extends javax.swing.JFrame {

    /**
     * Creates new form VentaFarmacia
     */
    public VentaFarmacia() {
        initComponents();
        Medicina.setEnabled(false);
        JGramos.setEnabled(false);
        JPrecio.setEnabled(false);
        CReceta.setEnabled(false);
        Admin.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Vender = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        Medicina = new javax.swing.JTextField();
        JGramos = new javax.swing.JTextField();
        JPrecio = new javax.swing.JTextField();
        JCantidad = new javax.swing.JTextField();
        Gramos = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        Via = new javax.swing.JLabel();
        receta = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Admin = new javax.swing.JComboBox<>();
        CReceta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Vender.setBackground(new java.awt.Color(0, 0, 102));
        Vender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Vender.setForeground(new java.awt.Color(255, 255, 255));
        Vender.setText("Vender");
        getContentPane().add(Vender, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        Volver.setBackground(new java.awt.Color(0, 0, 102));
        Volver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 255, 255));
        Volver.setText("Volver");
        Volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolverMouseClicked(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Salir");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo2.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        Medicina.setText("Paracetamol");
        getContentPane().add(Medicina, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 30));

        JGramos.setText("500gr");
        getContentPane().add(JGramos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 130, 30));

        JPrecio.setText("500");
        getContentPane().add(JPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 30));
        getContentPane().add(JCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 130, 30));

        Gramos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Gramos.setForeground(new java.awt.Color(255, 255, 255));
        Gramos.setText("Gramos");
        getContentPane().add(Gramos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 130, -1));

        precio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        precio.setForeground(new java.awt.Color(255, 255, 255));
        precio.setText("Precio");
        getContentPane().add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, -1));

        Via.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Via.setForeground(new java.awt.Color(255, 255, 255));
        Via.setText("Via administracion");
        getContentPane().add(Via, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 130, -1));

        receta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        receta.setForeground(new java.awt.Color(255, 255, 255));
        receta.setText("Receta");
        getContentPane().add(receta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 130, -1));

        cantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cantidad.setForeground(new java.awt.Color(255, 255, 255));
        cantidad.setText("Cantidad");
        getContentPane().add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 130, -1));

        Nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Nombre");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, -1));

        Admin.setBackground(new java.awt.Color(0, 0, 102));
        Admin.setForeground(new java.awt.Color(255, 255, 255));
        Admin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oral ", "Sublingual ", "Topica ", "Parental ", "Respiratoria ", "Rectal ", "Vaginal" }));
        getContentPane().add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 130, 30));

        CReceta.setBackground(new java.awt.Color(0, 0, 102));
        CReceta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CReceta.setForeground(new java.awt.Color(255, 255, 255));
        CReceta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", " " }));
        getContentPane().add(CReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/OIP (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolverMouseClicked
       Venta v = new Venta();
       v.setVisible(true);
       this.setVisible(false);
       JOptionPane.showMessageDialog(null, "Venta Cancelada", "venta cancelada",JOptionPane.CANCEL_OPTION);
    }//GEN-LAST:event_VolverMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        JOptionPane.showMessageDialog(null, "Cierre de sesion automatico activado", "Cerrar Aplicacion",JOptionPane.CANCEL_OPTION);
        System.exit(0);
    }//GEN-LAST:event_jButton3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentaFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaFarmacia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaFarmacia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Admin;
    private javax.swing.JComboBox<String> CReceta;
    private javax.swing.JLabel Gramos;
    private javax.swing.JTextField JCantidad;
    private javax.swing.JTextField JGramos;
    private javax.swing.JTextField JPrecio;
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField Medicina;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Vender;
    private javax.swing.JLabel Via;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel cantidad;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel receta;
    // End of variables declaration//GEN-END:variables
}