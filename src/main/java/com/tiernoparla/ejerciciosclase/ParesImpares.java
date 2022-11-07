package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int N1;
        System.out.println("Dame un numero: ");
        N1 = sc.nextInt();
        
        while (true){
            if (N1%2 == 0) {
                if (N1 == 0) {
                    break;
                } //if
                System.out.println(N1 + " es par");
                N1 = sc.nextInt();
            } //if
            else if (N1%2 != 0) {
                System.out.println(N1 + " no es par");
                N1 = sc.nextInt();
            } //else if
        } //true
    } //main
} //all
