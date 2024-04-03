package model;

import interfaces.EvaluacionDesempeno;

import java.util.ArrayList;

public class Gerente extends Empleado implements EvaluacionDesempeno {
    private ArrayList<String> equipo;
    private String evaluacion = "";

    public Gerente(int id, String nombre, String departamento, double salario, ArrayList<String> equipo) {
        super(id, nombre, departamento, salario);
        this.equipo = equipo;
    }

    public void agregarEquipo(String equipoAdd){
        equipo.add(equipoAdd);
    }

    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.println("Lista de Empleados a Cargo");
        for(int i = 0; i < equipo.size(); i++){
            System.out.println((i+1) + ": " + equipo.get(i));
        }
        System.out.println("Cantidad de Empleados a Cargo: " + equipo.size());
        System.out.println("Evaluacion de Desempeno: " + evaluarDesempeno(equipo.size()));
        System.out.println("Bono: " + calcularBono(evaluarDesempeno(equipo.size())));
        System.out.println("---------------------------------------------------------------");
    }

    @Override
    public String evaluarDesempeno(int cantidadEmple) {
        cantidadEmple = equipo.size();
        if (cantidadEmple >= 10){
            evaluacion = "Bueno";
        } else if (cantidadEmple >= 5 && cantidadEmple < 10){
            evaluacion = "Regular";
        } else if (cantidadEmple < 5) {
            evaluacion = "Malo";
        }
        return evaluacion;
    }

    @Override
    public Double calcularBono(String vEvaluacion) {
        double montoBono = 0;
        if (vEvaluacion == "Bueno"){
            montoBono = getSalario() * 1;
        }else if (vEvaluacion == "Regular"){
            montoBono = getSalario() * 0.5;
        }else if (vEvaluacion == "Malo"){
            montoBono = 0;
        }
        return montoBono;
    }
}
