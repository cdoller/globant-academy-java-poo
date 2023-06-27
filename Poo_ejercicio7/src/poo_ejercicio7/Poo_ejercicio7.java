package poo_ejercicio7;

import Servicio.PersonaServicio;

public class Poo_ejercicio7 {

    public static void main(String[] args) {
        PersonaServicio arrayPersonas[] = new PersonaServicio[4];
        cargarPersonas(arrayPersonas);
        imprimirPersonas(arrayPersonas);
        resultadosPersonas(arrayPersonas);
    }

    public static void cargarPersonas(PersonaServicio[] personas) {
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new PersonaServicio();
            personas[i].crearPersona();
            personas[i].calcularIMC();
            personas[i].esMayorDeEdad();
        }
    }

    public static void imprimirPersonas(PersonaServicio[] personas) {
        System.out.println("--------------------");
        System.out.println("Personas ingresadas:");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Persona N" + (i + 1) + " " + personas[i].imprimirDatosPersona());
        }
        System.out.println("--------------------");
    }

    public static void resultadosPersonas(PersonaServicio[] personas) {
        double acumuladorImc = 0;
        int mayoresEdad = 0, personasBajoPeso = 0, personasPesoIdeal = 0, personasSobrePeso = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].esMayorEdad()) {
                mayoresEdad++;
            }
            acumuladorImc += personas[i].getImc();
            if (personas[i].getImc() < 20) {
                personasBajoPeso++;
            } else if (personas[i].getImc() <= 25) {
                personasPesoIdeal++;
            } else {
                personasSobrePeso++;
            }
        }
        System.out.println("");
        System.out.println("------Resultados------");
        System.out.println("Personas con sobrepeso: " + personasSobrePeso);
        System.out.println("Personas con peso ideal: " + personasPesoIdeal);
        System.out.println("Personas con bajopeso: " + personasBajoPeso);
        System.out.println("El promedio del IMC de las personas: " + acumuladorImc / personas.length);
        System.out.println("La cantidad de mayores de edad: " + mayoresEdad);
    }

}
