package poo_ejercicio12;

import Servicio.PersonaServicio;

public class Poo_ejercicio12 {
    
    public static void main(String[] args) {
        PersonaServicio personaServ = new PersonaServicio();
        personaServ.crearPersona();
        personaServ.calcularEdad();
        if(!personaServ.menorQue(18)){
            System.out.println("Es mayor de edad, tiene " + personaServ.calcularEdad());
        }else{
            System.out.println("Es menor de edad, tiene " + personaServ.calcularEdad());
        }

        System.out.println(personaServ.mostrarPersona());
    }
    
}
