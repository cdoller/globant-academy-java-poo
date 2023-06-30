package Servicio;

import Entidad.Movil;
import java.util.Scanner;

public class MovilServicio{
    private Movil movil = new Movil(); 
    
    public void cargarCelular(){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Marca: ");
        movil.setMarca(input.nextLine());
        System.out.print("Modelo: ");
        movil.setModelo(input.nextLine());
        System.out.print("Precio: ");
        movil.setPrecio(input.nextInt());
        System.out.print("Memoria RAM (GB): ");
        movil.setMemoriaRam(input.nextInt());
        System.out.print("Almacenamiento (GB): ");
        movil.setAlmacenamiento(input.nextInt());
        System.out.print("Codigo: ");
        ingresarCodigo(movil.getCodigo().length);
    }
    
    private void ingresarCodigo(int longCodigo){
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int[] codigoValidado = new int[longCodigo]; // arreglo que voy a guardar
        
        String codigo = input.nextLine();
        // Validacion INPUT del usuario
        while(!codigo.matches("^[0-9]{"+longCodigo+"}$")){
            System.out.println("El codigo no tiene " + longCodigo + " caracteres o alguno de sus caracteres no es numero, vuelva a ingresar: ");
            codigo = input.nextLine();
        }
        
        // Rellenmo el array para guardar
        int codigoNum = Integer.parseInt(codigo);
        int i=longCodigo-1;
        while(i>=0){
            codigoValidado[i] = codigoNum%10;
            codigoNum = codigoNum/10;
            i--;
        }
        movil.setCodigo(codigoValidado);
    }

    @Override
    public String toString() {
        return "MovilServicio{" + "movil=" + movil.toString() + '}';
    }

}