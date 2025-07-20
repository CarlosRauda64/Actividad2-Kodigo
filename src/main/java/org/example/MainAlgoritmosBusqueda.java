package org.example;

import java.util.Arrays;

public class MainAlgoritmosBusqueda {
    public static void main(String[] args) {
        int[] tamanos = {10000, 100000, 1000000};
        int numeroBuscadoExistente = 5;
        int numeroBuscadoNoExistente = -1;

        for(int tamano : tamanos){
            System.out.println("\n--- Pruebas para tamaño de datos: "+tamano+" ---");

            int[] arreglo = GeneradorArreglos.generarArregloRandmo(tamano);
            /*Copia para no modificar el original y hacer multiples pruebas*/
            int[] arregloParaOrdenamiento = Arrays.copyOf(arreglo, tamano);

            double duracionSegundos;

            /*Algoritmo de Busqueda Lineal*/
            System.out.println("Algoritmo de Busqueda Lineal");
            AlgoritmosBusqueda algoritmosBusqueda = new AlgoritmosBusqueda();
            long comienzoLineal = System.nanoTime();
            imprimirPrediccion(algoritmosBusqueda.busquedaLineal(numeroBuscadoExistente, arreglo));
            imprimirPrediccion(algoritmosBusqueda.busquedaLineal(numeroBuscadoNoExistente, arreglo));
            long finLineal = System.nanoTime();
            long duracionLineal = (finLineal - comienzoLineal);
            duracionSegundos = (double) duracionLineal / 1_000_000_000.0;
            System.out.println("Tiempo del algoritmo (En segundos):"+duracionSegundos);
            System.out.println("--------------------------------------------------");

            /*Algoritmo de Busqueda Binaria*/
            System.out.println("Algoritmo de Busqueda Binaria");
            Arrays.sort(arreglo);
            long comienzoBinaria = System.nanoTime();
            imprimirPrediccion(algoritmosBusqueda.busquedaBinaria(numeroBuscadoExistente, arreglo));
            imprimirPrediccion(algoritmosBusqueda.busquedaBinaria(numeroBuscadoNoExistente, arreglo));
            long finBinaria = System.nanoTime();
            long duracionBinaria = (finBinaria - comienzoBinaria);
            duracionSegundos = (double) duracionBinaria / 1_000_000_000.0;
            System.out.println("Tiempo del algoritmo (En segundos):"+duracionSegundos);
            System.out.println("--------------------------------------------------");
        }
    }

    /**
     * Método auxiliar para imprimir el resultado de una búsqueda.
     *
     * @param bandera `true` si el número fue encontrado, `false` en caso contrario.
     */
    public static void imprimirPrediccion(boolean bandera){
        if(bandera){
            System.out.println("Se encontro el numero");
        } else {
            System.out.println("No se encontro el numero");
        }
    }
}