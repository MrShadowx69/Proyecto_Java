
package com.mycompany.proyectoprogra;

public class Ventas {
    
    private int numeroVenta;
    private double montoFacturado;
    private String producto;
    private String metodoPago;
    private String informacionComprador;
    private String informacionVendedor;
    private String fechaVenta;

    public Ventas(int numeroVenta, double montoFacturado, String producto, String metodoPago, String informacionComprador, String informacionVendedor, String fechaVenta) {
        this.numeroVenta = numeroVenta;
        this.montoFacturado = montoFacturado;
        this.producto = producto;
        this.metodoPago = metodoPago;
        this.informacionComprador = informacionComprador;
        this.informacionVendedor = informacionVendedor;
        this.fechaVenta = fechaVenta;
    }

    public int getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(int numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public double getMontoFacturado() {
        return montoFacturado;
    }

    public void setMontoFacturado(double montoFacturado) {
        this.montoFacturado = montoFacturado;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getInformacionComprador() {
        return informacionComprador;
    }

    public void setInformacionComprador(String informacionComprador) {
        this.informacionComprador = informacionComprador;
    }

    public String getInformacionVendedor() {
        return informacionVendedor;
    }

    public void setInformacionVendedor(String informacionVendedor) {
        this.informacionVendedor = informacionVendedor;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    
    
    
}
