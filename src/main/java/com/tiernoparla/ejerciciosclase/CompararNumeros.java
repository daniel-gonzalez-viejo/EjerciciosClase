package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1;
        System.out.println("Dame un numero: ");
        N1 = sc.nextInt();
        
        while (N1 > 0 || N1 < 0){
            if (N1 > 0) {
                System.out.println(N1 + " es mayor que 0");
                N1 = sc.nextInt();
            } //if
            else if (N1 < 0){
                System.out.println(N1 + " es menor que 0");
                N1 = sc.nextInt();
            } //else if
            else {
                break;
            } //else
        } //while
    } //main
} //all
