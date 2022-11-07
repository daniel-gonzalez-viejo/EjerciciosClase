package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;

public class MúltiploDe3 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int N;
        final int total = 5;
        
        for (int i = 0; i <= total; i++) {
            System.out.println("Dame un número: ");
            N = sc.nextInt();
            if (N%3 == 0) {
                System.out.println(N + " es múltiplo de 3 ");
            } //if
        } //for
    } //main
} //all
