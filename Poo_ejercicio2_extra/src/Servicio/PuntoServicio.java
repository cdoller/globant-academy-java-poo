
package Servicio;

import Entidad.Punto;
import java.util.Scanner;

public class PuntoServicio{
    Punto punto;
    
    public PuntoServicio(){
        punto = new Punto();
    }
    
    public Punto getPunto(){
        return punto;
    }
    
    public void setPunto(Punto punto){
        this.punto = punto;
    }
    
    public void crearPunto(){
        Scanner input = new Scanner(System.in);
        System.out.print("Coordenada X: ");
        punto.setX(input.nextInt());
        System.out.print("Coordenada Y: ");
        punto.setY(input.nextInt());
    }
            
    public double calcularDistanciaEntrePuntos(PuntoServicio p1){
        return Math.sqrt(Math.pow(p1.getPunto().getX()-punto.getX(), 2) + Math.pow(p1.getPunto().getY()-punto.getY(), 2));
    }
    
}
