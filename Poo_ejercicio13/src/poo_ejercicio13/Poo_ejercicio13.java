package poo_ejercicio13;

import Servicio.CursoServicio;

public class Poo_ejercicio13 {

    public static void main(String[] args) {
        CursoServicio cursoServ = new CursoServicio();
        cursoServ.crearCurso();
        System.out.println("La ganancia semanal del curso es: " + cursoServ.calcularGananciaSemanal() + " USD");
    }

}
