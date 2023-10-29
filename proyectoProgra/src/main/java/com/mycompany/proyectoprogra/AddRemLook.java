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
public class AddRemLook {
    
     public Empresa[] info;
    public int NumEmpresas;
    
    
    
    
    public AddRemLook(int capacidadMax) {
        this.info= new Empresa[capacidadMax];
        NumEmpresas=0;        
    }//Constructor-tamaño
    
    
    public void AddEmpresa (Empresa empresa){
        if (NumEmpresas< info.length) {
            info[NumEmpresas] = empresa;
            NumEmpresas++;
        }//Fin del IF 
        else{
       JOptionPane.showMessageDialog(null, "Espacio lleno");
        }//Fin del else
    }//Fin de Add Empresa
    
    public void deleteEmpresa(String Nombre){
    boolean encontrado = false;
    int Eliminar =-1;
        for (int i = 0; i < NumEmpresas; i++) {
            if (info[i].getNombre().equalsIgnoreCase(Nombre)) {
                encontrado = true;
                Eliminar = i;
            }//Fin de IF interno
        }//Fin del For

        if (encontrado) {
            for (int i = Eliminar; i < NumEmpresas; i++) {
                info[i] = info[i+1];
            }//Fin del for 
            info[NumEmpresas - 1] = null;
            NumEmpresas--;
            JOptionPane.showMessageDialog(null, "Se ha borrado");
        }//Fin del IF
        else {
        JOptionPane.showMessageDialog(null, "Error");
        }//Fin del Else  
    }//Fin de Delete Empresa
    
    
    public void mostrarEmpresas() {
        String ListaDeEmpresas = "";

        for (int i = 0; i < NumEmpresas; i++) {
            Empresa company = info[i];
            ListaDeEmpresas +=  company.DatosEmpresa()+"\n";
        }//Fin del For

        JOptionPane.showMessageDialog(null, "Lista de empleados:\n" + ListaDeEmpresas);
    }//Fin Del Mostra Empresas
    
    public void update(String Nombre){
    int Modificar = -1;
        for (int i = 0; i < NumEmpresas; i++) {
            if (info[i].getNombre().equalsIgnoreCase(Nombre)) {
                Modificar = i;
            }//Fin del IF 
        }//Fin del For
        
        if (Modificar != -1) {
            Empresa Changes = info[Modificar];
            int opciones;
            do{
            opciones =Integer.parseInt( JOptionPane.showInputDialog(null, 
                                        "1- Nombre \n"
                                        + "2- Producto \n"
                                        + "3- Numero\n"
                                        + "4- Correo\n"
                                        + "5- Contacto\n"
                                        +"6- Salir"));
                            
                switch (opciones) {
                    case 1:
                        String NuevoNombre = JOptionPane.showInputDialog("Digite el nuevo nombre");
                        if (NuevoNombre.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No dijitaste nada");
                        }//Fin del IF NUEVO NOMBRE
                        else{
                        Changes.setNombre(NuevoNombre);
                        }//Fin del ELSE
                        break;
                    case 2:
                        String NuevoProducto = JOptionPane.showInputDialog("Digite el nuevo Poducto");
                        if (NuevoProducto.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No digitaste nada");
                        }//Fin del FI
                        else{
                        Changes.setTypeProducto(NuevoProducto);
                        }//Fin del ELSE
                        break;
                    case 3:
                        String NuevoNumeroSTR = JOptionPane.showInputDialog("Digite el nuevo numero");
                        if (NuevoNumeroSTR.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No digitaste nada");
                        }//Fin del IF
                        else{
                            int NuevoNumero = Integer.parseInt(NuevoNumeroSTR);
                            Changes.setNumero(NuevoNumero);
                        }//Fin del Else
                        break;
                    case 4:
                        String NuevoCorreo = JOptionPane.showInputDialog("Digite el nuevo Correo");
                        if (NuevoCorreo.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No digitaste nada");
                        }//Fin del IF
                        else{
                        Changes.setCorreo(NuevoCorreo);
                        }//Fin del ELSE
                        break;
                    case 5:
                        String NuevoContacto = JOptionPane.showInputDialog("Digite el nuevo Nombre a contactar");
                        if (NuevoContacto.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No digitaste nada");
                        }//Fin del IF
                        else{
                        Changes.setContacto(NuevoContacto);
                        }//Fin del ELSE
                        break;
                }//Fin del Switch
            } while (opciones != 6 );//Fin del Do while
            JOptionPane.showMessageDialog(null, "Datos de la empresa actualizados exitosamente.");
        }//Fin del IF
        
        else {
        JOptionPane.showMessageDialog(null, "La empresa con el nombre '" + Nombre + "' no fue encontrada.");
    }//Fin del ELSE
          
    
    }//Fin del Update
    
    
    
    
    
    
    
    
    
}//Fin de la clase AddRemLook

    

