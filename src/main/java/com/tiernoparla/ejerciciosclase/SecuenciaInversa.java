package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;

public class SecuenciaInversa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int rev = 5;
        System.out.println("Añade numeros: ");
      
        int [] arr = new int [5];
        
        for (int i = 0; i < arr.length; i++) {    
         N = sc.nextInt();
         arr [i] = N;
        } //for
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[rev] == arr[rev-1]) {
                break;
            } //if
            System.out.println(arr[i]);
        }
    } //main
} //SecuenciaInversa
