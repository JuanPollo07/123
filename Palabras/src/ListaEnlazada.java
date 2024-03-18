import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ListaEnlazada {
    Nodo cabeza;

    ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para insertar una palabra al final de la lista
    void insertar(String palabra) {
        Nodo nuevoNodo = new Nodo(palabra);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    // Método para eliminar una palabra de la lista
    void eliminar(String palabra) {
        if (cabeza == null) {
            return;
        }

        if (cabeza.palabra.equals(palabra)) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.palabra.equals(palabra)) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }

    // Método para escribir las palabras de la lista en un archivo
    void escribirEnArchivo(String nombreArchivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            Nodo actual = cabeza;
            while (actual != null) {
                writer.println(actual.palabra);
                actual = actual.siguiente;
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}