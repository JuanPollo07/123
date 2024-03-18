public class Main {
    public static void main(String[] args) {
        Polinomio polinomio = new Polinomio();

        // Ingresar el polinomio a través de variables
        polinomio.insertar(3, 4);
        polinomio.insertar(-4, 2);
        polinomio.insertar(11, 0);

        // Mostrar la tabla de valores del polinomio para valores de x de 0.0 a 5.0 en incrementos de 0.5
        System.out.println("Tabla de valores del polinomio:");
        System.out.println("x\t|\ty");
        System.out.println("--------------------");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double y = polinomio.evaluar(x);
            System.out.printf("%.1f\t|\t%.2f\n", x, y);
        }
    }
}