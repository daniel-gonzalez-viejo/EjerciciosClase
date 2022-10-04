package com.tiernoparla.ejerciciosclase;

import java.lang.Math;

public class Capicúa {
    public static void main(String[] args) {
        int n = 1435;
        int tam = 4; //El tamaño de cifras de n
        int tmp = n; //Variable temporal
        // int cifra;
        int [] cifras = new int[tam];
        
        
        for (int i = 0; i < tam; i++) {
        cifras[i] = tmp % 10;
        // System.out.println(cifras[i]);
        tmp = tmp/10;
        }
        
        //recuperar el número original
        System.out.println(cifras[0]*Math.pow(10,tam-1));
        System.out.println(cifras[1]*Math.pow(10,tam-2));
        System.out.println(cifras[2]*Math.pow(10,tam-3));
        System.out.println(cifras[3]*Math.pow(10,tam-4));
        
        double x = cifras[0]*Math.pow(10,tam-1) + cifras[1]*Math.pow(10,tam-2) + cifras[2]*Math.pow(10,tam-3) + cifras[3]*Math.pow(10,tam-4);
        System.out.println(x);
        
        /*
        System.out.println(n%10); //primera cifra
        System.out.println((n/10)%10); //segunda cifra
        System.out.println(((n/10)/10)%10); //tercera cifra
        System.out.println((((n/10)/10)/10)%10); //cuarta cifra
*/
    }
}
