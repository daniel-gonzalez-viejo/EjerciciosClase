package com.tiernoparla.ejerciciosclase;

public class Fibonacci {
    public static void main(String[] args) {
        
        // termino n de la sucesión de fibonacci;
        // arrays
        // recursividad
        
        int n = 16;
        
        int x1 = 1;
        int x2 = 1;
        
        int Fib;
        
        for (int i = 4; i <= n; i++) {  // "int i" es un valor que conscientemente tienes que poner menor que "n"
            Fib = x2 +x1;
            x1 = x2;
            x2 = Fib;
                System.out.println(Fib);
            } // for          
                 } //main
                    } //ALL
   
            
            

        /*
        int x3 = x2 + x1;
        int x4 = x3 + x2;
        int x5 = x4 + x3;

            System.out.println(x5);
        */
 /*
        for (int z < 47; x+y) {
            if (z == 47){
                System.out.println(z);
                
            } //if
        } //for
        
        
        
    } //main
} // All
*/
