/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoprogra;

import java.util.Random;


public class GuiasTuristicos {
    
       private String NomGuia;
    private String [] Idiomas;
    private int Experiencia;
    private int NumID;

    public GuiasTuristicos(int NumID,String NomGuia, String[] Idiomas, int Experiencia) {
        this.NumID=NumID;
        this.NomGuia = NomGuia;
        this.Idiomas = Idiomas;
        this.Experiencia = Experiencia;
    }//Fin del Constrictor


    public String getNomGuia() {
        return NomGuia;
    }

    public void setNomGuia(String NomGuia) {
        this.NomGuia = NomGuia;
    }

    public String[] getIdiomas() {
        return Idiomas;
    }

    public void setIdiomas(String[] Idiomas) {
        this.Idiomas = Idiomas;
    }

    public int getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(int Experiencia) {
        this.Experiencia = Experiencia;
    }

    public int getNumID() {
        return NumID;
    }

    public void setNumID(int NumID) {
        this.NumID = NumID;
    }



        public static int NumID(){
        Random random = new Random();
        return random.nextInt(9000)+1000;
    }//Fin del Static para el numero random
        
public String Mostrar() {
        String info = "Numero ID: " + NumID + "\nNombre: " + NomGuia + "\nAños de experiencia: " + Experiencia + "\nIdiomas: ";
        for (int i = 0; i < Idiomas.length; i++) {
            info += Idiomas[i];
            if (i < Idiomas.length - 1) {
                info += ", ";
            }
        }
        return info;
    }//Fin de la opcion de mostrar

    
    
    
}//Fin de la clase de Guias Turisticos

    

