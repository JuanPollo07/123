public class Main {
    public static void main(String[] args) {
        // Crear dos polinomios
        Polinomio polinomio1 = new Polinomio();
        polinomio1.insertar(3, 4);
        polinomio1.insertar(-4, 2);
        polinomio1.insertar(11, 0);

        Polinomio polinomio2 = new Polinomio();
        polinomio2.insertar(2, 3);
        polinomio2.insertar(-1, 1);
        polinomio2.insertar(5, 0);

        // Sumar los polinomios y mostrar el resultado
        Polinomio suma = polinomio1.suma(polinomio2);
        System.out.println("Suma de polinomios: " + suma.toString());

        // Calcular la derivada del primer polinomio y mostrar el resultado
        Polinomio derivada = polinomio1.derivada();
        System.out.println("Derivada del primer polinomio: " + derivada.toString());

        // Calcular el producto de los polinomios y mostrar el resultado
        Polinomio producto = polinomio1.producto(polinomio2);
        System.out.println("Producto de polinomios: " + producto.toString());
    }
}