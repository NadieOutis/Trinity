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
    
    public boolean IngresarCliente(Cliente cl){
    String sql = "INSERT INTO clientes (dni, nombre, direccion, numerotelefonico) " + "VALUES (?, ?, ?, ?);";
    Try{
        con = cn.getConnection();
        ps =  con.prepar
    }

        
        
        
    }
    
    

    
    
    
    
}
