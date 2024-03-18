public class Polinomio {
    Nodo cabeza;

    Polinomio() {
        this.cabeza = null;
    }

    // Método para insertar un término al final del polinomio
    void insertar(int coeficiente, int exponente) {
        Nodo nuevoNodo = new Nodo(coeficiente, exponente);
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

    // Método para evaluar el polinomio en un valor dado de x
    double evaluar(double x) {
        double resultado = 0.0;
        Nodo actual = cabeza;
        while (actual != null) {
            resultado += actual.coeficiente * Math.pow(x, actual.exponente);
            actual = actual.siguiente;
        }
        return resultado;
    }
}