package poo_ejercicio11;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

/*
En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
public class Poo_ejercicio11 {

    public static void main(String[] args) {
        //////////////////////
        System.out.println("Usando Local Date");
        //////////////////////
        LocalDate fechaAhora = LocalDate.now();
        System.out.println(fechaAhora);
        LocalDate fechaNacimiento = LocalDate.of(1994,Month.MAY,24);
        System.out.println(fechaNacimiento);
        System.out.println("La edad de la persona es : " + Period.between(fechaNacimiento, fechaAhora).getYears());
    }
}
