package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;

public class MeterNumeroHastaNegativo {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int N1;
        System.out.println("Dame un numero: ");
        N1 = sc.nextInt();
        
        while (N1 > 0){
            N1 = N1*N1;
            System.out.println(N1);
            N1 = sc.nextInt();
            if (N1 < 0) {
                System.out.println("Se acabó");
                break;
            } //if
        } //while
    } //main
} //all
