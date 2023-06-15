/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entidad;

public class Persona {
    public String nombre;
    public String apellido;
    public int documentoIdentidad;
    public static String raza = "Humano";

    public Persona() {
    }

    public Persona(String nombre, String apellido, int documentoIdentidad) {
        this.nombre = capitalizeFirstLetter(nombre);
        this.apellido = capitalizeFirstLetter(apellido);
        this.documentoIdentidad = documentoIdentidad;
    }
    //GETTERS
    public String getNombre(){return this.nombre;}
    public String getApellido(){return this.apellido;}
    public int getDocumentoIdentidad(){return this.documentoIdentidad;}
    //SETTERS
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setApellido(String apellido){this.apellido = apellido;}
    public void setDocumentoIdentidad(int documentoIdentidad){this.documentoIdentidad = documentoIdentidad;}
    public void setRaza(String raza){this.raza = raza;}
    //STATIC METHODS
    public static String capitalizeFirstLetter(String word) {
        if (word == null || word.isEmpty()) {
            return word; // Devolver la palabra original si es nula o vacía
        } else {
            return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documentoIdentidad=" + documentoIdentidad + "raza=" + raza + '}';
    }

    
    
}
