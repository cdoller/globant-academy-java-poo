package poo_ejercicio2_extra;

import Servicio.PuntoServicio;

public class Poo_ejercicio2_extra {

    public static void main(String[] args) {
        PuntoServicio ps1 = new PuntoServicio();
        PuntoServicio ps2 = new PuntoServicio();
        ps1.crearPunto();
        ps2.crearPunto();

        System.out.println("La distancia entre los puntos es: " + ps1.calcularDistanciaEntrePuntos(ps2));
    }

}
