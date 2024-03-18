public class Conjunto {
    Nodo cabeza;

    Conjunto() {
        this.cabeza = null;
    }

    // Cardinal del conjunto
    int cardinal() {
        int count = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            count++;
            actual = actual.siguiente;
        }
        return count;
    }

    // Pertenencia de un elemento al conjunto
    boolean contiene(int elemento) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.valor == elemento) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Añadir un elemento al conjunto
    void agregar(int elemento) {
        if (!contiene(elemento)) {
            Nodo nuevo = new Nodo(elemento);
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        }
    }

    // Escribir en pantalla los elementos del conjunto
    void mostrar() {
        Nodo actual = cabeza;
        System.out.print("Conjunto: { ");
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println("}");
    }
}