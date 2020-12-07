package ConexionSQL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
public class Conexion {
    private String r;
    static Connection con;
    private static PreparedStatement ps;
    private static ResultSet rs;
    private Statement stm; 
    
    public static Connection getConnection(){
        String url = "jdbc:postgresql://localhost:5432/Farmacia";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion" + e.getMessage(),"Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        try {
            con = DriverManager.getConnection(url,"Marlon","mpsaaj");
        } catch (SQLException e) {
        }
        return con;
    }
    
    public boolean ejecutarInstruccion(String sql){
        boolean res = false;
        try {
            stm = con.createStatement(); 
            stm.execute(sql); 
            res = true;  
        } catch (Exception ex) {
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                con.close();
            } catch (Exception ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);    
            }
        }
        return res; 
    }



 public static ResultSet Consulta(String consulta){
        Connection con = getConnection();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    public static void main(String args[]) {
         
    }
}