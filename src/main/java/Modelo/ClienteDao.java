/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author ego
 */
public class ClienteDao {
    
    DatabaseConnection cn = new DatabaseConnection();
    Connection con;
    PreparedStatement ps;
    
    public boolean IngresarCliente(Client cl){
    String sql = "INSERT INTO clientes (dni, nombre, direccion, numeroTelefonico) \n" +
"VALUES (1, 12345678, 'Juan Perez', 'Calle Principal 123', 555123456);";

        
        
        
    }
    
    

    
    
    
    
}
