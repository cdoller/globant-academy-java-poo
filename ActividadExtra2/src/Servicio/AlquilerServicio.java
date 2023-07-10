package Servicio;

import entidad.Alquiler;
import entidad.Pelicula;
import java.time.LocalDate;
import java.time.Period;

public class AlquilerServicio {

    public Alquiler alquilarPelicula(Pelicula newPelicula, LocalDate fechaInicio) {
        if (!newPelicula.isAlquilada()) {
            newPelicula.setAlquilada(true);
            System.out.println(newPelicula.getTitulo() + " ha sido alquilada");
            return new Alquiler(newPelicula, fechaInicio);

        } else {
            System.out.println("Ups! sorry rey");
            return null;
        }
    }

    public void listaAlquileres(Alquiler[] newAlquiler) {
        boolean vacio = true;
        for (int i = 0; i < newAlquiler.length; i++) {
            if (newAlquiler[i] != null && newAlquiler[i].getPeliAlquilada().isAlquilada()) {
                System.out.println(newAlquiler[i].getPeliAlquilada().getTitulo());
                System.out.println(newAlquiler[i].getFechaInicio());
                vacio = false;
            }
        }
        if (vacio) {
            System.out.println("No hay alquileres");
        }
    }

    public void buscarAlquileresPorFecha(Alquiler[] alquileres, LocalDate fecha) {
        boolean vacio = true;
        for (int i = 0; i < alquileres.length; i++) {
            if (alquileres[i] != null && (alquileres[i].getFechaInicio().isEqual(fecha))) {
                System.out.println(alquileres[i].getPeliAlquilada().getTitulo());
                vacio = false;
            }
        }
        if (vacio) {
            System.out.println("No hay alquileres en la fecha " + fecha);
        }
    }

    public void devolverPelicula(Alquiler[] alquileres, Pelicula pelicula, LocalDate fecha) {
        for (int i = 0; i < alquileres.length; i++) {
            if (alquileres[i] != null && (alquileres[i].getPeliAlquilada().getTitulo().equals(pelicula.getTitulo()))) {
                alquileres[i].setFechaFin(fecha);
                alquileres[i].setPrecio(calcularPrecio(alquileres[i]));
                pelicula.setAlquilada(false);
                System.out.println("Devolvemos la pelicula: " + alquileres[i].getPeliAlquilada().getTitulo());
                System.out.println("El precio del alquiler fue de " + alquileres[i].getPrecio());
            }
        }
    }

    public static double calcularPrecio(Alquiler alquiler) {
        int diasAlquiler = Period.between(alquiler.getFechaInicio(), alquiler.getFechaFin()).getDays();
        System.out.println("dias alquiler: " + diasAlquiler);
        if (diasAlquiler <= 3) {
            return 10.0;
        } else {
            return 10.0 * (1 + (diasAlquiler - 3) * 0.1);
        }
    }

    public void verTotales(Alquiler[] alquileres) {
        double total = 0.0;
        for (int i = 0; i < alquileres.length; i++) {
            if (alquileres[i] != null) {
                total += alquileres[i].getPrecio();
            }
        }
        System.out.println("La recaudacion total fue de : " + total);
    }

}
