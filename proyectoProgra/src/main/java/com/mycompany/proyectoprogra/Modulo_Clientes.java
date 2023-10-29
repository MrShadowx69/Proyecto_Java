
package com.mycompany.proyectoprogra;

import javax.swing.JOptionPane;


public class Modulo_Clientes {
    //atributos del modulo cientes
    private Clientes[] clientes;
    private int cantidadClientes;
    
    //constructor en el que se digitan la capacidad de personas que caben dentro del hotel...
    public Modulo_Clientes(int capacidadClientes) {
        
        clientes = new Clientes[capacidadClientes];
        cantidadClientes=0;
     
    }
    
    //forma de agregar clientes al sistema.
    public void agregarClientes(Clientes cliente){
        if (cantidadClientes< clientes.length) {
            clientes[cantidadClientes]=cliente;
            cantidadClientes++;
        }else{
            JOptionPane.showMessageDialog(null, "No se pueden agregar mas clientes...");
        }
        
 
    }
    //metodo de actualizar los clientes igual que en empleados. 
    public void actualizarCliente(String cedula , String nuevoNombre , String nuevaDireccion , int nuevoNumero , String nuevoCorreo){
        boolean encontrado = false;
        for (int i = 0; i < cantidadClientes ; i++) {
            if (clientes[i].getCedula().equalsIgnoreCase(cedula)) {
                encontrado=true;
                
                clientes[i].setNombre(nuevoNombre);
                clientes[i].setDireccionDomicilio(nuevaDireccion);
                clientes[i].setNumero(nuevoNumero);
                clientes[i].setCorreo(nuevoCorreo);
                break;
            }
  
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado, Porfavor digitar una nueva cedula...");
            
        }
    }
    
    //metodo de mostrar los clientes que estan disponibles en el momento...
    public void mostrarListaClientes(){
        String listaClientes="";
        for (int i = 0; i < cantidadClientes ; i++) {
            
            Clientes cliente = clientes[i];
            listaClientes+= cliente.mostarInfoCliente()+ "\n";
            
        }
        JOptionPane.showMessageDialog(null, "Lista de Clientes: "+listaClientes);
        
        
        
        
    }
    
    
    
}
