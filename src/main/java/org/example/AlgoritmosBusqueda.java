package org.example;

public class AlgoritmosBusqueda {

    public AlgoritmosBusqueda() {
    }

    /**
     * Implementa el algoritmo de búsqueda lineal (o secuencial).
     * Recorre cada elemento del arreglo desde el principio hasta el final,
     * comparándolo con el número buscado. Se detiene y retorna true
     * en el momento en que encuentra el número.
     *
     * @param numeroBuscado El valor entero que se desea encontrar en el arreglo.
     * @param arreglo El arreglo de enteros donde se realizará la búsqueda.
     * @return `true` si el `numeroBuscado` se encuentra en el arreglo, `false` en caso contrario.
     */
    public boolean busquedaLineal(int numeroBuscado, int[] arreglo){
        for(int numero : arreglo){
            if(numero == numeroBuscado){
                return true;
            }
        }
        return false;
    }

    /**
     * Implementa el algoritmo de búsqueda binaria.
     * Este algoritmo es significativamente más eficiente que la búsqueda lineal,
     * pero REQUIERE que el arreglo esté previamente ordenado.
     * Funciona dividiendo repetidamente el espacio de búsqueda a la mitad.
     *
     * @param numeroBuscado El valor entero que se desea encontrar en el arreglo.
     * @param arreglo El arreglo de enteros ORDENADO donde se realizará la búsqueda.
     * @return `true` si el `numeroBuscado` se encuentra en el arreglo, `false` en caso contrario.
     */
    public boolean busquedaBinaria(int numeroBuscado, int[] arreglo){
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while(izquierda <= derecha){
            int medio = izquierda + (derecha - izquierda) / 2;

            if(arreglo[medio]==numeroBuscado){
                return true;
            }

            if(arreglo[medio] < numeroBuscado){
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return false;
    }
}
