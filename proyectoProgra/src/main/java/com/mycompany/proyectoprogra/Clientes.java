
package com.mycompany.proyectoprogra;


public class Clientes {
    //atributos de la clase clientes...
    private String nombre;
    private String cedula;
    private String direccionDomicilio;
    private int numero;
    private String correo;
    
    
    //constructor...
    public Clientes(String nombre, String cedula, String direccionDomicilio, int numero, String correo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccionDomicilio = direccionDomicilio;
        this.numero = numero;
        this.correo = correo;
    }
    
    
    //getters and setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
  
    //metodo de mostrar la informacion mas facil.
    public String mostarInfoCliente(){
        
        return "Nombre: " +nombre+" | Cedula: " +cedula+ " | Dirección: " +direccionDomicilio+ " | Numero de telefono: " +numero+ " | Correo: "+correo;
        
    }
    
    
    
    
    
}
