
package com.mycompany.proyectoprogra;


public class Servicio {
    //atributos de clase servicio...
    private String nombre;
    private String codigo;
    private String descripcion;
    private double precio;
    
    
    //constructor...
    public Servicio(String nombre, String codigo, String descripcion, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //getters and setters...
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //forma de mostrar la informacion mas facil en pantalla.
    public String mostrar_Info_Servicios() {
        return "Nombre: " + nombre + "| Código: " + codigo + "| Descripción: "+descripcion+"| Precio: $" + precio;
    }
    
}
