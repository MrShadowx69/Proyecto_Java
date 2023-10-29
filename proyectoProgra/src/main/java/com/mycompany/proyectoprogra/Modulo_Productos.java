
package com.mycompany.proyectoprogra;

import javax.swing.JOptionPane;

public class Modulo_Productos {
    // atributos del modulo productos
    private Habitacion[] habitaciones;
    private Servicio[] servicios;
    private int cantidadHabitaciones;
    private int cantidadServicios;

    //constructor donde se inicializan la capacidad maxima de habitaciones y servicios.
    public Modulo_Productos (int capacidadMaximaHabitaciones, int capacidadMaximaServicios) {
        habitaciones = new Habitacion[capacidadMaximaHabitaciones];
        servicios = new Servicio[capacidadMaximaServicios];
        cantidadHabitaciones = 0;
        cantidadServicios = 0;
    }

    //metodo para agregar las habitaciones al hotel.
    public void agregarHabitacion(Habitacion habitacion) {
        if (cantidadHabitaciones < habitaciones.length) {
            habitaciones[cantidadHabitaciones] = habitacion;
            cantidadHabitaciones++;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede agregar más habitaciones. La lista está llena.");
        }
    }

    //metodo para agregar servicios al hotel.
    public void agregarServicio(Servicio servicio) {
        if (cantidadServicios < servicios.length) {
            servicios[cantidadServicios] = servicio;
            cantidadServicios++;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede agregar más servicios. La lista está llena.");
        }
    }

    //metodo para mostrar las habitaciones en orden
    public void mostrarHabitaciones() {
        String mensaje = "Catálogo de habitaciones:\n";
        for (int i = 0; i < cantidadHabitaciones; i++) {
            mensaje += habitaciones[i].mostrar_Info_Habitacion() + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    //metodo para mostrar los servicios que dispone el hotel
    public void mostrarServicios() {
        String mensaje = "Catálogo de servicios:\n";
        for (int i = 0; i < cantidadServicios; i++) {
            mensaje += servicios[i].mostrar_Info_Servicios()+ "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    //forma de reservacion de las habitaciones mediante el numero de la habitacion.
     public void reservarHabitacion(int numeroHabitacion) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numeroHabitacion) {
                if (!habitacion.isOcupada()) {
                    habitacion.reservar();
                    JOptionPane.showMessageDialog(null, "Habitación " + numeroHabitacion + " reservada exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "La habitación " + numeroHabitacion + " ya está ocupada o reservada.");
                }
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Habitación " + numeroHabitacion + " no encontrada.");
    }
    //metodo para mostrar cuales habitaciones estan disponibles y cuales no estan disponibles.
      public void mostrarEstadoHabitaciones() {
        String habitacionesDisponibles = "Habitaciones disponibles:\n";
        String habitacionesReservadas = "Habitaciones reservadas:\n";

        for (Habitacion habitacionn : habitaciones) {
            if (!habitacionn.isOcupada()) {
                habitacionesDisponibles += "N° " + habitacionn.getNumero() + " - " + habitacionn.getTipo() + "\n";
            } else {
                habitacionesReservadas += "N° " + habitacionn.getNumero() + " - " + habitacionn.getTipo() + "\n";
            }
            
        }

        JOptionPane.showMessageDialog(null, habitacionesDisponibles + "\n" + habitacionesReservadas);
    }

 
 
}

