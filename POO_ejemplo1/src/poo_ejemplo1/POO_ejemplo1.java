/*
 * Crea un método void que reciba un objeto tipo persona como parámetro y utilice el get para
mostrar sus atributos. Llama ese método desde el main.
 */
package poo_ejemplo1;
import Entidad.Persona;
import PersonaService.PersonaService;

public class POO_ejemplo1 {

    public static void main(String[] args) {
        Persona primeraPersona = new Persona("carlos", "oller", 37666999);
        Persona segundaPersona = new Persona();
        segundaPersona.setNombre("Daniel");
        System.out.println(segundaPersona.toString());
        segundaPersona.setRaza("Marciano");
        System.out.println(primeraPersona.toString());
        System.out.println(segundaPersona.toString());
        System.out.println("-----------");
        
        PersonaService terceraPersona = new PersonaService();
        terceraPersona.mostrarPersona(primeraPersona);
    }
    
}
