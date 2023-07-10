package actividadextra2;

import entidad.Alquiler;
import entidad.Pelicula;
import Servicio.AlquilerServicio;
import Servicio.PeliculaServicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ActividadExtra2 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        PeliculaServicio servPelicula = new PeliculaServicio();
        AlquilerServicio servAlquiler = new AlquilerServicio();
        Pelicula[] arregloPelis = new Pelicula[5];
        Alquiler[] arregloAlquiler = new Alquiler[3];

        do {
            System.out.println("-----------------------");
            System.out.println("MENU ALQUILER PELICULAS");
            System.out.println("-----------------------");
            System.out.println("1. Cargar pelicula");
            System.out.println("2. Ver peliculas disponibles");
            System.out.println("3. Alquilar pelicula");
            System.out.println("4. Listado de alquileres");
            System.out.println("5. Buscar peliculas");
            System.out.println("6. Buscar alquileres por fecha");
            System.out.println("7. Devolver pelicula");
            System.out.println("8. Ver totales recaudados");
            System.out.println("9. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    arregloPelis[0] = servPelicula.crearPelicula("Avatar", "Accion", 2009, 110);
                    arregloPelis[1] = servPelicula.crearPelicula("Harry Potter", "Aventura", 2009, 162);
                    arregloPelis[2] = servPelicula.crearPelicula("El padrino", "Drama", 2000, 130);
                    arregloPelis[3] = servPelicula.crearPelicula("Avatar 2", "Accion", 2021, 95);
                    arregloPelis[4] = servPelicula.crearPelicula("El señor de los anillos", "Accion", 2009, 156);
                    System.out.println("Se cargaron las películas correctamente");
                    System.out.println(Arrays.toString(arregloPelis));
                    break;
                case 2:
                    servPelicula.listaPelisDisponibles(arregloPelis);
                    break;
                case 3:
                    arregloAlquiler[0] = servAlquiler.alquilarPelicula(arregloPelis[1], LocalDate.now());
                    arregloAlquiler[1] = servAlquiler.alquilarPelicula(arregloPelis[4], LocalDate.now());
                    break;
                case 4:
                    servAlquiler.listaAlquileres(arregloAlquiler);
                    break;
                case 5:
                    System.out.println("Ver película por: 1. TÍTULO 2. GÉNERO");
                    switch (scanner.nextInt()) {
                        case 1:
                            System.out.println("Introducir nombre película");
                            int indice = servPelicula.buscarObjetoPorTitulo(arregloPelis, scanner.next());
                            if (indice >= 0) {
                                servPelicula.getNombrePelicula(arregloPelis[indice]);
                                servPelicula.isAlquilada(arregloPelis[indice]);
                            } else {
                                System.out.println("No hay coincidencias");
                            }
                            break;
                        case 2:
                            System.out.println("Introducir genero película");
                            int ind = servPelicula.buscarObjetoPorGenero(arregloPelis, scanner.next());
                            if (ind >= 0) {
                                servPelicula.getNombrePelicula(arregloPelis[ind]);
                                servPelicula.isAlquilada(arregloPelis[ind]);
                            } else {
                                System.out.println("No hay coincidencias");
                            }
                            break;
                        default:
                            System.out.println("No es una opcion valida");
                    }
                    break;
                case 6:
                    servAlquiler.buscarAlquileresPorFecha(arregloAlquiler, ingresarFecha());
                    break;
                case 7:
                    servAlquiler.devolverPelicula(arregloAlquiler, arregloPelis[1], ingresarFecha());
                    servAlquiler.devolverPelicula(arregloAlquiler, arregloPelis[4], LocalDate.now());
                    break;
                case 8:
                    servAlquiler.verTotales(arregloAlquiler);
                    break;
                case 9:
                    //salir
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 9);

    }
    
    public static LocalDate ingresarFecha() {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        System.out.print("Ingrese la fecha (AAAA/MM/DD) :");
        while (true) {
            String fecha = input.nextLine();
            try {
                return LocalDate.parse(fecha, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("El formato de la fecha no es valido, debe ser AAAA/MM/DD");
            }
        }
    }
}
