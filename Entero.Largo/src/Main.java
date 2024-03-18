public class Main {
    public static void main(String[] args) {
        String numero1 = "5656453456";
        String numero2 = "2572742785";

        ListaCircular lista1 = new ListaCircular();
        ListaCircular lista2 = new ListaCircular();

        // Convertir cadenas de números en listas circulares
        for (int i = numero1.length() - 1; i >= 0; i--) {
            lista1.insertarAlFinal(Integer.parseInt(numero1.substring(i, i + 1)));
        }
        for (int i = numero2.length() - 1; i >= 0; i--) {
            lista2.insertarAlFinal(Integer.parseInt(numero2.substring(i, i + 1)));
        }

        ListaCircular suma = lista1.suma(lista2);

        System.out.println("La suma de los dos números es:");
        suma.imprimir();
    }
}