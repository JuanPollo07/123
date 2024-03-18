public class ListaCircular {
    Nodo cabeza;

    public ListaCircular() {
        this.cabeza = null;
    }

    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
            nuevoNodo.anterior = cabeza;
        } else {
            Nodo temp = cabeza.anterior;
            temp.siguiente = nuevoNodo;
            nuevoNodo.anterior = temp;
            nuevoNodo.siguiente = cabeza;
            cabeza.anterior = nuevoNodo;
        }
    }
    public void imprimir() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }
        Nodo temp = cabeza.anterior; // Comenzar desde el último nodo
        do {
            System.out.print(temp.dato);
            temp = temp.anterior;
        } while (temp != cabeza.anterior); // Terminar al llegar al último nodo
        System.out.println();
    }

    public ListaCircular suma(ListaCircular otraLista) {
        ListaCircular resultado = new ListaCircular();
        Nodo p = this.cabeza;
        Nodo q = otraLista.cabeza;
        int acarreo = 0;
        do {
            int suma = p.dato + q.dato + acarreo;
            acarreo = suma / 10;
            resultado.insertarAlFinal(suma % 10);
            p = p.siguiente;
            q = q.siguiente;
        } while (p != this.cabeza && q != otraLista.cabeza);

        return resultado;
    }
}