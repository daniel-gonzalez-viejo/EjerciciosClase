package com.tiernoparla.ejerciciosclase;

public class SumarCifrasEntero {
    public static void main(String[] args) {
        float num [] = {1245};
        int n = 0;
        int resultado = 0;
        int tam = num.length;
        int[] cifras = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            resultado += n % 10;
            n = n / 10;
            n = n+(n-1);
        } //for
        System.out.println(resultado);
    }//main
} //all


