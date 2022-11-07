package com.tiernoparla.ejerciciosclase;

import java.util.Scanner;

public class NumerosConsecutivos {
    
    //método que calcule cuantas veces tiene un númeor a otro como factor (descomposicion tipo 81 = 3^4 = 9^2)
//método que diga si todos los dígitos de un número son pares
//método que diga si todos los caracteres de una string son vocalees (REGEX) / que cuente cuantas vocales hay
//metodo que de la vuelta a una string

//import java.util.Random;

// import java.util.StringTokenizer;



 public static void main(String[] args) {
//método que le das 3 números y te dice si "uno es el de en medio"
        Scanner sc = new Scanner(System.in);
        int N1;
        System.out.println("Dame un numero entero: ");
        N1 = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        int N2;
        System.out.println("Dame un numero entero: ");
        N2 = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        int N3;
        System.out.println("Dame un numero entero: ");
        N3 = sc3.nextInt();

        for (int i = 0; i < 1; i++) {

            //int A = N % 10; // Saco el 3
            //int B = N / 10; // 
            //int C = B % 10; // Saco el 2
            //int D = B / 10; // Saco el 1
            if (N1 - N2 == N2 - N3) {
                System.out.println(N2 + " es el numero de en medio");
            } else {
                System.out.println(N2 + " no es el numero de en medio");
            }

        }//for
    }//main
}//public
/*
//>>>>>método que le metes N númeors y te dice si son consecutivos o no<<<<<\
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Dame tres numero enteros: ");
        N = sc.nextInt();

        for (int i = 0; i < 1; i++) {

            int A = N % 10; //saco el tercer numero
            int B = N / 10; //Saco el resto de numero
            int C = B % 10;
            int D = B / 10;

            if (D + 1 == C && C + 1 == A) {
                System.out.println("Son numeros consecutivos");
            } else {
                System.out.println("No son numeros consecutivos");
            }

        }
 */
    

    

