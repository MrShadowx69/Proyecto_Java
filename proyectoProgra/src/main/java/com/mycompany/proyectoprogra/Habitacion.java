
package com.mycompany.proyectoprogra;

public class Habitacion {
    //atributos de la clase habitacion
    private int numero;
    private String tipo;
    private double precio;
    private boolean ocupada;
    
    
    //constructor...
    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.ocupada = false;
    }
    
    //getters and setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    
  
    public void reservar() {
        ocupada = true;
    }

    //forma de imprimir la informacion en pantalla mas facil...
    public String mostrar_Info_Habitacion() {
        return "Número: " + numero + "| Tipo: " + tipo + "| Precio: $" + precio;
    }
    
}
