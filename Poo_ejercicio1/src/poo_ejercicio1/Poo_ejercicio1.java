/*
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package poo_ejercicio1;

import Entidad.Libro;

public class Poo_ejercicio1 {

    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.setValuesFromUserInput();
        l1.getInfo();
    }

}
