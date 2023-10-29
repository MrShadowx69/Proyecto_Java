/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogra;

import javax.swing.JOptionPane;

public class AddRemLookTransporte {   
    public Transportes[] Buses;
    public int CantidadDeDestinos;

    
  public AddRemLookTransporte(int CantidadDeDestinos) {
        this.Buses= new Transportes[CantidadDeDestinos];
        CantidadDeDestinos=0;        
    }//Constructor-tamaño
    
    
    public void AddDestino(Transportes Nombre){
        if (CantidadDeDestinos < Buses.length) {
            Buses[CantidadDeDestinos] = Nombre;
            CantidadDeDestinos++;
        }
    }//Fin de AddDestino
    
    public void mostrarDestinos() {
        String listaDeDestinos = "";
        for (int i = 0; i < CantidadDeDestinos; i++) {
            Transportes buses = Buses[i];
            listaDeDestinos += buses.MostrarInfo()+ "\n";
        }//Fin del For

        JOptionPane.showMessageDialog(null, "Lista de Destinos:\n" + listaDeDestinos);
    }//Fin del Mostrar Datos 
    
    
    
    public void deleteDestino(String Nombre){
    boolean FindIT = false;
    int Delete =-1;
        for (int i = 0; i < CantidadDeDestinos; i++) {
            if (Buses[i].getDestinos().equalsIgnoreCase(Nombre)) {
                FindIT = true;
                Delete = i;
            }//Fin de IF interno
        }//Fin del For

        if (FindIT) {
            for (int i = Delete; i < CantidadDeDestinos; i++) {
                Buses[i] = Buses[i+1];
            }//Fin del for 
            Buses[CantidadDeDestinos - 1] = null;
            CantidadDeDestinos--;
            JOptionPane.showMessageDialog(null, "Se ha borrado");
        }//Fin del IF
        else {
        JOptionPane.showMessageDialog(null, "Error");
        }//Fin del Else  
    }//Fin de Delete Empresa
    
    
    public void Modificar(String Nombre){
    int Modificar = -1;
        for (int i = 0; i < CantidadDeDestinos; i++) {
            if (Buses[i].getDestinos().equalsIgnoreCase(Nombre)) {
                Modificar = i;
            }//Fin del IF 
        }//Fin del For
        
        if (Modificar != -1) {
            Transportes Changes = Buses[Modificar];
            int opciones;
            do{
            opciones =Integer.parseInt( JOptionPane.showInputDialog(null, 
                                        "1- Proovedor \n"
                                        + "2- Conductor \n"
                                        + "3- Numero de la trasnporte\n"
                                        + "4- Destino\n"
                                        + "5- Tamaño del transporte\n"
                                        +"6- Salir"));
                            
                switch (opciones) {
                    case 1:
                        String NuevoDeCompañia = JOptionPane.showInputDialog("Dijite el nuevo nombre del proveedor");
                        if (NuevoDeCompañia.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No dijitaste nada");
                        }//Fin del IF NUEVO NOMBRE
                        else{
                        Changes.setCompañia(NuevoDeCompañia);
                        }//Fin del ELSE
                        break;
                    case 2:
                        String NuevoConductor = JOptionPane.showInputDialog("Dijite el nuevo nombre del conductor");
                        if (NuevoConductor.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No dijitaste nada");
                        }//Fin del FI
                        else{
                        Changes.setNomConditor(NuevoConductor);
                        }//Fin del ELSE
                        break;
                    case 3:
                        String NuevoNumeroDeBus = JOptionPane.showInputDialog("Dijite el nuevo numero del transporte");
                        if (NuevoNumeroDeBus.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No dijitaste nada");
                        }//Fin del IF
                        else{
                            int NuevoNumero = Integer.parseInt(NuevoNumeroDeBus);
                            Changes.setNumBus(NuevoNumero);
                        }//Fin del Else
                        break;
                    case 4:
                        String NuevoDestino = JOptionPane.showInputDialog("Dijite el nombre del nuevo destino");
                        if (NuevoDestino.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No dijitaste nada");
                        }//Fin del IF
                        else{
                        Changes.setDestinos(NuevoDestino);
                        }//Fin del ELSE
                        break;
                    case 5:
                        String NuevoTamano = JOptionPane.showInputDialog("Dijite el nuevo tamaño del transporte\n"+"Grnade\n"+"Mediano\n"+"Buseta\n"+"Taxi");
                        if (NuevoTamano.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No dijitaste nada");
                        }//Fin del IF
                        else{
                        Changes.setBusZise(NuevoTamano);
                        }//Fin del ELSE
                        break;
                }//Fin del Switch
            } while (opciones != 6 );//Fin del Do while
            JOptionPane.showMessageDialog(null, "Datos del destino han sido actualizados exitosamente.");
        }//Fin del IF
        
        else {
        JOptionPane.showMessageDialog(null, "El destino con el nombre '" + Nombre + "' no fue encontrada.");
    }//Fin del ELSE
          
    
    }//Fin del Update
    
    
    
    
    
    
    
}//Fin del AddRemLookTransporte

    

