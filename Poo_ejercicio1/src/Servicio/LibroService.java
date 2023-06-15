/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicio;

import Entidad.Libro;
import java.util.Scanner;

public class LibroService{
    public LibroService(){
        
    }
    
    public Libro crearLibro() {
        Scanner input = new Scanner(System.in);  
        
        System.out.print("ISBN: ");
        String isbn = input.nextLine();
        
        System.out.print("Titulo: ");
        String titulo = input.nextLine();
        
        System.out.print("Autor: ");
        String autor = input.nextLine();
        
        System.out.print("Numero Paginas: ");
        int numeroPaginas = input.nextInt();
        
        return new Libro(isbn, titulo, autor, numeroPaginas);
    }
    
    public void mostrarLibro(Libro libro){
        System.out.println(libro.toString());
    }
}

