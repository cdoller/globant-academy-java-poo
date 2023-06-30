package poo_ejercicio14;

import Servicio.MovilServicio;

public class Poo_ejercicio14 {

    public static void main(String[] args) {
        MovilServicio movilServ = new MovilServicio();
        movilServ.cargarCelular();
        System.out.println(movilServ.toString());
    }
    
}
