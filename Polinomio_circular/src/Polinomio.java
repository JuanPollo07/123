public class Polinomio {
    Nodo cabeza;
    Nodo ultimo; // Referencia al último nodo

    Polinomio() {
        this.cabeza = null;
        this.ultimo = null;
    }

    // Método para insertar un término al final del polinomio
    void insertar(int coeficiente, int exponente) {
        Nodo nuevoNodo = new Nodo(coeficiente, exponente);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo; // Cuando hay un solo nodo, es el primero y el último
        } else {
            ultimo.siguiente = nuevoNodo;
            nuevoNodo.siguiente = cabeza; // Hacemos que el último nodo apunte al primero para formar el ciclo
            ultimo = nuevoNodo; // El nuevo nodo es ahora el último
        }
    }

    // Método para evaluar el polinomio en un valor dado de x
    double evaluar(double x) {
        double resultado = 0.0;
        Nodo actual = cabeza;
        do {
            resultado += actual.coeficiente * Math.pow(x, actual.exponente);
            actual = actual.siguiente;
        } while (actual != cabeza); // Iteramos hasta que volvamos al primer nodo
        return resultado;
    }
}