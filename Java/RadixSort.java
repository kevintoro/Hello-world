/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Arrays;

/**
 *
 * @author Kevin Toro
 */
public class RadixSort {

    public static void radixSort(int A[], int n){
        int m, exp;
        m= maxValor(A, n);
        
        for(exp = 1; m/exp > 0; exp *= 10)
            contarOrdenar(A, n, exp);
    }

    //Un metodo util para obtener el maximo valor en el Array
    public static int maxValor(int A[], int n) {
        int max;
        max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    //Un metodo para hacer el conteo de tipo Array segun el digito representado por exp
    public static void contarOrdenar(int A[], int n, int exp) {
        int salida[], i, contar[];
        salida = new int[n];
        contar = new int[n];
        /*Asigna el valor int especificado a cada elemento de la matriz especificada de ints.
        Parámetros:
        a - la matriz que debe llenarse
        val - el valor que se almacenará en todos los elementos de la matriz*/
        Arrays.fill(contar, 0);

        for (i = 0; i < n; i++) 
            contar[(A[i] / exp) % 10]++;
        

        for (i = 1; i < n; i++) 
            contar[i] += contar[i - 1];
        
        for (i = n - 1; i >= 0; i--){
            salida[contar[ (A[i]/exp)%10 ] - 1] = A[i];
            contar[ (A[i]/exp)%10 ]--;
        }
        
        for (i = 0; i < n; i++) {
            A[i]=salida[i];
        }    
    }
   
}
