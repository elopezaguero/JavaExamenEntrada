import model.Desarrollador;
import model.Empleado;
import model.Gerente;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Listado de Lenguajes de programación:
        String[] listaLenguajes = {"Java", "JavaScript", ".Net", "Python", "C++", "C#", "PHP", "Cobol", "HTML"};
        String[] listaEquipo = {"Jose", "Julio", "Pedro", "Jaime", "Jorge",
                                "Cesar", "Sebastian", "Andree", "Giancarlo", "Jameson",
                                "Luiggi", "Freddy", "Flor", "Carlos", "Sotero", "Joaquin", "Sandro", "Julian"};

        //Desarrollador
        ArrayList<String> arrayLP1 = new ArrayList<>();
        ArrayList<String> arrayLP2 = new ArrayList<>();
        ArrayList<String> arrayLP3 = new ArrayList<>();
        ArrayList<String> arrayLP4 = new ArrayList<>();
        ArrayList<String> arrayLP5 = new ArrayList<>();

        arrayLP1.add(listaLenguajes[0]);
        arrayLP1.add(listaLenguajes[3]);
        arrayLP1.add(listaLenguajes[4]);
        arrayLP2.add(listaLenguajes[2]);
        arrayLP2.add(listaLenguajes[5]);
        arrayLP3.add(listaLenguajes[3]);
        arrayLP3.add(listaLenguajes[4]);
        arrayLP3.add(listaLenguajes[6]);
        arrayLP3.add(listaLenguajes[7]);
        arrayLP4.add(listaLenguajes[1]);
        arrayLP4.add(listaLenguajes[2]);
        arrayLP4.add(listaLenguajes[3]);
        arrayLP4.add(listaLenguajes[7]);
        arrayLP4.add(listaLenguajes[8]);
        arrayLP5.add(listaLenguajes[8]);

        Desarrollador desarrollador1 = new Desarrollador(1, "Adrian Bazalar", "DESARROLLO", 5000, arrayLP1);
        desarrollador1.mostrarDetalle();
        Desarrollador desarrollador2 = new Desarrollador(2, "Julio Rodriguez", "DESARROLLO", 4500, arrayLP2);
        desarrollador2.mostrarDetalle();
        Desarrollador desarrollador3 = new Desarrollador(3, "David Serna", "DESARROLLO", 3500, arrayLP3);
        desarrollador3.mostrarDetalle();
        Desarrollador desarrollador4 = new Desarrollador(4, "Jaime Linares", "DESARROLLO", 2900, arrayLP4);
        desarrollador4.mostrarDetalle();
        Desarrollador desarrollador5 = new Desarrollador(5, "Jose Cerron", "DESARROLLO", 2400, arrayLP5);
        desarrollador5.mostrarDetalle();

        //Gerente
        ArrayList<String> arrayPersona1 = new ArrayList<>();
        arrayPersona1.add(listaEquipo[0]);
        arrayPersona1.add(listaEquipo[3]);
        arrayPersona1.add(listaEquipo[4]);
        arrayPersona1.add(listaEquipo[7]);
        arrayPersona1.add(listaEquipo[2]);
        arrayPersona1.add(listaEquipo[1]);
        Gerente gerente1 = new Gerente(6, "Percy Olivares", "GERENCIA", 7000, arrayPersona1);
        gerente1.mostrarDetalle();

        ArrayList<String> arrayPersona2 = new ArrayList<>();
        arrayPersona2.add(listaEquipo[1]);
        arrayPersona2.add(listaEquipo[5]);
        arrayPersona2.add(listaEquipo[6]);
        arrayPersona2.add(listaEquipo[9]);
        arrayPersona2.add(listaEquipo[10]);
        arrayPersona2.add(listaEquipo[11]);
        arrayPersona2.add(listaEquipo[12]);
        arrayPersona2.add(listaEquipo[13]);
        arrayPersona2.add(listaEquipo[14]);
        arrayPersona2.add(listaEquipo[15]);
        Gerente gerente2 = new Gerente(7, "Andres Rivera", "GERENCIA", 6800, arrayPersona2);
        gerente2.mostrarDetalle();
    }
}