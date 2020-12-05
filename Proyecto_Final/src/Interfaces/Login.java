/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author DyMGaming
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
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

        jTextField2 = new javax.swing.JTextField();
        Iniciar_sesion = new javax.swing.JButton();
        JUser = new javax.swing.JTextField();
        JPassword = new javax.swing.JTextField();
        Crear = new javax.swing.JLabel();
        JTextUser = new javax.swing.JLabel();
        JTextPasword = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        Icono = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        jTextField2.setText("Usuario");
        jTextField2.setUI(null);
        jTextField2.setActionCommand("<Not Set>");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Iniciar_sesion.setBackground(new java.awt.Color(0, 0, 102));
        Iniciar_sesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Iniciar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        Iniciar_sesion.setText("Iniciar Sesion");
        Iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Iniciar_sesionActionPerformed(evt);
            }
        });
        getContentPane().add(Iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 110, -1));

        JUser.setBackground(new java.awt.Color(0, 0, 102));
        JUser.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(JUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 110, -1));

        JPassword.setBackground(new java.awt.Color(0, 0, 102));
        JPassword.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(JPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 110, -1));

        Crear.setForeground(new java.awt.Color(255, 255, 255));
        Crear.setText("Crear Cuenta");
        Crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearMouseClicked(evt);
            }
        });
        getContentPane().add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 270, 80, -1));

        JTextUser.setForeground(new java.awt.Color(255, 255, 255));
        JTextUser.setText("Usuario");
        getContentPane().add(JTextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, 20));

        JTextPasword.setForeground(new java.awt.Color(255, 255, 255));
        JTextPasword.setText("Contraseña");
        getContentPane().add(JTextPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 20));

        Salir.setBackground(new java.awt.Color(0, 0, 102));
        Salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo2.png"))); // NOI18N
        getContentPane().add(Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/OIP (1).jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Iniciar_sesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Iniciar_sesionActionPerformed

    private void CrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearMouseClicked
        Registro v = new Registro();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CrearMouseClicked

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Crear;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Icono;
    private javax.swing.JButton Iniciar_sesion;
    private javax.swing.JTextField JPassword;
    private javax.swing.JLabel JTextPasword;
    private javax.swing.JLabel JTextUser;
    private javax.swing.JTextField JUser;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
