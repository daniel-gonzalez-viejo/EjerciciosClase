package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;

public class ContarHastaN {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N1;
        int contador = 0;
        
        System.out.println("Dame un numero: ");
        N1 = sc.nextInt();
        
        while (N1 > 0){
            N1 = sc.nextInt();
            contador++;
        } //while
        System.out.println("Has introducido " + contador);
    } //main
} //all
