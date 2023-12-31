package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Ahorcado {

    public static final int JUGADAS_MAX = 6;

    private Jugador jugador;
    private String palabra;
    private String[] intentoPalabra;
    private ArrayList<String> letrasIngresadas;
    private String[] dibujo = 
        {" -----------|",
        " |          |",
        " |",
        " |",
        " |",
        " |",
        " |",
        " |",
        "==="
    };

    public Ahorcado(String nombreJugador) {
        jugador = new Jugador(nombreJugador);
        palabra = generarPalabra();
        intentoPalabra = new String[palabra.length()];
        letrasIngresadas = new ArrayList<String>();
    }
    ///////////////////////
    //// Letras Ingresadas
    ///////////////////////
    public ArrayList<String> getLetrasIngresadas() {
        return letrasIngresadas;
    }

    public boolean agregarLetraIngresada(String letra) {
        boolean letraRepetida = letrasIngresadas.contains(letra);
        if (!letraRepetida) {
            letrasIngresadas.add(letra);
        } else {
            System.out.println("Letra repetida, ingrese nuevamente");
        }
        return !letraRepetida;
    }

    //// Jugador
    public Jugador getJugador() {
        return jugador;
    }

    //// Palabra Secreta
    public String generarPalabra() {
        String[] palabras = {"ahorcado", "elefante",
            "guitarra", "computadora", "libro", "perro", "gato", "playa",
            "sol", "familia", "pelota", "camisa", "escuela", "amigo", "casa",
            "juego", "ciudad", "viaje", "trabajo", "fiesta", "musica",
            "avion", "parque", "chocolate", "futbol", "telefono",
            "naturaleza", "aventura", "articulo", "internet"};

        return palabras[(int) (Math.random() * (palabras.length))];
    }

    //// Salida por consola
    public void dibujoFormateado() {
        for (int i = 0; i < dibujo.length; i++) {
            System.out.println(dibujo[i]);
        }
    }

    public void imprimirDibujo() {
        switch (jugador.getIntentos()) {
            case 0:
                break;
            case 1:
                dibujo[2] = " |          0";
                break;
            case 2:
                dibujo[3] = " |          |";
                dibujo[4] = " |          |";
                break;
            case 3:
                dibujo[5] = " |         /";
                break;
            case 4:
                dibujo[5] = " |         / \\";
                break;
            case 5:
                dibujo[3] = " |         \\|";
                break;
            case 6:
                dibujo[3] = " |         \\|/";
                break;
            default:
                System.out.println("--");
        }
        dibujoFormateado();
    }

    public void imprimirEstado() {
        imprimirDibujo();
        System.out.println("");
        System.out.println("Le quedan " + (JUGADAS_MAX - jugador.getIntentos()) + " intentos");
        for (int i = 0; i < intentoPalabra.length; i++) {
            if (intentoPalabra[i] == null) {
                System.out.print("_ ");
            } else {
                System.out.print(intentoPalabra[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("______________________________");
        System.out.println("Letras ingresadas: " + getLetrasIngresadas().toString());
    }

    //// Dinamica del Juego
    public void jugar() {
        Scanner input = new Scanner(System.in);
        System.out.println("La cantidad de letras de la palabra secreta es: " + palabra.length());
        imprimirEstado();
        boolean tieneIntentosDisponibles, palabraDescubierta;
        do {
            System.out.print("Ingrese letra a buscar: ");
            hacerIntento(input.next().toLowerCase());
            imprimirEstado();
            tieneIntentosDisponibles = jugador.getIntentos() < JUGADAS_MAX;
            palabraDescubierta = isJuegoFinalizado();

        } while (tieneIntentosDisponibles && !palabraDescubierta);

        if (!palabraDescubierta) {
            System.out.println("Perdiste :( la palabra era " + palabra);
        } else {
            System.out.println("Ganaste !! Felicitaciones " + jugador.getNombre());
        }
    }

    public boolean buscarLetra(String letra) {
        return palabra.contains(letra);
    }

    public void rellenarIntentos(String letra) {
        int posicion = palabra.indexOf(letra);
        while (posicion != -1) {
            System.out.println("La letra '" + letra + "' se encuentra en la posición: " + (posicion + 1));
            intentoPalabra[posicion] = letra;
            posicion = palabra.indexOf(letra, posicion + 1);
        }
    }

    public void hacerIntento(String letra) {        
        if (!agregarLetraIngresada(letra)) {
            return;
        }

        if (buscarLetra(letra)) {
            rellenarIntentos(letra);
        } else {
            jugador.aumentarIntentos();
            System.out.println("Letra incorrecta.");
        }
    }

    public boolean isJuegoFinalizado() {
        for (int i = 0; i < intentoPalabra.length; i++) {
            if (intentoPalabra[i] == null) {
                return false;
            }
        }
        return true;
    }
}
