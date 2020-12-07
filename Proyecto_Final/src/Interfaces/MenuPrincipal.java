/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DyMGaming
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        iconoEnBD();
    }
    public void iconoEnBD(){      
        URL url = getClass().getResource("/Imagenes/Logo2.png"); 
        ImageIcon icono = new ImageIcon(url);  
        setIconImage(icono.getImage()); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Welcome = new javax.swing.JLabel();
        Almacen = new javax.swing.JButton();
        Compra = new javax.swing.JButton();
        Venta = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        CSesion = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Welcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setText("Bienvenido Usuario");
        getContentPane().add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        Almacen.setBackground(new java.awt.Color(0, 0, 102));
        Almacen.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Almacen.setForeground(new java.awt.Color(255, 255, 255));
        Almacen.setText("Almacen");
        Almacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmacenActionPerformed(evt);
            }
        });
        getContentPane().add(Almacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        Compra.setBackground(new java.awt.Color(0, 0, 102));
        Compra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Compra.setForeground(new java.awt.Color(255, 255, 255));
        Compra.setText("Compra");
        Compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompraMouseClicked(evt);
            }
        });
        getContentPane().add(Compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        Venta.setBackground(new java.awt.Color(0, 0, 102));
        Venta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Venta.setForeground(new java.awt.Color(255, 255, 255));
        Venta.setText("Venta");
        Venta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VentaMouseClicked(evt);
            }
        });
        getContentPane().add(Venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo2.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        CSesion.setBackground(new java.awt.Color(0, 0, 102));
        CSesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CSesion.setForeground(new java.awt.Color(255, 255, 255));
        CSesion.setText("Cerrar sesion");
        CSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CSesionMouseClicked(evt);
            }
        });
        CSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSesionActionPerformed(evt);
            }
        });
        getContentPane().add(CSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        Salir.setBackground(new java.awt.Color(0, 0, 102));
        Salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/OIP (1).jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void CSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CSesionMouseClicked
        Login v = new Login();
        v.setVisible(true);
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Sesion Cerrada Correctamente", "Cerrar Sesion",JOptionPane.CANCEL_OPTION);
    }//GEN-LAST:event_CSesionMouseClicked

    private void AlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmacenActionPerformed
       Almacen v = new Almacen();
       v.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_AlmacenActionPerformed

    private void CompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompraMouseClicked
       Compra v = new Compra();
       v.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_CompraMouseClicked

    private void VentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VentaMouseClicked
        Venta v = new Venta();
       v.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_VentaMouseClicked

    private void CSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CSesionActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Almacen;
    private javax.swing.JButton CSesion;
    private javax.swing.JButton Compra;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Venta;
    private javax.swing.JLabel Welcome;
    // End of variables declaration//GEN-END:variables
}
