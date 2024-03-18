import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        // Generamos números enteros positivos al azar y los insertamos en la lista
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            lista.insertar(rand.nextInt(100)); // números aleatorios entre 0 y 99
        }

        // Mostramos la lista antes de eliminar nodos
        System.out.println("Lista original:");
        lista.mostrar();

        // Definimos el valor máximo permitido
        int valorMaximo = 50;

        // Eliminamos los nodos que superen el valor máximo
        lista.eliminarNodosMayores(valorMaximo);

        // Mostramos la lista después de eliminar nodos
        System.out.println("Lista después de eliminar nodos mayores que " + valorMaximo + ":");
        lista.mostrar();
    }
}