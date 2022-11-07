package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;

public class MétodoRecursivosEntre1yN {
    
    public static int sumar (int c) {
        return c;
    } //miMetodo
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N;
        System.out.println("Hasta que número quieres contar: ");
        N = sc.nextInt();
        
        for (int c = 1; c <= N ; c++) {
            int total = sumar (c);
            System.out.println(total);
        } //for
        
    } //main
} //MétodoRecursivosEntre1yN
