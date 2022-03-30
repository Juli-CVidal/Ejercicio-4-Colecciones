/*
// Curso Egg FullStack
 */
package Entidades;

// @author JulianCVidal
public class Pelicula {

    private final String titulo;
    private final String director;
    private final Double duracion;

    public Pelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getDuracion() {
        return duracion;
    }

}
