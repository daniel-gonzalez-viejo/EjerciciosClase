package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;

public class Media_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N;
        int total = 10;
        int posi = 0;
        int nega = 0;
        int contador_nega = 0;
        int contador_posi = 0;
        int contador_ceros = 0;
        
        System.out.println("Dame diez números: ");
        N = sc.nextInt();
        
        for (int i = 0; i <= total; i++) {
            if (N < 0) {
                nega = N;
                contador_nega++;
                N = sc.nextInt();
            } //if
            else if (N > 0) {
                posi = N;
                contador_posi++;
                N = sc.nextInt();
            } //else if
            else {
                contador_ceros++;
                N = sc.nextInt();
            } //if
        } //for
        System.out.println("Has introducido " + contador_nega + " números negativos y la media es " + nega/contador_nega);
        System.out.println("Has introducido " + contador_posi + " números positivos y la media es " + posi/contador_posi);
        System.out.println("Has introducido " + contador_ceros + " veces el número 0");
    } //main
} //all
