/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    private Connection con;


    public Connection getConnection() {
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String username = "postgres";
            String password = "sis";
            
            con = DriverManager.getConnection(url, username, password);
            return con;
        } catch (SQLException e) {

            e.printStackTrace(); // or log it
        }
        return null;
    }
}