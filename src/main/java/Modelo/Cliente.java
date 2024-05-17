/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ego
 */
public class Cliente {
        private int id;
        private int dni;
        private String nombre;
        private String dirrecion;
        private int numerotelefonico;

    public Cliente(){
        
        
    }
    public Cliente(int id, int dni, String nombre, String dirrecion, int numeroTelefonico){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.dirrecion = dirrecion;
        this.numerotelefonico = numeroTelefonico;
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public void setNumeroTelefonico(int numerotelefonico) {
        this.numerotelefonico = numerotelefonico;
    }

    public int getId() {
        return id;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public int getNumeroTelefonico() {
        return numerotelefonico;
    }
    
}
