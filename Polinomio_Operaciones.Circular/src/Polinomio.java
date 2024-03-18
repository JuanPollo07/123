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

    // Método para sumar dos polinomios y devolver la lista circular resultante
    Polinomio suma(Polinomio otro) {
        Polinomio resultado = new Polinomio();
        Nodo actual1 = cabeza;
        Nodo actual2 = otro.cabeza;

        do {
            resultado.insertar(actual1.coeficiente, actual1.exponente);
            actual1 = actual1.siguiente;
        } while (actual1 != cabeza);

        do {
            resultado.insertar(actual2.coeficiente, actual2.exponente);
            actual2 = actual2.siguiente;
        } while (actual2 != otro.cabeza);

        return resultado;
    }

    // Método para calcular la derivada del polinomio y devolver la lista circular resultante
    Polinomio derivada() {
        Polinomio resultado = new Polinomio();
        Nodo actual = cabeza;

        do {
            int nuevoCoeficiente = actual.coeficiente * actual.exponente;
            int nuevoExponente = actual.exponente - 1;
            if (nuevoExponente >= 0) {
                resultado.insertar(nuevoCoeficiente, nuevoExponente);
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        return resultado;
    }

    // Método para calcular el producto de dos polinomios y devolver la lista circular resultante
    Polinomio producto(Polinomio otro) {
        Polinomio resultado = new Polinomio();
        Nodo actual1 = cabeza;

        do {
            Nodo actual2 = otro.cabeza;
            do {
                int nuevoCoeficiente = actual1.coeficiente * actual2.coeficiente;
                int nuevoExponente = actual1.exponente + actual2.exponente;
                resultado.insertar(nuevoCoeficiente, nuevoExponente);
                actual2 = actual2.siguiente;
            } while (actual2 != otro.cabeza);
            actual1 = actual1.siguiente;
        } while (actual1 != cabeza);

        return resultado;
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

    // Método para imprimir el polinomio como una cadena
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Nodo actual = cabeza;
        do {
            sb.append(actual.coeficiente);
            sb.append("x^");
            sb.append(actual.exponente);
            sb.append(" + ");
            actual = actual.siguiente;
        } while (actual != cabeza);
        return sb.toString();
    }
}