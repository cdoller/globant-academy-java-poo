package Entidad;

import java.util.Scanner;

public class Libro {

    // ATTRIBUTES
    public String isbn;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    // CONSTRUCTORS
    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // GETTERS 
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    // SETTERS
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // METHODS    
    public void getInfo() {
        System.out.println("-------------------------");
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Numero Paginas: " + this.numeroPaginas);
        System.out.println("-------------------------");
    }

    public void setValuesFromUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("ISBN: ");
        setIsbn(input.nextLine());
        System.out.print("Titulo: ");
        setTitulo(input.nextLine());
        System.out.print("Autor: ");
        setAutor(input.nextLine());
        System.out.print("Numero Paginas: ");
        setNumeroPaginas(input.nextInt());
    }
}
