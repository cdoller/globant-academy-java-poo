package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {

    private Cafetera cafetera = new Cafetera();
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void setCapacidadCafetera(double capacidadCafetera) {
        System.out.println("\nCreamos una cafetera con capacidad de " + capacidadCafetera + " cc.");
        cafetera.setCapacidadMaxima(capacidadCafetera);
    }

    public void setCapacidadCafetera() {
        System.out.print("\nVamos a crear una cafetera, diganos que capacidad desea que tenga? ");
        cafetera.setCapacidadMaxima(input.nextDouble());
        System.out.println("Genial ! creamos una cafetera con esa capacidad");
    }

    public void llenarCafetera() {
        System.out.println("\n------ Estamos llenando la cafetera ------");
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Llenamos la cafetera con " + cafetera.getCantidadActual());
    }

    public void servirCafe(double tamanioTaza) {
        System.out.println("\n------ Estamos sirviendo cafe ------");
        if (cafetera.getCantidadActual() >= tamanioTaza) {
            System.out.println("Listo! taza llena!");
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanioTaza);
        } else if (cafetera.getCantidadActual() > 0) {
            System.out.println("Te servimos lo que quedaba de cafe: " + cafetera.getCantidadActual());
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("No hay mas cafecito, perdon");
        }
    }

    public void vaciarCafetera() {

        System.out.println("\n------ Estamos vaciando la cafetera ------");
        System.out.println("Vaciamos la cafetera porque no tenia buen sabor");
        cafetera.setCantidadActual(0.0);
    }

    public void agregarCafe(double cantCafe) {

        System.out.println("\n------ Estamos agregando cafe ------");
        if (cafetera.getCapacidadMaxima() >= (cafetera.getCantidadActual() + cantCafe)) {
            System.out.println("Agregamos " + cantCafe + " cc de cafe");
            cafetera.setCantidadActual(cantCafe + cafetera.getCantidadActual());
        } else {
            System.out.println("La cafetera se lleno hasta el tope de " + cafetera.getCapacidadMaxima());
            System.out.println("Ups! Sobraron " + (cafetera.getCantidadActual() + cantCafe - cafetera.getCapacidadMaxima()));
            cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        }
    }

    public double cantidadActual() {
        return cafetera.getCantidadActual();
    }

    public double capacidadMaxima() {
        return cafetera.getCapacidadMaxima();
    }
}
