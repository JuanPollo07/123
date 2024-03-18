public class Nodo {
    int coeficiente;
    int exponente;
    Nodo siguiente;

    Nodo(int coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.siguiente = null;
    }
}