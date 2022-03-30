/*
// Curso Egg FullStack
 */
package Servicios;

// @author JulianCVidal
import Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {

    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pel1, Pelicula pel2) {
            return pel2.getDuracion().compareTo(pel1.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenarPorDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula pel1, Pelicula pel2) {
            return pel1.getDuracion().compareTo(pel2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
