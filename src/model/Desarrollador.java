package model;

import interfaces.EvaluacionDesempeno;
import java.util.ArrayList;

public class Desarrollador extends Empleado implements EvaluacionDesempeno{
    private ArrayList<String> arraylenguajes;
    private String evaluacion = "";

    public Desarrollador(int id, String nombre, String departamento,
                         double salario, ArrayList<String> arraylenguajes) {
        super(id, nombre, departamento, salario);
        this.arraylenguajes = arraylenguajes;
    }

    public void addLenguajes(String lenguaje){
        arraylenguajes.add(lenguaje);
    }

    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.println("Lenguajes de Programacion:");
        for(int i = 0; i < arraylenguajes.size(); i++){
            System.out.println((i+1) + ": " + arraylenguajes.get(i));
        }
        System.out.println("Cantidad de lenguajes de Programacion: " + arraylenguajes.size());
        System.out.println("Evaluacion de Desempeno: " + evaluarDesempeno(arraylenguajes.size()));
        System.out.println("Bono: " + calcularBono(evaluarDesempeno(arraylenguajes.size())));
        System.out.println("---------------------------------------------------------------");
    }

    @Override
    public String evaluarDesempeno(int cantidadLP) {
        cantidadLP = arraylenguajes.size();
        if (cantidadLP >= 4){
            evaluacion = "Bueno";
        } else if (cantidadLP >= 2 && cantidadLP < 4){
            evaluacion = "Regular";
        } else if (cantidadLP < 2) {
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