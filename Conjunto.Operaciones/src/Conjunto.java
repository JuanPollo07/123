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

    // Unión de dos conjuntos
    Conjunto union(Conjunto otroConjunto) {
        Conjunto resultado = new Conjunto();

        // Agregar elementos del primer conjunto
        Nodo actual = this.cabeza;
        while (actual != null) {
            resultado.agregar(actual.valor);
            actual = actual.siguiente;
        }

        // Agregar elementos del segundo conjunto (evitando duplicados)
        actual = otroConjunto.cabeza;
        while (actual != null) {
            if (!resultado.contiene(actual.valor)) {
                resultado.agregar(actual.valor);
            }
            actual = actual.siguiente;
        }

        return resultado;
    }

    // Intersección de dos conjuntos
    Conjunto interseccion(Conjunto otroConjunto) {
        Conjunto resultado = new Conjunto();

        Nodo actual = this.cabeza;
        while (actual != null) {
            if (otroConjunto.contiene(actual.valor)) {
                resultado.agregar(actual.valor);
            }
            actual = actual.siguiente;
        }

        return resultado;
    }

    // Diferencia de dos conjuntos (este - otroConjunto)
    Conjunto diferencia(Conjunto otroConjunto) {
        Conjunto resultado = new Conjunto();

        Nodo actual = this.cabeza;
        while (actual != null) {
            if (!otroConjunto.contiene(actual.valor)) {
                resultado.agregar(actual.valor);
            }
            actual = actual.siguiente;
        }

        return resultado;
    }

    // Inclusión de un conjunto en otro
    boolean incluido(Conjunto otroConjunto) {
        Nodo actual = this.cabeza;
        while (actual != null) {
            if (!otroConjunto.contiene(actual.valor)) {
                return false;
            }
            actual = actual.siguiente;
        }
        return true;
    }
}