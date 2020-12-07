/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.DriverManager;


/**
 *
 * @author DyMGaming
 */
public class Compra extends javax.swing.JFrame {

    /**
     * Creates new form Almacen
     */
    public Compra() {
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

        Return = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        JNombre = new javax.swing.JTextField();
        JEjemplo = new javax.swing.JLabel();
        JAlmacen = new javax.swing.JTextField();
        JGramos = new javax.swing.JTextField();
        JPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JReceta = new javax.swing.JComboBox<>();
        JVia = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        JTrabajadores = new javax.swing.JComboBox<>();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Return.setBackground(new java.awt.Color(0, 0, 102));
        Return.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Return.setForeground(new java.awt.Color(255, 255, 255));
        Return.setText("Volver");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        getContentPane().add(Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        Registrar.setBackground(new java.awt.Color(0, 0, 102));
        Registrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("Registrar");
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarMouseClicked(evt);
            }
        });
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, 30));

        Salir.setBackground(new java.awt.Color(0, 0, 102));
        Salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));
        getContentPane().add(JNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 30));

        JEjemplo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JEjemplo.setForeground(new java.awt.Color(255, 255, 255));
        JEjemplo.setText("Compra de medicamentos ingrese los datos correspondientes");
        getContentPane().add(JEjemplo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 380, -1));
        getContentPane().add(JAlmacen, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 170, 30));
        getContentPane().add(JGramos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 170, 30));
        getContentPane().add(JPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 170, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Precio");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Requiere Receta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 170, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gramos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 170, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Via de administracion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 170, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad de compra");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 170, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre del medicamento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 170, 20));

        JReceta.setBackground(new java.awt.Color(0, 0, 102));
        JReceta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JReceta.setForeground(new java.awt.Color(255, 255, 255));
        JReceta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", " " }));
        getContentPane().add(JReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 170, 30));

        JVia.setBackground(new java.awt.Color(0, 0, 102));
        JVia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JVia.setForeground(new java.awt.Color(255, 255, 255));
        JVia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oral", "Sublingual", "Topica", "Parental", "Respiratoria", "Rectal", "Vaginal", " " }));
        getContentPane().add(JVia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 170, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo2.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        JTrabajadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1" }));
        getContentPane().add(JTrabajadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 150, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/OIP (1).jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistrarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
     JOptionPane.showMessageDialog(null, "Cierre de sesion automatico activado", "Cerrar Aplicacion",JOptionPane.CANCEL_OPTION);
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
       MenuPrincipal v = new MenuPrincipal();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ReturnActionPerformed

    private void RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseClicked
        Connection con;
        CallableStatement cs;
        try {
           Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Farmacia","Marlon","mpsaaj");
             cs = con.prepareCall("select insertarregistrofull(?,?,?,?,?,?,?)");
             cs.setString(1, this.JNombre.getText());
             cs.setInt(2, Integer.parseInt((String)this.JGramos.getText()));
             cs.setInt(3, Integer.parseInt((String)this.JPrecio.getText()));
             cs.setString(4,(String) this.JVia.getSelectedItem());
             cs.setString(5,(String) this.JReceta.getSelectedItem());
             cs.setInt(6, Integer.parseInt((String)this.JAlmacen.getText()));
             cs.setInt(7, Integer.parseInt((String)this.JTrabajadores.getSelectedItem()));
             if (cs.execute()) {
                JOptionPane.showMessageDialog(getParent(), "Compra Realizada Correctamente");
                MenuPrincipal v = new MenuPrincipal();
                v.setVisible(true);
                this.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_RegistrarMouseClicked

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
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField JAlmacen;
    private javax.swing.JLabel JEjemplo;
    private javax.swing.JTextField JGramos;
    private javax.swing.JTextField JNombre;
    private javax.swing.JTextField JPrecio;
    private javax.swing.JComboBox<String> JReceta;
    private javax.swing.JComboBox<String> JTrabajadores;
    private javax.swing.JComboBox<String> JVia;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Return;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
