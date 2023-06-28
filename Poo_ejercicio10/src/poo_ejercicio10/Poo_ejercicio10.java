/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
*/

package poo_ejercicio10;

import java.util.Arrays;

public class Poo_ejercicio10{
    public static void main(String[] args){
        double[] A = new double[50];
        double[] B = new double[20];
        
        /**
         * relleno el arreglo A con randoms usando el metodo setAll
         * el metodo setAll espera los siguientes argumentos: un arreglo y una funcion lambda
         * la funcion lambda es una función anónima, es decir, una función que no tiene un nombre definido
         * donde i es cada valor del arreglo y generamos un numero random entre 0 y 10
         */
        Arrays.setAll(A, (i)->Math.random()*10); 
        System.out.println(Arrays.toString(A)); 
        
        Arrays.sort(A); // ordeno el arreglo A de menor a mayor
        System.out.println(Arrays.toString(A)); 
        
        /**
         * El metodo arraycopy esta definido de la siguiente forma:
         * System.arraycopy(arregloOrigen, indiceInicialOrigen, arregloDestino, indiceInicialDestino, cantidadElementos)
         * Copio 10 valores de A empezando en el indice 0, hacia B empezando en el indice 0
         */
        System.arraycopy(A, 0, B, 0, 10);
        
        /**
         * Relleno los valores del 10 al 19 con 0.5
         */
        Arrays.fill(B,10,20,0.5);
        
        System.out.println("---------");
        System.out.println("A" + Arrays.toString(A));
        System.out.println("B" + Arrays.toString(B));
    }
}