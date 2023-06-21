
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class ServicioCafetera{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
        
    public Cafetera crearCafetera(double capacidadCafetera){
        System.out.println("Creamos una cafetera con capacidad de " + capacidadCafetera + " cc.");
        return new Cafetera(capacidadCafetera, 0);
    }
    
    public Cafetera crearCafetera(){
        System.out.print("Vamos a crear una cafetera, diganos que capacidad desea que tenga? ");
        double capacidadCafetera = input.nextDouble();
        System.out.println("Genial ! creamos una cafetera con esa capacidad");
        return new Cafetera(capacidadCafetera, 0);
    }
    
    public double llenarCafetera(Cafetera cafet){
        System.out.println("\n------ Estamos llenando la cafetera ------");
        cafet.setCantidadActual(cafet.getCapacidadMaxima());
        return cafet.getCantidadActual();
    }

    public void servirCafe(double tamanioTaza, Cafetera cafet){
        System.out.println("------ Estamos sirviendo cafe ------");
        if(cafet.getCantidadActual() >= tamanioTaza){
            System.out.println("Listo! taza llena!");
            cafet.setCantidadActual(cafet.getCantidadActual() - tamanioTaza);
        }else if (cafet.getCantidadActual() > 0){
            System.out.println("Te servimos lo que quedaba de cafe: " + cafet.getCantidadActual());
            cafet.setCantidadActual(0);
        }else{
            System.out.println("No hay nada de cafe, perdon");
            return;
        }
        if(cafet.getCantidadActual() != 0){
            System.out.println("En la cafetera quedan " + cafet.getCantidadActual() + " cc de Cafecito");
        }else{
            System.out.println("En la cafetera no hay mas cafecito");
        }
    }
    
    public void vaciarCafetera(Cafetera cafet){
        System.out.println("\n------ Estamos vaciando la cafetera ------");
        System.out.println("Vaciamos la cafetera porque no tenia buen sabor");
        cafet.setCantidadActual(0.0);
        System.out.println("La cafetera tiene " + cafet.getCantidadActual());
    }
    
    public void agregarCafe(Cafetera cafet, double cantCafe){
        System.out.println("\n------ Estamos agregando cafe ------");
        if(cafet.getCapacidadMaxima() >= (cafet.getCantidadActual()+ cantCafe)){
            System.out.println("Agregamos " + cantCafe + " cc de cafe");
            cafet.setCantidadActual(cantCafe + cafet.getCantidadActual());
            System.out.println("Ahora la cafetera tiene " + cafet.getCantidadActual() + " cc de cafecito");
        }else{
            System.out.println("Ups! la cafetera esta llena con " + cafet.getCantidadActual());
            System.out.println("Sobraron " + (cafet.getCantidadActual() + cantCafe - cafet.getCapacidadMaxima()));
            llenarCafetera(cafet);
        }
    }
    
}

