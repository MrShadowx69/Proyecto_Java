/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author mateorincongonzalez
 */
public class AddRemLookGuias {
    public GuiasTuristicos[] infoGuias;
    public int CantidadGuias;
    
    public AddRemLookGuias(int CantidadGuias){
    this.infoGuias = new GuiasTuristicos[CantidadGuias];
    CantidadGuias = 0;
    }//Fin del arreglo - Arreglo creado para regular la cantidad de espacios en el arreglo
    
    public void AddGuias(GuiasTuristicos Nombre){
        if (CantidadGuias < infoGuias.length) {
            infoGuias[CantidadGuias] = Nombre;
            CantidadGuias++;
        }//Fin del IF
        else{
        JOptionPane.showMessageDialog(null, "Espacio lleno");
        }//Fin del Else
    }//Fin de AddGuias
    
    public void MostrarGuias(){
    String ListaDeGuias = "";
        for (int i = 0; i < CantidadGuias; i++) {
            GuiasTuristicos guias = infoGuias[i];
            ListaDeGuias += guias.Mostrar()+ "\n" ;
        }//Fin del FOR
        JOptionPane.showMessageDialog(null, "Lista de guias turisticos:\n\n" + ListaDeGuias);
    }//Fin de mostrae Guias
    
    
    public void Delete(int NumID){
    boolean FindIT = false;
    int Borrar = -1;
        for (int i = 0; i < CantidadGuias; i++) {
            if (infoGuias[i].getNumID()==NumID) {
             FindIT = true;
             Borrar = i;
            }//Fin del IF para encontrar el Codigo ID
        }//Fin del For parra recorrer el arreglo
        if (FindIT) {
            for (int i = Borrar; i < CantidadGuias; i++) {
                infoGuias[i] = infoGuias[i+1];
            }//Fin del For
            infoGuias[CantidadGuias - 1] = null;
            CantidadGuias -- ;
            JOptionPane.showMessageDialog(null, "Se ha borrado");
        }//Fin del IF
        else {
        JOptionPane.showMessageDialog(null, "Error");
        }//Fin del Else  
    }//Fin del modulo de Eliminar un 
    
    
    public void update(int numID){
    int Modificar = -1;
        for (int i = 0; i < CantidadGuias; i++) {
            if (infoGuias[i].getNumID() == numID) {
                Modificar = i;
            }//Fin del IF 
        }//Fin del For
        
        if (Modificar != -1) {
            GuiasTuristicos Changes = infoGuias[Modificar];
            int opciones;
            do{
            opciones =Integer.parseInt( JOptionPane.showInputDialog(null, 
                                        "1- Nombre \n"
                                        + "2- Años de experiencia\n"
                                        + "3- Idiomas\n"
                                        +"4- Salir"));
                            
                switch (opciones) {
                    case 1:
                        String NuevoNombre = JOptionPane.showInputDialog("Digite el nuevo nombre");
                        if (NuevoNombre.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No digitaste nada");
                        }//Fin del IF NUEVO NOMBRE
                        else{
                        Changes.setNomGuia(NuevoNombre);
                        }//Fin del ELSE
                        break;
                    case 2:
                        String NuevoAnos = JOptionPane.showInputDialog("Digite el nuevo numero de años de experiencia");
                        if (NuevoAnos.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No digitaste nada");
                        }//Fin del IF
                        else{
                            int NuevoNumero = Integer.parseInt(NuevoAnos);
                            Changes.setExperiencia(NuevoNumero);
                        }//Fin del Else
                        break;
                    case 3:
                        String[] ArregloIdiomas = new String[3]; // Creacion del arreglo para preguntar solo 3 veces los idiomas 
                                             for (int i = 0; i < 3; i++) {
                                                 String idioma =JOptionPane.showInputDialog("Digita los idiomas habiles "+(i+1)+"\nDeja en blanco para salir");
                                                 Changes.setIdiomas(ArregloIdiomas);
                                                 if (idioma.isEmpty()) {
                                                     break;
                                                 }//Fin del IF
                                                 ArregloIdiomas[i] = idioma;
                                             }//Fin del FOR
                                             if (ArregloIdiomas[2] != null) {
                                                 JOptionPane.showMessageDialog(null,"Limite de idiomas es de 3");
                                             }//Fin del IF de advertencia si se pasa de 3
                                             break;
                }//Fin del Switch
            } while (opciones != 4 );//Fin del Do while
            JOptionPane.showMessageDialog(null, "Datos del guia actualizados exitosamente.");
        }//Fin del IF
        
        else {
        JOptionPane.showMessageDialog(null, "El Guia con el ID '" + numID + "' no fue encontrado.");
    }//Fin del ELSE
          
    
    }//Fin del Update
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//Fin de la clase AddRemLookGuias

    

