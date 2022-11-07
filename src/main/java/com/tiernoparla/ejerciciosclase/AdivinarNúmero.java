package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;

public class AdivinarNúmero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Adivina el número: ");
        N = sc.nextInt();

        double x = (int)(Math.random()*100);

        while (N != x) {

            if (N < x) {
                System.out.println("Es mayor");
                N = sc.nextInt();
            } //if
            else if (N > x) {
                System.out.println("Es menor");
                N = sc.nextInt();
            } //else if
        } //while
        System.out.println("Has acertado");
    } //main
} //all
