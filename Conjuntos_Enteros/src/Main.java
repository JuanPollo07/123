public class Main {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();

        // Agregar elementos al conjunto
        conjunto.agregar(5);
        conjunto.agregar(10);
        conjunto.agregar(15);

        // Mostrar el conjunto y su cardinalidad
        conjunto.mostrar();
        System.out.println("Cardinal del conjunto: " + conjunto.cardinal());

        // Verificar pertenencia de un elemento
        System.out.println("¿El conjunto contiene el elemento 10? " + conjunto.contiene(10));
        System.out.println("¿El conjunto contiene el elemento 20? " + conjunto.contiene(20));

        // Agregar un elemento ya existente
        conjunto.agregar(7);

        // Mostrar el conjunto actualizado
        conjunto.mostrar();
        System.out.println("Cardinal del conjunto: " + conjunto.cardinal());
    }
}