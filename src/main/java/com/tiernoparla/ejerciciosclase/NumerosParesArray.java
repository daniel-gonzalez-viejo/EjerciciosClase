package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;
public class NumerosParesArray {
    

// import java.util.StringTokenizer;


    public static void main(String[] args) {
//método que diga si todos los dígitos de un número son pares

        Scanner sc = new Scanner(System.in);
        int N1;
        System.out.println("Dame un numero de hasta 3 digitos: ");
        N1 = sc.nextInt();

        while (N1 > 0){
            
            int cifra = N1 % 10;
            N1 = N1/10; 
            
            if(cifra % 2 == 0){
                System.out.println(cifra +" es un numero par");
            } //if
            
            else{
                System.out.println(cifra +" no es un numero par");
            } //else
            
        } //while
    } //main
} //all
    

