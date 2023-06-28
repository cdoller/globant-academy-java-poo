package poo_ejercicio9;

import Servicio.MatematicaServicio;

public class Poo_ejercicio9{
    public static void main(String[] args){
        MatematicaServicio mateServ = new MatematicaServicio();
        System.out.println("El mayor de los numeros es: " + mateServ.devolverMayor());
        System.out.println("La potencia: " + mateServ.devolverMayor() + "^" + mateServ.devolverMenor() + " = " + mateServ.calcularPotencia());
        System.out.println("Raiz cuadrada: sqrt(" + Math.abs(mateServ.devolverMenor()) + ") = " + mateServ.calculaRaizCuadrada());
        System.out.println(mateServ.toString());
    }
}