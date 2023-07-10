package entidad;

import java.time.LocalDate;

public class Alquiler {
    private Pelicula peliAlquilada;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private double precio;

    public Alquiler() {
    }

    public Alquiler(Pelicula peliAlquilada, LocalDate fechaInicio) {
        this.peliAlquilada = peliAlquilada;
        this.fechaInicio = fechaInicio;
    }

    public Pelicula getPeliAlquilada() {
        return peliAlquilada;
    }

    public void setPeliAlquilada(Pelicula peliAlquilada) {
        this.peliAlquilada = peliAlquilada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "peliAlquilada=" + peliAlquilada +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", precio=" + precio +
                '}';
    }
}
