package org.example;

public class AlgoritmosOrdenamiento {

    public AlgoritmosOrdenamiento() {
    }

    /**
     * Implementa el algoritmo de ordenamiento Burbuja (Bubble Sort).
     * Recorre repetidamente el arreglo, compara elementos adyacentes y los intercambia
     * si están en el orden incorrecto. Las pasadas a través de la lista se repiten
     * hasta que no se necesiten más intercambios, lo que indica que la lista está ordenada.
     * Incluye una optimización para detenerse temprano si el arreglo ya está ordenado.
     *
     * @param arreglo El arreglo de enteros a ordenar. El arreglo se modifica directamente.
     */
    public void ordenamientoBurbuja(int[] arreglo){
        int n = arreglo.length;
        boolean intercambiado;

        for(int i = 0; i < n - 1; i++){
            intercambiado = false;

            for(int j = 0; j < n - 1 - i;j++){
                if(arreglo[j] > arreglo[j + 1]){
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true;
                }
            }
            if(!intercambiado){
                break;
            }
        }
    }

    /**
     * Implementa el algoritmo de ordenamiento por Selección (Selection Sort).
     * Divide el arreglo en dos partes: una sublista ordenada y una sublista no ordenada.
     * En cada iteración, encuentra el elemento mínimo de la sublista no ordenada
     * y lo coloca al principio de la sublista ordenada.
     *
     * @param arreglo El arreglo de enteros a ordenar. El arreglo se modifica directamente.
     * */
    public void ordenamientoSeleccion(int[] arreglo){
        int n = arreglo.length;

        for(int i = 0; i < n - 1; i++){
            int indiceMinimo = i;
            for(int j = i + 1; j < n; j++){
                if(arreglo[j] < arreglo[indiceMinimo]){
                    indiceMinimo = j;
                }
            }
            int temp = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = temp;
        }
    }

    /**
     * Implementa el algoritmo de ordenamiento por Inserción (Insertion Sort).
     * Construye el arreglo final ordenado un elemento a la vez. Es similar a cómo
     * se ordenan las cartas en la mano. Recorre el arreglo y, para cada elemento,
     * lo inserta en su posición correcta dentro de la parte ya ordenada del arreglo,
     * desplazando los elementos mayores a la derecha.
     *
     * @param arreglo El arreglo de enteros a ordenar. El arreglo se modifica directamente.
     */
    public void ordenamientoInsercion(int[] arreglo){
        int n = arreglo.length;

        for(int i = 1; i < n; i++){
            int clave = arreglo[i];
            int j = i - 1;

            while(j >= 0 && arreglo[j] > clave){
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = clave;
        }
    }
}
