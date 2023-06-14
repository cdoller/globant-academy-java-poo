/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejemplo1;
import Entidad.Persona;

public class POO_ejemplo1 {

    public static void main(String[] args) {
        Persona primeraPersona = new Persona("carlos", "oller", 37666999);
        Persona segundaPersona = new Persona();
        segundaPersona.setNombre("Daniel");
        System.out.println(primeraPersona.getNombre() + " " + primeraPersona.getApellido());
        System.out.println(primeraPersona.getDocumentoIdentidad());
        System.out.println(segundaPersona.getNombre());
    }
    
}
