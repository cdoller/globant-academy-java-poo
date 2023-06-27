package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class CadenaServicio{
    Cadena cadena = new Cadena();
    
    public void crearFrase(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        cadena.setFrase(input.nextLine());
        cadena.setLongitud(cadena.getFrase().length());
        System.out.println("La longitud de la frase es: " + cadena.getLongitud());
    }
    
    public int contarVocales(){
        int cantVocales = 0;
        for(int i=0; i<cadena.getLongitud(); i++){
            if(cadena.getFrase().substring(i, i+1).matches("[AEIOUaeiou]")){
                cantVocales++;
            }
        }
        return cantVocales;
    }
    
    public void invertirFrase(){
        String fraseInvertida = "";
        for(int i=cadena.getLongitud(); i>0 ; i--){
            fraseInvertida = fraseInvertida.concat(cadena.getFrase().substring(i-1, i));
        }
        cadena.setFrase(fraseInvertida);
    }
    
    public int vecesRepetido(String letra){
        int cantVeces = 0;
        for(int i=0; i<cadena.getLongitud(); i++){
            if(cadena.getFrase().substring(i, i+1).equals(letra)){
                cantVeces++;
            }
        }
        return cantVeces;
    }
    
    public void compararFrase(String frase){
        if(frase.length()>cadena.getLongitud()){
            System.out.println("La nueva frase tiene MAS caracteres");
        }else if(frase.length()==cadena.getLongitud()){
            System.out.println("Ambas cadenas tienen la misma longitud");
        }else{
            System.out.println("La nueva frase tiene MENOS caracteres");
        }
    }
    
    public void unirFrases(String frase){
        cadena.setFrase(cadena.getFrase().concat(frase));
        cadena.setLongitud(cadena.getFrase().length());
    }
    
    public void reemplazar(String letra, String letraReemplazo){
        cadena.setFrase(cadena.getFrase().replaceAll(letra, letraReemplazo));
        cadena.setLongitud(cadena.getFrase().length());
    }
    
    public boolean contiene(String letra){
        return cadena.getFrase().contains(letra);
    }

    @Override
    public String toString() {
        return "{" + cadena.toString() + '}';
    }



}

