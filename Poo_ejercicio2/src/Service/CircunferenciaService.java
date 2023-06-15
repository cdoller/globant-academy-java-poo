/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Circunferencia;
import java.util.Scanner;

public class CircunferenciaService {

    public CircunferenciaService() {

    }

    public Circunferencia crearCircunferencia() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        return new Circunferencia(input.nextDouble());
    }

    public double area(Circunferencia circ) {
        return Math.PI * Math.pow(circ.getRadio(), 2);
    }
    
    public double perimetro(Circunferencia circ){
        return Math.PI * 2 * circ.getRadio();
    }
}
