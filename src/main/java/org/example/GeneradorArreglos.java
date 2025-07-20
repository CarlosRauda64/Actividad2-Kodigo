package org.example;
import java.util.*;

public class GeneradorArreglos {

    /**
     * Genera un arreglo de enteros con números aleatorios.
     * Los números generados estarán en el rango de 0 (inclusive) a `tamano` (exclusivo).
     *
     * @param tamano El tamaño deseado para el arreglo.
     * @return Un nuevo arreglo de enteros de tamaño `tamano` con valores aleatorios.
     */
    public static int[] generarArregloRandmo(int tamano){
        int[] arreglo = new int[tamano];
        Random rand = new Random();
        for (int i = 0; i < tamano; i++){
            arreglo[i] = rand.nextInt(tamano);
        }
        return arreglo;
    }
}
