package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.List; 

public class ClienteDao {
    
    DatabaseConnection connectionData = new DatabaseConnection();
    Connection connection;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean IngresarCliente(Cliente cl) {
        String sql = "INSERT INTO clientes (dni, nombre, direccion, numerotelefonico) VALUES (?, ?, ?, ?)";
        
        try {
            connection = connectionData.getConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, cl.getDni());
            ps.setString(2, cl.getNombre());
            ps.setString(3, cl.getDirrecion());
            ps.setInt(4, cl.getNumeroTelefonico());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
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
    public List ListarCliente(){
        List<Cliente> listaCl = new ArrayList<>();
        String sql = "SELECT * FROM CLIENTES";
        try {
            connection = connectionData.getConnection();
             ps = connection.prepareStatement(sql); 
             rs = ps.executeQuery();            while (rs.next()) {               
                Cliente cl = new Cliente();
                cl.setId(rs.getInt("id"));
                cl.setDni(rs.getInt("dni"));
                cl.setNombre(rs.getString("nombre"));
                cl.setDirrecion(rs.getString("direccion"));
               cl.setNumeroTelefonico(rs.getInt("numerotelefonico"));
                listaCl.add(cl);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        } finally {
            
        }
        
        return listaCl;

    
    
}
     public boolean EliminarCliente(int id){
       String sql = "DELETE FROM CLIENTES WHERE id = ?";
       try {
           ps = connection.prepareStatement(sql);
           ps.setInt(1, id);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               connection.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
   }
     public boolean ModificarCliente(Cliente cl){
      String sql = "INSERT INTO clientes (dni, nombre, direccion, numerotelefonico)" +"VALUES (?, ?, ?, ?) WHERE ID=?" ;
      try{
          ps = connection.prepareStatement(sql);
          ps.setInt(1, cl.getDni());
          ps.setString(2, cl.getNombre());
          ps.setString(3, cl.getDirrecion());
          ps.setInt(4, cl.getNumeroTelefonico());
          ps.setInt(5, cl.getId());
          return true;

          
                  
      
      
      }catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               connection.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
         
              }
     
     
     
     
}