public class Main {
    public static void main(String[] args) {
        // Crear dos conjuntos
        Conjunto conjunto1 = new Conjunto();
        conjunto1.agregar(1);
        conjunto1.agregar(2);
        conjunto1.agregar(3);

        Conjunto conjunto2 = new Conjunto();
        conjunto2.agregar(3);
        conjunto2.agregar(4);
        conjunto2.agregar(5);

        // Mostrar los conjuntos
        System.out.println("Conjunto 1:");
        conjunto1.mostrar();
        System.out.println("Cardinal del conjunto 1: " + conjunto1.cardinal());

        System.out.println("\nConjunto 2:");
        conjunto2.mostrar();
        System.out.println("Cardinal del conjunto 2: " + conjunto2.cardinal());

        // Unión de dos conjuntos
        Conjunto union = conjunto1.union(conjunto2);
        System.out.println("\nUnión de los conjuntos:");
        union.mostrar();
        System.out.println("Cardinal de la unión de los conjuntos: " + union.cardinal());

        // Intersección de dos conjuntos
        Conjunto interseccion = conjunto1.interseccion(conjunto2);
        System.out.println("\nIntersección de los conjuntos:");
        interseccion.mostrar();
        System.out.println("Cardinal de la intersección de los conjuntos: " + interseccion.cardinal());

        // Diferencia de dos conjuntos
        Conjunto diferencia = conjunto1.diferencia(conjunto2);
        System.out.println("\nDiferencia de los conjuntos (conjunto1 - conjunto2):");
        diferencia.mostrar();
        System.out.println("Cardinal de la diferencia de los conjuntos: " + diferencia.cardinal());

        // Inclusión de un conjunto en otro
        System.out.println("\n¿El conjunto1 está incluido en el conjunto2? " + conjunto1.incluido(conjunto2));
    }
}