package com.tiernoparla.ejerciciosclase;

import java.lang.Math;

public class Capicúa2 {
    public static void main(String[] args) {
        int n = 31752;
        int tam = 5;
        int tmp= n;
        
        int[] cifras = new int[tam];
        
        double x = 0;
        for (int i = 0; i < tam; i++) {
            cifras[i] = tmp % 10;
            tmp = tmp/10;
            
        } //for
        
        for (int i = 0; i < tam; i++) {
            x = x + cifras[i]*Math.pow(10,tam-(i+1));
        } //for
        System.out.println(x);
       // double x = cifras[0]*Math.pow(10,tam-5) + cifras[1]*Math.pow(10,tam-4) + cifras[2]*Math.pow(10,tam-3) + cifras[3]*Math.pow(10,tam-2) + cifras[4]*Math.pow(10,tam-1);
        /*System.out.println(cifras[0]*Math.pow(10,tam-5));
        System.out.println(cifras[1]*Math.pow(10,tam-4));
        System.out.println(cifras[2]*Math.pow(10,tam-3));
        System.out.println(cifras[3]*Math.pow(10,tam-2)); 
        System.out.println(cifras[4]*Math.pow(10,tam-1)); 
        */
        
        
        //System.out.println(n%10);
        //System.out.println((n/10)%10);
    } //main
} //all
