package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;

public class Media_sueldos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Dame diez sueldos: ");
        N = sc.nextInt();
        
        double total = 10;
        int suma = 0;
        int cap = 1000;
        int contador = 0;
        
        for (int i = 0; i < total; i++) {
            suma = N + suma;
            N = sc.nextInt();
            if (N > cap) {
                contador++;
            } //if
        } //for
        System.out.println("La suma total de los sueldos es " +  suma + " y " 
        + contador + " superan los " + cap + " euros");
    } //main
} //all
