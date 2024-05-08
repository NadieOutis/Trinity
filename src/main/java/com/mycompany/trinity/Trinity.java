package com.mycompany.trinity;

import java.sql.*;
import java.util.Scanner;

public class Trinity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = "jdbc:postgresql://localhost:5432/postgres"; 
        String usuario = "postgres";
        String contraseña = "sis";

        System.out.println("Ingrese el nombre:");
        String s = scanner.nextLine();
        scanner.close(); 

        try (Connection conexión = DriverManager.getConnection(url, usuario, contraseña)) {
                String consulta = "SELECT ID, ID_CAT, NOMBRE, ESTADO, FECHA_VENCIMIENTO FROM MEDICAMENTOS WHERE NOMBRE LIKE ? AND ESTADO = '1'  ORDER BY FECHA_VENCIMIENTO ";
            
            try (PreparedStatement declaración = conexión.prepareStatement(consulta)) {
                declaración.setString(1, "%" + s + "%");

                try (ResultSet resultado = declaración.executeQuery()) {
                    while (resultado.next()) {
                        int id = resultado.getInt("ID");
                        int id_cat = resultado.getInt("ID_Cat");
                        String nombre = resultado.getString("NOMBRE");

                        String estado = resultado.getString("Estado");

                        java.sql.Date fechaVencimiento = resultado.getDate("FECHA_VENCIMIENTO");

                        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Fecha de vencimiento: " + fechaVencimiento+ ", Estado: " + estado);
                    }
                }
            } catch (SQLException e) {
                System.err.println("Error SQL: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        } catch (SQLException e) {
            System.err.println("Error SQL: " + e.getMessage());
        }
    }
}
