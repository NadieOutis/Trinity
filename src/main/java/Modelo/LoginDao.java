/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DatabaseConnection sis = new DatabaseConnection();
    
public Logins log(String correo, String password){
    Logins l = new Logins();
    String sql = "SELECT * FROM USUARIOS WHERE CORREO = ? AND PASSWORD = ? ";
    try{
    con = sis.getConnection();
    ps = con.prepareStatement(sql);
    ps.setString(1, correo);
    ps.setString(2, password);
    rs = ps.executeQuery();
    if (rs.next()){
    l.setId(rs.getInt("id"));
    l.setNombre(rs.getString("nombre"));
    l.setCorreo(rs.getString("correo"));
    l.setPassword(rs.getString("password"));
    
    }
    
    
    
    
    }catch (SQLException e){
        System.out.println(e.toString());
        
        
        
    }
    return l;


}   
    
    
    
}
