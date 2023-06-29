package Servicio;

import Entidad.Curso;
import java.util.Scanner;
import java.util.Arrays;

public class CursoServicio {

    Curso curso = new Curso();

    public void cargarAlumnos() {
        Scanner input = new Scanner(System.in);
        String[] alumnos = new String[curso.getAlumnos().length];
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            alumnos[i] = input.nextLine();
        }
        curso.setAlumnos(alumnos);
    }

    public void crearCurso() {
        System.out.println("Creamos el curso Analisis Matematico");
        curso.setNombreCurso("Analisis Matematico");
        System.out.println("Cant. Horas por dia: 2");
        curso.setCantHorasPorDia(2);
        System.out.println("Cant. Dias por semana: 3");
        curso.setCantDiasPorSemana(3);
        System.out.println("Turno Tarde");
        curso.setTurno("Tarde");
        System.out.println("Precio por hora: 5 USD");
        curso.setPrecioPorHora(5);
        System.out.println("Ingrese los alumnos: ");
        cargarAlumnos();
    }

    public double calcularGananciaSemanal() {
        return curso.getCantDiasPorSemana() * curso.getCantHorasPorDia() * curso.getAlumnos().length * curso.getPrecioPorHora();
    }
}
