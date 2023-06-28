/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class PersonaServicio {

    private Persona persona = new Persona();

    public void crearPersona() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona: ");
        persona.setNombre(input.nextLine());
        persona.setFechaNacimiento(ingresarFecha_AAAA_MM_DD());
    }

    public int calcularEdad() {
        return Period.between(persona.getFechaNacimiento(), LocalDate.now()).getYears();
    }

    public boolean menorQue(int edad) {
        return calcularEdad()<edad;
    }

    public static LocalDate ingresarFecha_AAAA_MM_DD() {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        System.out.print("Ingrese la fecha de nacimiento (AAAA/MM/DD) ");
        while (true) {
            String fecha = input.nextLine();
            try {
                return LocalDate.parse(fecha, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("El formato de la fecha no es valido, debe ser AAAA/MM/DD");
            }
        }
    }

    public String mostrarPersona() {
        return "PersonaServicio{" + "persona=" + persona.toString() + '}';
    }
}
