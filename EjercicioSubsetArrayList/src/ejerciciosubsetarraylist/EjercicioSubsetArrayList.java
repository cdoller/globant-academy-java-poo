/*
* Given an integer array, divide the array into 2 subsets A and B while respecting the following conditions.
* The intersection of A and B is null.
* The union A and B is equal to the original array.
* The number of elements in subset A is minimal.
* The sum of A's elements is greater than the sum of B's elements.

Return the subset A in increasing order where the sum of A's elements is greater than the sum of B's elements. If more than one subset exists, return the one with the maximal sum.

Example
n=5
arr=[3,7,5,6,2]

The 2 subsets in arr that satisfy the condicions for A are [5,7] and [6,7]:

* A is minimal (size 2)
* Sum(A) = (5+7) = 12 > Sum(B) = (2+3+6) = 11
* Sum(A) = (6+7) = 13 > Sum(B) = (2+3+5) = 10
* The intersection of A and B is null and their union is equal to arr.
* The subset A where the sum of its elements is maximal is [6,7]
 */
package ejerciciosubsetarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class EjercicioSubsetArrayList {

    public static void main(String[] args) {
        //int[] arr = {3, 7, 5, 6, 2, 4, 14};
        int[] arr = {3, 7, 5, 6, 2};
        System.out.println("El subset A minimo segun las condiciones es : ");
        System.out.println(calcularSubsetMinimo(arr).toString());
    }

    public static ArrayList<Integer> calcularSubsetMinimo(int[] arr) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        Arrays.sort(arr);
        cargarArrayList(B, arr);
        do {
            A.add(0, B.get(B.size() - 1));
            B.remove(B.size() - 1);
        } while (!(sumaArrayList(A) > sumaArrayList(B)));
        //imprimirArrayList(A, B); // descomentar para ver cada subset

        return A;
    }

    public static void cargarArrayList(ArrayList<Integer> arrayList, int[] arregloNumeros) {
        for (int numero : arregloNumeros) {
            arrayList.add(numero);
        }
    }

    public static void imprimirArrayList(ArrayList<Integer> A, ArrayList<Integer> B) {
        System.out.println("A: " + A.toString() + " - Sum: " + sumaArrayList(A));
        System.out.println("B: " + B.toString() + " - Sum: " + sumaArrayList(B));
    }

    public static int sumaArrayList(ArrayList<Integer> arrayList) {
        int suma = 0;
        for (int numero : arrayList) {
            suma += numero;
        }
        return suma;
    }
}
