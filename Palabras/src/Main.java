import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        // Leer el archivo de texto y cargar las palabras en la lista enlazada
        try (Scanner scanner = new Scanner(new File("input.txt"))) {
            while (scanner.hasNext()) {
                lista.insertar(scanner.next());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        }

        // Agregar nuevas palabras a la lista
        lista.insertar("nuevaPalabra1");
        lista.insertar("nuevaPalabra2");

        // Eliminar una palabra de la lista
        lista.eliminar("lola6");

        // Escribir las palabras de la lista en un archivo
        lista.escribirEnArchivo("output.txt");
    }
}