/*
// Curso Egg FullStack
 */
package Main;

//@author JulianCVidal
import Entidades.Pelicula;
import Servicios.ServiciosPelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ServiciosPelicula ServPe = new ServiciosPelicula();
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ArrayList<Pelicula> pelisCine = new ArrayList<>();
        String opc = "Y";
        int cont = 0;

        while (!opc.equals("N")) {
            System.out.println("Películas Ingresadas: " + cont);
            ServPe.crearYAñadirPelicula(pelisCine);

            System.out.print("¿Desea añadir otra película(Y/N)? ");
            opc = leer.next().substring(0, 1).toUpperCase();
            System.out.println("");
            cont++;
        }

        do {
            System.out.println("\nOpciones disponibles: ");
            System.out.println("1.Mostrar todas las películas \n2.Mostrar películas que duren más de una hora");
            System.out.println("3.Ordenar por duración (mayor a menor) \n4.Ordenar por duración (menor a mayor)");
            System.out.println("5.Ordenar por título \n6.Ordenar por director \nS.Salir");
            System.out.print("Ingrese una opción: ");
            opc = leer.next().substring(0, 1).toUpperCase();

            switch (opc) {
                case "1":
                    ServPe.mostrarPeliculas(pelisCine);
                    break;

                case "2":
                    ServPe.mostrarPeliculasLargas(pelisCine);
                    break;

                case "3":
                    ServPe.ordenarPorDuracion(pelisCine, "desc");
                    ServPe.mostrarPeliculas(pelisCine);
                    break;

                case "4":
                    ServPe.ordenarPorDuracion(pelisCine, "asc");
                    ServPe.mostrarPeliculas(pelisCine);
                    break;
                    
                case "5":
                    ServPe.ordenarPorTitulo(pelisCine);
                    ServPe.mostrarPeliculas(pelisCine);
                    break;
                    
                case "6":
                    ServPe.ordenarPorDirector(pelisCine);
                    ServPe.mostrarPeliculas(pelisCine);
                    break;
                    
                case "S":
                    break;
                    
                default:
                    System.out.println("No ha ingresado una opción válida");
            }
            
            if (!opc.equals("S")){
                presionarEnter();
            }
        } while (!opc.equals("S"));

    }
    
    public static void presionarEnter(){
        System.out.print("Presione Enter para continuar.");
        String pass = leer.next();
    }

}
