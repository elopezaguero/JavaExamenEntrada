package model;

import java.util.ArrayList;
import java.util.EmptyStackException;

public abstract class Empleado {
    private int id;
    private String nombre;
    private String departamento;
    private double salario;

    public Empleado(int id, String nombre, String departamento, double salario){
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarDetalle(){
        System.out.println("DETALLE DEL EMPLEADO: " +
                "\nId: " + this.id +
                "\nNombre: " + this.nombre +
                "\nDepartamento: " + this.departamento +
                "\nSalario: " + this.salario);
    }

    public abstract Double calcularBono(String evaluacion);
}
