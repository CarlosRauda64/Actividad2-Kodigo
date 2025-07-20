package org.example;

import java.util.Arrays;

public class MainAlgoritmosOrdenamiento {
    public static void main(String[] args) {
        int[] tamanos = {1000, 10000, 100000};
        double duracionSegundos;

        for(int tamano : tamanos){

            int bandera = 1;
            System.out.println("\n--- Pruebas para tamaño de datos: "+tamano+" ---");
            int[] arreglo = GeneradorArreglos.generarArregloRandmo(tamano);
            /*Copia para no modificar el original y hacer multiples pruebas*/
            int[] arregloParaOrdenamiento1 = Arrays.copyOf(arreglo, tamano);
            int[] arregloParaOrdenamiento2 = Arrays.copyOf(arreglo, tamano);
            AlgoritmosOrdenamiento algoritmosOrdenamiento = new AlgoritmosOrdenamiento();
            System.out.println("Algoritmo de Ordenamiento Burbuja");
            long comienzoBurbuja = System.nanoTime();
            algoritmosOrdenamiento.ordenamientoBurbuja(arreglo);
            long finBurbuja = System.nanoTime();
            long duracionBurbuja  = (finBurbuja - comienzoBurbuja);
            duracionSegundos = (double) duracionBurbuja / 1_000_000_000.0;
            System.out.println("Tiempo del algoritmo (En segundos):"+duracionSegundos);
            System.out.println("--------------------------------------------------");

            System.out.println("Algoritmo de Ordenamiento por Selección");
            long comienzoSeleccion = System.nanoTime();
            algoritmosOrdenamiento.ordenamientoSeleccion(arregloParaOrdenamiento1);
            long finSeleccion = System.nanoTime();
            long duracionSeleccion = (finSeleccion - comienzoSeleccion);
            duracionSegundos = (double) duracionSeleccion / 1_000_000_000.0;
            System.out.println("Tiempo del algoritmo (En segundos):"+duracionSegundos);
            System.out.println("--------------------------------------------------");

            System.out.println("Algoritmo de Ordenamiento por Inserción");
            long comienzoInsercion = System.nanoTime();
            algoritmosOrdenamiento.ordenamientoInsercion(arregloParaOrdenamiento2);
            long finInsercion = System.nanoTime();
            long duracionInsercion = (finInsercion - comienzoInsercion);
            duracionSegundos = (double) duracionInsercion / 1_000_000_000.0;
            System.out.println("Tiempo del algoritmo (En segundos):"+duracionSegundos);
            System.out.println("--------------------------------------------------");
        }
    }
}
