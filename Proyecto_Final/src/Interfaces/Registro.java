/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author DyMGaming
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
       // iconoEnBD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        Ap = new javax.swing.JLabel();
        Am = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        TNombre = new javax.swing.JTextField();
        TAP = new javax.swing.JTextField();
        TAM = new javax.swing.JTextField();
        TPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombre");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        Ap.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Ap.setForeground(new java.awt.Color(255, 255, 255));
        Ap.setText("Apellido paterno");
        getContentPane().add(Ap, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        Am.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Am.setForeground(new java.awt.Color(255, 255, 255));
        Am.setText("Apellido materno");
        getContentPane().add(Am, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        Password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Contraseña");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        Registrar.setBackground(new java.awt.Color(0, 0, 102));
        Registrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        TNombre.setBackground(new java.awt.Color(0, 0, 102));
        TNombre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 140, -1));

        TAP.setBackground(new java.awt.Color(0, 0, 102));
        TAP.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 140, -1));

        TAM.setBackground(new java.awt.Color(0, 0, 102));
        TAM.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 140, -1));

        TPassword.setBackground(new java.awt.Color(0, 0, 102));
        TPassword.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 140, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Volver");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/OIP (1).jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 320));
        jLabel1.setMinimumSize(new java.awt.Dimension(400, 320));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 320));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Login v = new Login();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Am;
    private javax.swing.JLabel Ap;
    private javax.swing.JLabel Password;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField TAM;
    private javax.swing.JTextField TAP;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTextField TPassword;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables
}
