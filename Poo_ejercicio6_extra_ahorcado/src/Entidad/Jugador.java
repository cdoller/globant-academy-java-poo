package Entidad;

public class Jugador {

    private int intentos = 0;
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public int getIntentos() {
        return intentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void aumentarIntentos() {
        intentos++;
    }
}
