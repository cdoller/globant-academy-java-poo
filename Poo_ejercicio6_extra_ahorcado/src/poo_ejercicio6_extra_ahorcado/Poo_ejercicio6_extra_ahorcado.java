package poo_ejercicio6_extra_ahorcado;

import Entidad.Ahorcado;
import java.util.Scanner;

public class Poo_ejercicio6_extra_ahorcado {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el nombre del Jugador: ");
        Ahorcado juegoAhorcado = new Ahorcado(input.next());
        juegoAhorcado.jugar();
    }
}
