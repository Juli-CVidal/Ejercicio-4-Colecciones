/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Entidades.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServiciosPelicula {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula crearPelicula() {
        System.out.print("Ingrese el título: ");
        String titulo = leer.next();

        System.out.print("El director: ");
        String director = leer.next();

        System.out.print("Y la duración (en hrs): ");
        double duracion = leer.nextDouble();
        
        return new Pelicula(titulo, director, duracion);
    }

    public void crearYAñadirPelicula(ArrayList<Pelicula> peliculas) {
        peliculas.add(crearPelicula());
    }

    public void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
        for (Pelicula peli : peliculas) {
            System.out.println("Título: " + peli.getTitulo());
            System.out.print("Director: " + peli.getDirector());
            System.out.printf(", duración: %.2f %s %n", peli.getDuracion(), " horas");
        }
    }

    public void mostrarPeliculasLargas(ArrayList<Pelicula> peliculas) {
        for (Pelicula peli : peliculas) {
            if (peli.getDuracion() > 1) {
                System.out.println("Título: " + peli.getTitulo());
                System.out.print("Director: " + peli.getDirector());
                System.out.printf(", duración: %.2f %s %n", peli.getDuracion(), " horas");
            }
        }
    }

    public void ordenarPorDuracion(ArrayList<Pelicula> peliculas, String ord) { //orden, ascendente o descendente
        if (ord.equals("desc")) {
            Collections.sort(peliculas, Comparadores.ordenarPorDuracionDesc);
        }
        if (ord.equals("asc")) {
            Collections.sort(peliculas, Comparadores.ordenarPorDuracionAsc);
        }
    }
    
    public void ordenarPorTitulo(ArrayList<Pelicula> peliculas){
        Collections.sort(peliculas, Comparadores.ordenarPorTitulo);
    }
    
    public void ordenarPorDirector(ArrayList<Pelicula> peliculas){
        Collections.sort(peliculas,Comparadores.ordenarPorDirector);
    }
}
