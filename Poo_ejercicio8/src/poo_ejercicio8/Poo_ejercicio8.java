package poo_ejercicio8;

import Servicio.CadenaServicio;
import java.util.Scanner;

public class Poo_ejercicio8 {

    public static void main(String[] args) {
        CadenaServicio cadenaServ = new CadenaServicio();
        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido!");
        cadenaServ.crearFrase();
        menuOpciones(cadenaServ, input);
    }

    public static void menuOpciones(CadenaServicio cadenaServ, Scanner input) {
        int opcion = 0;
        do {
            System.out.println("------------*********------------");
            System.out.println(cadenaServ.toString());
            System.out.println("MENU OPCIONES:");
            System.out.println("1-Buscar");
            System.out.println("2-Buscar y Reemplazar");
            System.out.println("3-Contar Vocales");
            System.out.println("4-Comparar longitud frases");
            System.out.println("5-Invertir frase");
            System.out.println("6-Unir frases");
            System.out.println("9-Salir");
            System.out.println("---------------------");
            System.out.print("Elija una opcion del MENU: ");
            opcion = input.nextInt();
            input.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cadena/letra a buscar:");
                    System.out.println(cadenaServ.vecesRepetido(input.nextLine()) + " resultados");
                    break;
                case 2:
                    System.out.println("Ingrese la cadena/letra a buscar:");
                    String letra = input.nextLine();
                    if (!cadenaServ.contiene(letra)) {
                        System.out.println("Ups! No hay resultados para la cadena/letra ingresada");
                        break;
                    }
                    System.out.println("Ingrese la cadena/letra de reemplazo:");
                    String letraReemplazo = input.nextLine();
                    cadenaServ.reemplazar(letra, letraReemplazo);
                    break;
                case 3:
                    System.out.println("Cantidad de vocales de la frase: " + cadenaServ.contarVocales());
                    break;
                case 4:
                    System.out.println("Ingrese una nueva frase para comparar: ");
                    cadenaServ.compararFrase(input.nextLine());
                    break;
                case 5:
                    cadenaServ.invertirFrase();
                    break;
                case 6:
                    System.out.println("Ingrese una frase para unir a la actual: ");
                    cadenaServ.unirFrases(input.nextLine());
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 9);
        System.out.println("Hasta luego!");
        System.out.println("------------*********------------");
    }
}
