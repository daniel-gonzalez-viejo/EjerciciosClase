package com.tiernoparla.ejerciciosclase;

public class FibonacciArray {
    public static void main(String[] args) {
        
        // 1º declaro array tamaño 3 de int (x1, x2, Fib)
        // 2º inicializo el array con {x1= 1, x2 = 1, Fib = 2}
        // 3º hago el for --> pero sustituyendo 
        
        int [] ejemplos = {1, 1, 0, 7};
        
        
        for (int i = 3; i <= ejemplos[3]; i++) {
            ejemplos[2] = ejemplos[1] + ejemplos[0];
            ejemplos[0] = ejemplos[1];
            ejemplos[1] = ejemplos[2];
            System.out.println(ejemplos[2]);
            
        } //for
        
        
        
        
        
        } //main
    } // all
