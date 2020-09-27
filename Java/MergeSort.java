/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author 1151504
 */
public class MergeSort {

    //Tamaño Array n=fin-ini+1
    public static void mergeSort(int A[], int ini, int fin) {

        if (ini >= fin) {
            return;
        }
        int m = (int) ((ini + fin) / 2);
        mergeSort(A, ini, m);
        mergeSort(A, m + 1, fin);
        merge(A, ini, m, fin);

    }

    public static void merge(int A[], int ini, int m, int fin) {

        int B[] = new int[fin - ini + 1];
        int i, j, k;
        i = ini;
        j = m + 1;
        k = 0;
        while (i <= m && j <= fin) {
            if (A[i] < A[j]) {
                B[k] = A[i];
                i = i + 1;
            } else {
                B[k] = A[j];
                j = j + 1;
            }
            k = k + 1;
        }
        while (i <= m) {
            B[k] = A[i];
            i = i + 1;
            k = k + 1;
        }
        while (j <= fin) {
            B[k] = A[j];
            j = j + 1;
            k = k + 1;
        }
        i = ini;
        k = 0;
        while (i <= fin) {
            A[i] = B[k];
            i = i + 1;
            k = k + 1;
        }

    }

}
