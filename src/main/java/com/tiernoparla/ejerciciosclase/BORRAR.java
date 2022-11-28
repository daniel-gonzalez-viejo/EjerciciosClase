package com.tiernoparla.ejerciciosclase;

import java.util.Arrays;

public class BORRAR {
        public static void main(String[] args) {
            
            int n = 0;
            int [] matriz = new int [10];
            
            for (int i = 0; i < matriz.length; i++) {
                matriz[i] = (int)(Math.random()*2);
                String str = Integer.toBinaryString(i);
                int tmp = Integer.parseInt(str);
                if (tmp / 1000 % 2 == 1) {
                    n = n + matriz[i];
                }
                System.out.print(matriz[i]);
               // System.out.print(matriz[i]);
            }
            
            System.out.println("");
            System.out.println("La suma de bits es" + n);
            
            
        } //main
}