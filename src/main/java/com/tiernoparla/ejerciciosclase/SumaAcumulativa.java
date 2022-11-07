package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;

public class SumaAcumulativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1;
        int fin = 0;
        
        System.out.println("Dame un numero: ");
        N1 = sc.nextInt();
        
        while (N1 != 0){
            fin = fin + N1;
            N1 = sc.nextInt();
        } //while
        System.out.println("La suma total es " + fin);
    } //main
} //all
