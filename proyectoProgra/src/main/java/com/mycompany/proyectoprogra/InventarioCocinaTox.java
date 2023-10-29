/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogra;


public class InventarioCocinaTox {
    
private OpcionesInvent OpcionesInvent;
private String Nombre;

    public InventarioCocinaTox(OpcionesInvent OpcionesInvent, String Nombre) {
        this.OpcionesInvent = OpcionesInvent;
        this.Nombre = Nombre;
    }//Fin del constructor

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public OpcionesInvent getOpcionesInvent() {
        return OpcionesInvent;
    }

    public void setOpcionesInvent(OpcionesInvent OpcionesInvent) {
        this.OpcionesInvent = OpcionesInvent;
    }
            
    public String Mostrar(){
    return "Tipo: "+OpcionesInvent+"\nNompre: "+Nombre;
    }//Fin de la opcion mostrar
    
        
        
    
}
