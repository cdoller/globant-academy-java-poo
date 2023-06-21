/*
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package poo_ejercicio6;

import Entidad.Cafetera;
import Servicio.ServicioCafetera;

public class Poo_ejercicio6 {

    public static void main(String[] args) {
        ServicioCafetera serviceCafetera = new ServicioCafetera();
        
        Cafetera nespresso = serviceCafetera.crearCafetera(500.0);

        System.out.println("La cafetera se lleno con " + serviceCafetera.llenarCafetera(nespresso)); // llenamos la cafetera

        System.out.println("\nCliente 1: ");
        serviceCafetera.servirCafe(200, nespresso); // taza llena
        System.out.println("Cliente 2: ");
        serviceCafetera.servirCafe(200, nespresso); // taza llena
        System.out.println("Cliente 3: ");
        serviceCafetera.servirCafe(200, nespresso); // media taza = 100cc
        System.out.println("Cliente 4: ");
        serviceCafetera.servirCafe(200, nespresso); // no le podemos servir nada
        
        serviceCafetera.vaciarCafetera(nespresso); // vaciamos la cafetera
        serviceCafetera.agregarCafe(nespresso, 250); // agregamos 250cc
        serviceCafetera.agregarCafe(nespresso, 350); // agregamos 250cc
        serviceCafetera.agregarCafe(nespresso, 100); // no se puede agregar mas, esta llena
    }
    
}
