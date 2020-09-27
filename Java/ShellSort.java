/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Kevin Toro
 */
public class ShellSort {

    //ShellSort es una mejora del algoritmo de ordenamiento InsertionSort
    public static void shellSort(int A[], int n) {
        int i, j, salto, aux;

        //Comenzaremos con un gran salto
        salto = n / 2;

        while (salto > 0) {
            i = salto;
            while (i < n) {
                aux = A[i];
                //Cambiaremos el elemento ordenado por salto a su ubicacion correcta
                for (j = i; (j >= salto) && (A[j - salto] > aux); j -= salto) {
                    A[j] = A[j - salto];
                }
                //Cambiamos lo que esta en A[j] por aux e incrementamos i en 1
                A[j] = aux;
                i = i + 1;
            }
            //Reducimos el salto a la mitad
            salto = salto / 2;
        }

    }
}
