package Servicio;

import entidad.Pelicula;

public class PeliculaServicio {

    public Pelicula crearPelicula(String titulo, String genero, int anio, int duracion) {

        return new Pelicula(titulo, genero, anio, duracion);
    }

    public void listaPelisDisponibles(Pelicula[] newPeliculas) {

        for (int i=0; i< newPeliculas.length; i++) {
            if (newPeliculas[i] != null && (!newPeliculas[i].isAlquilada()) ) {
                System.out.println(newPeliculas[i].getTitulo());
            }
        }
    }

    public int buscarObjetoPorTitulo(Pelicula[] arregloPeli, String titulo) {
        for (int i = 0; i < arregloPeli.length; i++) {
            if (arregloPeli[i].getTitulo().equals(titulo)) {
                return i;
            }
        }
        return -1;
    }
    
    public int buscarObjetoPorGenero(Pelicula[] arregloPeli, String genero) {
        for (int i = 0; i < arregloPeli.length; i++) {
            if (arregloPeli[i].getGenero().equals(genero)) {
                return i;
            }
        }
        return -1;
    }

    public void getNombrePelicula(Pelicula newPelicula) {
        System.out.println(newPelicula.getTitulo());
    }

    public void isAlquilada(Pelicula newPelicula) {
        if (newPelicula.isAlquilada()) {
            System.out.println("La película está alquilada");
        } else{
            System.out.println("La película está disponible");
        }
    }



}
