/*
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto. // PREGUNTAR DUDA
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package poo_ejercicio2;

import Entidad.Circunferencia;
import Service.CircunferenciaService;


public class Poo_ejercicio2 {

    public static void main(String[] args) {
        CircunferenciaService circunfService = new CircunferenciaService();
        Circunferencia c1 = circunfService.crearCircunferencia();
        System.out.println("El area de la circunferencia es: " + circunfService.area(c1));
        System.out.println("El perimetro de la circunferencia es: " + circunfService.perimetro(c1));
    }
    
}
