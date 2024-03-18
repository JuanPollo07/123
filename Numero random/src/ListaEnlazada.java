public class ListaEnlazada {
    Nodo cabeza;

    ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para insertar un elemento al final de la lista
    void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
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

    // Método para recorrer y mostrar los elementos de la lista
    void mostrar() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Método para eliminar nodos que superen un valor dado
    void eliminarNodosMayores(int valor) {
        Nodo actual = cabeza;
        Nodo previo = null;

        while (actual != null && actual.dato > valor) {
            cabeza = actual.siguiente;
            actual = cabeza;
        }

        while (actual != null) {
            while (actual != null && actual.dato <= valor) {
                previo = actual;
                actual = actual.siguiente;
            }

            if (actual == null) return;

            previo.siguiente = actual.siguiente;
            actual = previo.siguiente;
        }
    }
}