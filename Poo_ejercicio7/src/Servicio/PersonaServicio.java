/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    private Persona persona = new Persona();

    public void crearPersona() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("--------------------");
        System.out.print("Nombre: ");
        persona.setNombre(input.nextLine());
        System.out.print("Edad: ");
        persona.setEdad(input.nextInt());
        System.out.print("Sexo: H-Hombre / M-Mujer / O-Otro");
        persona.setSexo(ingresarSexoValido());
        System.out.print("Peso: ");
        persona.setPeso(input.nextDouble());
        System.out.print("Altura(cm): ");
        persona.setAltura(input.nextDouble());
        System.out.println("--------------------");
    }
    
    public int calcularIMC(){
        double imc = persona.getPeso() / (Math.pow(persona.getAltura()/100, 2));
        System.out.println("El IMC de " + persona.getNombre() + " es : " + imc);
        persona.setImc(imc);
        if(persona.getImc()<20){
            return -1;
        }else if(persona.getImc()<=25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(){
        persona.setMayorEdad(persona.getEdad()>=18);
        return persona.isMayorEdad();
    }

    public String imprimirDatosPersona(){
        return persona.toString();
    }
    
    public static String ingresarSexoValido() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String sexo;
        sexo = input.nextLine();
        while (!sexo.matches("[HMO]")) {
            System.out.println("El caracter de Sexo no es valido. Recuerde H-M-O unicamente.");
            sexo = input.nextLine();
        }
        return sexo;
    }
    
    public double getImc(){
        return persona.getImc();
    }
    
    public boolean esMayorEdad(){
        return persona.isMayorEdad();
    }
}
