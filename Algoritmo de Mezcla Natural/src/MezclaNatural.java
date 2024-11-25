import java.util.Arrays;

public class MezclaNatural<T>{

    T[] auxiliar1;
    T[] auxiliar2;

    public MezclaNatural() {
    }
    @SuppressWarnings("unchecked")
    public T[] mezclarNatural(T[] array){

        boolean ordenado = verificarEnOrden(array);

        auxiliar1 = (T []) new Object[array.length];
        auxiliar2 = (T []) new Object[array.length];


        while(!ordenado){

            repartirAuxiliares(array, auxiliar1, auxiliar2);
            System.out.print("arreglo principal: ");
            imprimirArray(array);
            System.out.print("arreglo aux 1: ");
            imprimirArray(auxiliar1);
            System.out.print("arreglo aux 2: ");
            imprimirArray(auxiliar2);

            mezclar(array, auxiliar1, auxiliar2);

            System.out.print("arreglo principal: ");
            imprimirArray(array);

            ordenado = verificarEnOrden(array);
        }


        return array;
    }

    @SuppressWarnings("unchecked")
    public void repartirAuxiliares(T[] array, T[] aux1, T[] aux2){
        Arrays.fill(aux1, null);
        Arrays.fill(aux2, null);


        int contador1 = 0;
        int contador2 = 0;
        boolean agregarAux1 = true;

        for (int i = 0; i < array.length; i++) {

            Comparable<T> actual = (Comparable<T>) array[i];

            if (i == array.length - 1) {
                if (agregarAux1) aux1[contador1++] = array[i];
                else aux2[contador2++] = array[i];

            } else {
                if (actual.compareTo(array[i + 1]) <= 0) {

                    if (agregarAux1) aux1[contador1++] = array[i];
                    else aux2[contador2++] = array[i];

                } else {
                    if (agregarAux1) {
                        aux1[contador1++] = array[i];
                        agregarAux1 = false;
                    } else {
                        aux2[contador2++] = array[i];
                        agregarAux1 = true;
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void mezclar(T[] array, T[] aux1, T[] aux2){
        int contador1 = 0;
        int contador2 = 0;

        for (int i = 0; i < array.length; i++) {

            if (contador1 < aux1.length && contador2 < aux2.length) {

                if (aux1[contador1] == null) {
                    array[i] = aux2[contador2++];

                } else if (aux2[contador2] == null) {
                    array[i] = aux1[contador1++];
                }
                else{
                    Comparable<T> actAux1 = (Comparable<T>) aux1[contador1];

                    if (actAux1.compareTo(aux2[contador2]) < 0) {
                        array[i] = aux1[contador1++];
                    } else {
                        array[i] = aux2[contador2++];
                    }
                }

            } else{
                break;
            }

        }
    }




    @SuppressWarnings("unchecked")
    public boolean verificarEnOrden (T[] array){
        boolean estaOrdenado = true;
        for (int i = 0; i < array.length - 1; i++){
            Comparable<T> actual = (Comparable<T>) array[i];
            if(actual.compareTo(array[i+1]) > 0){
                estaOrdenado = false;
                break;
            }
        }
        return estaOrdenado;
    }

    public void imprimirArray(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }


}
