package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;

public class MediaAcumulativa {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N1;
        int total = 0;
        int contador = 0;
        
        System.out.println("Dame un numero: ");
        N1 = sc.nextInt();
        
        while (N1 > 0) {
            total = total + N1;
            contador++;
            N1 = sc.nextInt();
        } //while
        System.out.println("La media de los numeros introducidos es " + (total/contador));
    } //main
} //all
