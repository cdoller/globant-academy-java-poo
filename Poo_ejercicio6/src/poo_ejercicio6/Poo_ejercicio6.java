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
import java.util.Scanner;

public class Poo_ejercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ServicioCafetera serviceCafetera = new ServicioCafetera();
        Cafetera nespresso = serviceCafetera.crearCafetera();
        int opcionMenu;

        do {
            imprimirMenu(serviceCafetera, nespresso);
            System.out.print("Ingrese una opcion: ");
            opcionMenu = input.nextInt();
            switch (opcionMenu) {
                case 1:
                    serviceCafetera.llenarCafetera(nespresso);
                    break;
                case 2:
                    serviceCafetera.vaciarCafetera(nespresso);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de cafe que desea en su taza: ");
                    serviceCafetera.servirCafe(input.nextDouble(), nespresso);
                    break;
                case 4:
                    System.out.print("Ingrese la cantidad de cafe que desea agregar a la cafetera: ");
                    serviceCafetera.agregarCafe(input.nextDouble(), nespresso);
                    break;
                case 5:
                    System.out.println("Adios! Gracias por usar nuestra Nespresso!");
                    break;
                default:
                    System.out.println("Opcion NO Valida, ingrese nuevamente.");
            }
        } while (opcionMenu != 9);
    }

    public static void imprimirMenu(ServicioCafetera cafeteraServ, Cafetera cafetera){
        System.out.println("------------------------------");
        System.out.println("--------MENU Nespresso--------");
        System.out.println("-Cantidad Cafe: [ " + cafeteraServ.cantidadActual(cafetera) + " / " + cafeteraServ.capacidadMaxima(cafetera) + " ]");
        System.out.println("1) Llenar Cafetera");
        System.out.println("2) Vaciar Cafetera");
        System.out.println("3) Servir Taza");
        System.out.println("4) Agregar Cafe");
        System.out.println("9) SALIR");
        System.out.println("------------------------------");
    }
}
