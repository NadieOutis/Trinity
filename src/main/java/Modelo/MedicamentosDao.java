/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.List;  

/**
 *
 * @author ego
 */
public class MedicamentosDao {
    DatabaseConnection connectionData = new DatabaseConnection();
    Connection connection;
    ResultSet rs;
    PreparedStatement ps;
   
public boolean IngresarMedicamentos(Medicamentos med){
    String sql = "INSERT INTO MEDICAMENTOS (id_cat, nombre, estado, fecha_vencimiento) VALUES (?, ?, 1, ?)";
    try{
        connection = connectionData.getConnection();
        ps = connection.prepareStatement(sql);
        ps.setInt(1, med.ge);
                
        
        
        return true;
      } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }






}
    
    
    
    
    
    
    
    
    
}
