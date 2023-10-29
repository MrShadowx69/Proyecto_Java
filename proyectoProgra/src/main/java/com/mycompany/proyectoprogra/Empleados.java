
package com.mycompany.proyectoprogra;


public class Empleados {
    //atributos del empleado
    private String nombre;
    private String cedula;
    private double salario;
    private String puesto;
    
    //constructor.
    public Empleados(String nombre, String cedula, double salario, String puesto) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.salario = salario;
        this.puesto = puesto;
    }
    //getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    //forma de imprimir la informacion de los empleados de una forma mas facil.
    public String mostrarDatos() {
        return "Nombre: " + nombre + " | Cédula: " + cedula + " | Salario: " + salario + " | Puesto: " + puesto;
    }
    
    
}
