
package com.mycompany.proyectoprogra;

import javax.swing.JOptionPane;


public class Modulo_Ventas {
    
    private Ventas[] ventas;
    private int cantidadVentas;

    public Modulo_Ventas(int maxVentas) {
        ventas = new Ventas[maxVentas];
        cantidadVentas = 0;
    }

    public void agregarVenta(Ventas venta) {
        if (cantidadVentas < ventas.length) {
            ventas[cantidadVentas] = venta;
            cantidadVentas++;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más ventas.");
        }
    }

    public void consultarVentas() {
        String mensaje = "Listado de Ventas:\n";
        for (int i = 0; i < cantidadVentas; i++) {
            mensaje += "Número de Venta: " + ventas[i].getNumeroVenta() + "\n" +
                       "Monto Facturado: " + ventas[i].getMontoFacturado() + "\n" +
                       "Producto: " + ventas[i].getProducto() + "\n"+
                       "Metodo de pago: " + ventas[i].getMetodoPago() + "\n"+
                       "Info del comprador: " + ventas[i].getInformacionComprador() + "\n"+
                       "Info del vendedor: " + ventas[i].getInformacionVendedor() + "\n"+
                       "Fecha de venta: " + ventas[i].getFechaVenta() + "\n";
            mensaje += "\n--------------------------\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    public void consultarVentaEspecifica(int numeroVentaConsulta) {
        boolean ventaEncontrada = false;
        for (int i = 0; i < cantidadVentas; i++) {
            if (ventas[i].getNumeroVenta() == numeroVentaConsulta) {
                ventaEncontrada = true;
                String detallesVenta = "DETALLES DE LA VENTA:\n" +
                       "Número de Venta: " + ventas[i].getNumeroVenta() + "\n" +
                       "Monto Facturado: " + ventas[i].getMontoFacturado() + "\n" +
                       "Producto: " + ventas[i].getProducto() + "\n"+
                       "Metodo de pago: " + ventas[i].getMetodoPago() + "\n"+
                       "Info del comprador: " + ventas[i].getInformacionComprador() + "\n"+
                       "Info del vendedor: " + ventas[i].getInformacionVendedor() + "\n"+
                       "Fecha de venta: " + ventas[i].getFechaVenta() + "\n";
            detallesVenta += "\n--------------------------\n";
                                      
                JOptionPane.showMessageDialog(null, detallesVenta);
                break;
            }
        }
        if (!ventaEncontrada) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna venta con ese número.");
        }
    }
    
     public void eliminarVenta(int numeroVentaEliminar) {
        int VentaEncontrada = -1;
        for (int i = 0; i < cantidadVentas; i++) {
            if (ventas[i].getNumeroVenta() == numeroVentaEliminar) {
                VentaEncontrada = i;
                break;
            }
        }

        if (VentaEncontrada != -1) {
            for (int i = VentaEncontrada; i < cantidadVentas - 1; i++) {
                ventas[i] = ventas[i + 1];
            }
            ventas[cantidadVentas - 1] = null;
            cantidadVentas--;

            JOptionPane.showMessageDialog(null, "Venta eliminada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna venta con ese número.");
        }
    }
     
   public void actualizarVenta(int numeroVentaActualizar, double nuevomontoFacturado, String nuevoProducto, String nuevoMetodoPago, String nuevaInformacionComprador, String nuevaInformacionVendedor, String nuevaFechaVenta) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadVentas; i++) {
           if (ventas[i].getNumeroVenta() == numeroVentaActualizar) {
              encontrado = true;

            ventas[i].setMontoFacturado(nuevomontoFacturado);
            ventas[i].setProducto(nuevoProducto); 
            ventas[i].setMetodoPago(nuevoMetodoPago);
            ventas[i].setInformacionComprador(nuevaInformacionComprador);
            ventas[i].setInformacionVendedor(nuevaInformacionVendedor);
            ventas[i].setFechaVenta(nuevaFechaVenta);
            JOptionPane.showMessageDialog(null, "Venta actualizada exitosamente.");
            break;
        }
    }
    if (!encontrado) {
        JOptionPane.showMessageDialog(null, "No se encontró ninguna venta con ese número.");
    }
}
   
}
