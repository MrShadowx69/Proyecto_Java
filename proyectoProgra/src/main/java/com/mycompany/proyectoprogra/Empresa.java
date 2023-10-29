/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogra;


public class Empresa {
    
    private String Nombre;
    private String TypeProducto;
    private int Numero;
    private String Correo;
    private String Contacto;

    public Empresa(String Nombre, String TypeProducto, int Numero, String Correo, String Contacto) {
        this.Nombre = Nombre;
        this.TypeProducto = TypeProducto;
        this.Numero = Numero;
        this.Correo = Correo;
        this.Contacto = Contacto;
    }//Inicialisacion en 0 o Vacio
    
/*
    public Empresa() {
        this.Nombre="";
        this.TypeProducto="";
        this.Numero=0;
        this.Correo="";
        this.Contacto="";
    }//Icializacion en espacios vacios de STRIN y numeros 0
  */  
   
    public String DatosEmpresa(){
    return "Nombre: "+Nombre+"\nProducto: "+TypeProducto+"\nNumero: "+Numero+"\nCorreo: "+Correo+"\nAgente a contactar: "+Contacto+"\n\n";   
    }//Fin de mostrar
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTypeProducto() {
        return TypeProducto;
    }

    public void setTypeProducto(String TypeProducto) {
        this.TypeProducto = TypeProducto;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }
    
    
    
    
}
