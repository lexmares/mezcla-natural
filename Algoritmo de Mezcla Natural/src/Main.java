public class Main {
    public static void main(String[] args) {
        // Caso 1 Entrada Desordenada Mixta
        //Integer[] array = {10, 20, 15, 40, 50, 25, 5};

        // Caso 2 Entrada con Secuencias Ordenadas Parcialmente
        //Integer[] array = {3, 8, 12, 1, 6, 10, 2, 4, 5};

        // Caso 3 Entrada Desordenada
        //Integer[] array = {9, 7, 5, 3, 1, 0};

        // Caso 4 Entrada Totalmente Ordenada
        //Integer[] array = {2, 4, 6, 8, 10, 12};

        // Caso 5 Entrada con Valores Duplicados
        //Integer[] array = {4, 4, 3, 2, 5, 1, 3, 4};

        // Caso 6 Entrada con Todos los Elementos Iguales
        //Integer[] array = {5, 5, 5, 5, 5};

        // Caso 7 Entrada Vacía
        //Integer[] array = {};

        // Caso 7 cadena como entrada

        MezclaNatural<Integer> mezcla = new MezclaNatural<>();
        //Integer[] resultado = mezcla.mezclarNatural(array);


        String[] arrayString = {"uva", "manzana", "pera", "kiwi", "durazno", "cereza", "limón", "mango", "plátano", "fresa"};
        MezclaNatural<String> mezclaString = new MezclaNatural<>();
        String[] salida = mezclaString.mezclarNatural(arrayString);

    }
}