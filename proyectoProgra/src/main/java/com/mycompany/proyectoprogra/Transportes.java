/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogra;


public class Transportes {
      public String Compañia;
    public String NomConductor; 
    public int NumBus;
    public String Destinos;
    public String BusZise;

    public Transportes(String Compañia,String NomConductor, int NumBus, String Destinos, String BusZise) {
        this.Compañia = Compañia;
        this.NomConductor = NomConductor;
        this.NumBus = NumBus;
        this.Destinos = Destinos;
        this.BusZise = BusZise;
    }//Fin del constructor

    public String getCompañia() {
        return Compañia;
    }

    public void setCompañia(String Compañia) {
        this.Compañia = Compañia;
    }
    public String getNomConditor() {
        return NomConductor;
    }

    public void setNomConditor(String NomConditor) {
        this.NomConductor = NomConditor;
    }

    public int getNumBus() {
        return NumBus;
    }

    public void setNumBus(int NumBus) {
        this.NumBus = NumBus;
    }

    public String getDestinos() {
        return Destinos;
    }

    public void setDestinos(String Destinos) {
        this.Destinos = Destinos;
    }

    public String getBusZise() {
        return BusZise;
    }

    public void setBusZise(String BusZise) {
        this.BusZise = BusZise;
    }
    //Fin de los Getters y Setters 
    
    public String MostrarInfo(){
    return "Compañia: "+Compañia+"\nConductor: "+NomConductor+"\nNumero del transporte: "+
            +NumBus+"\nDestino: "+Destinos+"\nTamaño del transporte: "+BusZise;
    }//Fin de Mostrar Informacion
    
    
}//Fin de la clase Trasporte

    

