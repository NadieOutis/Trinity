/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author ego
 */
public class Medicamentos {
    private int id;
    private int codigo;
    private String nombre;
    private int funcional;
    private String fecha;
    
    public Medicamentos (){
    }

    public Medicamentos(int id, int codigo, String nombre, int funcional, String fecha) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.funcional = funcional;
        this.fecha = fecha;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuncional() {
        return funcional;
    }

    public void setFuncional(int funcional) {
        this.funcional = funcional;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}

