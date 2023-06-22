package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {

    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera(double capacidadCafetera) {
        System.out.println("\nCreamos una cafetera con capacidad de " + capacidadCafetera + " cc.");
        return new Cafetera(capacidadCafetera, 0);
    }

    public Cafetera crearCafetera() {
        System.out.print("\nVamos a crear una cafetera, diganos que capacidad desea que tenga? ");
        double capacidadCafetera = input.nextDouble();
        System.out.println("Genial ! creamos una cafetera con esa capacidad");
        return new Cafetera(Math.abs(capacidadCafetera), 0);
    }

    public void llenarCafetera(Cafetera cafet) {
        System.out.println("\n------ Estamos llenando la cafetera ------");
        cafet.setCantidadActual(cafet.getCapacidadMaxima());
        System.out.println("Llenamos la cafetera con " + cafet.getCantidadActual());
    }

    public void servirCafe(double tamanioTaza, Cafetera cafet) {
        System.out.println("\n------ Estamos sirviendo cafe ------");
        if (cafet.getCantidadActual() >= tamanioTaza) {
            System.out.println("Listo! taza llena!");
            cafet.setCantidadActual(cafet.getCantidadActual() - tamanioTaza);
        } else if (cafet.getCantidadActual() > 0) {
            System.out.println("Te servimos lo que quedaba de cafe: " + cafet.getCantidadActual());
            cafet.setCantidadActual(0);
        } else {
            System.out.println("No hay mas cafecito, perdon");
        }
    }

    public void vaciarCafetera(Cafetera cafet) {

        System.out.println("\n------ Estamos vaciando la cafetera ------");
        System.out.println("Vaciamos la cafetera porque no tenia buen sabor");
        cafet.setCantidadActual(0.0);
    }

    public void agregarCafe(double cantCafe, Cafetera cafet) {

        System.out.println("\n------ Estamos agregando cafe ------");
        if (cafet.getCapacidadMaxima() >= (cafet.getCantidadActual() + cantCafe)) {
            System.out.println("Agregamos " + cantCafe + " cc de cafe");
            cafet.setCantidadActual(cantCafe + cafet.getCantidadActual());
        } else {
            System.out.println("La cafetera se lleno hasta el tope de " + cafet.getCapacidadMaxima());
            System.out.println("Ups! Sobraron " + (cafet.getCantidadActual() + cantCafe - cafet.getCapacidadMaxima()));
            cafet.setCantidadActual(cafet.getCapacidadMaxima());
        }
    }

    public double cantidadActual(Cafetera cafet) {
        return cafet.getCantidadActual();
    }

    public double capacidadMaxima(Cafetera cafet) {
        return cafet.getCapacidadMaxima();
    }
}
