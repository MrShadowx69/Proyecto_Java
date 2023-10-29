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
public class AddRemLookInventario {
    
    public InventarioCocinaTox[] infoProduC;
 public InventarioCocinaTox[] infoProduT;
 public int TamanoLisCocina;  
 public int TamanoLisToxico; 
 
    public AddRemLookInventario(int Tamano){
    this.infoProduC = new InventarioCocinaTox[Tamano];
    this.infoProduT = new InventarioCocinaTox[Tamano];
    this.TamanoLisCocina = 0;
    this.TamanoLisToxico = 0;
    }//Fin de la opcion para los espacios Productos Cocina
    
    
    public void AddC(InventarioCocinaTox CocinaName){
        if (TamanoLisCocina < infoProduC.length) {
            infoProduC[TamanoLisCocina] = CocinaName;
            TamanoLisCocina++;
        }//Fin del IF
     else {
            System.out.println("Limite de proveedores alcanzado. No se puede agregar más.");
        }//Fin del Else
    }//Fin de la opcion de agregar 
   
       public void AddT(InventarioCocinaTox ToxicoName){
        if (TamanoLisToxico < infoProduT.length) {
            infoProduT[TamanoLisToxico] = ToxicoName;
            TamanoLisToxico++;
        }//Fin del IF
     else {
            System.out.println("Limite de proveedores alcanzado. No se puede agregar más.");
        }//Fin del Else
    }//Fin de la opcion de agregar 
    
    
   public void ShowC(){
       String ListaProductosC= "";
           for (int i = 0; i < TamanoLisCocina; i++) {
           InventarioCocinaTox productosCocina = infoProduC[i];
               if (productosCocina.getOpcionesInvent().equals(OpcionesInvent.Cocina)) {
                ListaProductosC += productosCocina.Mostrar() + "\n";   
               }
       }//Fin del FOR
           JOptionPane.showMessageDialog(null, "Lista de productos:\n" + ListaProductosC);
           }//Fin de la opcion de Mostrar
       
    public void ShowT(){
       String ListaProductosT = "";
           for (int i = 0; i < TamanoLisToxico; i++) {
           InventarioCocinaTox productosToxico = infoProduT[i];
               if (productosToxico.getOpcionesInvent().equals(OpcionesInvent.Toxico)) {
                ListaProductosT += productosToxico.Mostrar() + "\n";   
               }
       }//Fin del FOR
           JOptionPane.showMessageDialog(null, "Lista de productos:\n" + ListaProductosT);
           }//Fin de la opcion de Mostrar
    
    
 public void deleteEmpresaC(String Nombre){
    boolean encontrado = false;
    int Eliminar =-1;
        for (int i = 0; i < TamanoLisCocina; i++) {
            if (infoProduC[i].getNombre().equalsIgnoreCase(Nombre)) {
                encontrado = true;
                Eliminar = i;
            }//Fin de IF interno
        }//Fin del For

        if (encontrado) {
            for (int i = Eliminar; i < TamanoLisCocina; i++) {
                infoProduC[i] = infoProduC[i+1];
            }//Fin del for 
            infoProduC[TamanoLisCocina - 1] = null;
            TamanoLisCocina--;
            JOptionPane.showMessageDialog(null, "Se ha borrado");
        }//Fin del IF
        else {
        JOptionPane.showMessageDialog(null, "Error");
        }//Fin del Else  
    }//Fin de Delete Empresa
    
    
    public void deleteEmpresaT(String Nombre){
    boolean encontrado = false;
    int Eliminar =-1;
        for (int i = 0; i < TamanoLisToxico; i++) {
            if (infoProduT[i].getNombre().equalsIgnoreCase(Nombre)) {
                encontrado = true;
                Eliminar = i;
            }//Fin de IF interno
        }//Fin del For

        if (encontrado) {
            for (int i = Eliminar; i < TamanoLisToxico; i++) {
                infoProduT[i] = infoProduC[i+1];
            }//Fin del for 
            infoProduT[TamanoLisToxico - 1] = null;
            TamanoLisToxico--;
            JOptionPane.showMessageDialog(null, "Se ha borrado");
        }//Fin del IF
        else {
        JOptionPane.showMessageDialog(null, "Error");
        }//Fin del Else  
    }//Fin de Delete Empresa
    
    
    
        public void updateCocina(String Nombre){
    int Modificar = -1;
        for (int i = 0; i < TamanoLisCocina; i++) {
            if (infoProduC[i].getNombre().equalsIgnoreCase(Nombre)) {
                Modificar = i;
            }//Fin del IF 
        }//Fin del For
    
    if (Modificar != -1) {
            InventarioCocinaTox Changes = infoProduC[Modificar];
            int opciones;
            do{
            opciones =Integer.parseInt( JOptionPane.showInputDialog(null, 
                                        "1- Nombre \n"
                                        + "2- salir\n"));
                            
                switch (opciones) {
                    case 1:
                        String NuevoNombre = JOptionPane.showInputDialog("Dijite el nuevo nombre");
                        if (NuevoNombre.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No dijitaste nada");
                        }//Fin del IF NUEVO NOMBRE
                        else{
                        Changes.setNombre(NuevoNombre);
                        }//Fin del ELSE
                        break;
                }//Fin del Switch
            } while (opciones != 2 );//Fin del Do while
            JOptionPane.showMessageDialog(null, "Datos de la empresa actualizados exitosamente.");
        }//Fin del IF
        
        else {
        JOptionPane.showMessageDialog(null, "La empresa con el nombre '" + Nombre + "' no fue encontrada.");
    }//Fin del ELSE
    }//Fin del Update
    
    
    public void updateToxico(String Nombre){
    int Modificar = -1;
        for (int i = 0; i < TamanoLisToxico; i++) {
            if (infoProduT[i].getNombre().equalsIgnoreCase(Nombre)) {
                Modificar = i;
            }//Fin del IF 
        }//Fin del For
    
    if (Modificar != -1) {
            InventarioCocinaTox Changes = infoProduT[Modificar];
            int opciones;
            do{
            opciones =Integer.parseInt( JOptionPane.showInputDialog(null, 
                                        "1- Nombre \n"
                                        + "2- salir\n"));
                            
                switch (opciones) {
                    case 1:
                        String NuevoNombre = JOptionPane.showInputDialog("Dijite el nuevo nombre");
                        if (NuevoNombre.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No dijitaste nada");
                        }//Fin del IF NUEVO NOMBRE
                        else{
                        Changes.setNombre(NuevoNombre);
                        }//Fin del ELSE
                        break;
                }//Fin del Switch
            } while (opciones != 2 );//Fin del Do while
            JOptionPane.showMessageDialog(null, "Datos de la empresa actualizados exitosamente.");
        }//Fin del IF
        
        else {
        JOptionPane.showMessageDialog(null, "La empresa con el nombre '" + Nombre + "' no fue encontrada.");
    }//Fin del ELSE
    }//Fin del Update
    
    
    
    
    
    
    
    
    
    
    
}//Fin de la clase de AddRemLookInventario

    

