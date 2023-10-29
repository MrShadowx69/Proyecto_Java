
package com.mycompany.proyectoprogra;

import javax.swing.JOptionPane;


public class Modulo_Empleado {
    //atributos del modulo empleados.
    private Empleados[] empleados;
    private int cantidadEmpleados;
    
    //costructor...
    public Modulo_Empleado(int capacidadMaxima) {
        empleados = new Empleados[capacidadMaxima];
        cantidadEmpleados = 0;
    }
    
    //forma de agregar empleados dentro de una arreglo.
    public void agregarEmpleado(Empleados empleadoss) {
        if (cantidadEmpleados < empleados.length) {
            empleados[cantidadEmpleados] = empleadoss;
            cantidadEmpleados++;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede agregar más empleados. La lista está llena.");
        }
    }
    //forma de actualizar los empleados mediante su cedula...
    public void actualizarEmpleado(String cedula, String nuevoNombre, double nuevoSalario, String nuevoPuesto) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadEmpleados; i++) {
            if (empleados[i].getCedula().equalsIgnoreCase(cedula)) {    //el equalsIgnoreCase sirve para comparar 2 cadenas de texto diferentes 
                encontrado = true;
                empleados[i].setNombre(nuevoNombre);
                empleados[i].setSalario(nuevoSalario);
                empleados[i].setPuesto(nuevoPuesto);
                break;
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
        }
    }
    //forma de eliminar los empleados tambien por medio de la cedula.
    public void eliminarEmpleado(String cedula) {
        boolean encontrado = false;
        int Eliminar = -1;
        for (int i = 0; i < cantidadEmpleados; i++) {
            if (empleados[i].getCedula().equalsIgnoreCase(cedula)) {
                encontrado = true;
                Eliminar = i;
                break;
            }
        }

        if (encontrado) {
            for (int i = Eliminar; i < cantidadEmpleados - 1; i++) {
                empleados[i] = empleados[i + 1];
            }
            empleados[cantidadEmpleados - 1] = null;
            cantidadEmpleados--;
            JOptionPane.showMessageDialog(null, "Empleado eliminado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
        }
    }
    //forma de mandar a llamar los empleados registrados dentro del sistema.
    public void mostrarEmpleados() {
        String listaEmpleados = "";

        for (int i = 0; i < cantidadEmpleados; i++) {
            Empleados empleado = empleados[i];
            listaEmpleados += empleado.mostrarDatos() + "\n";
        }

        JOptionPane.showMessageDialog(null, "Lista de empleados:\n" + listaEmpleados);
    }

    
}

    

