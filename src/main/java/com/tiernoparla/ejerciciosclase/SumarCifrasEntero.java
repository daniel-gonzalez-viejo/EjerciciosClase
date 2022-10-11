package com.tiernoparla.ejerciciosclase;

public class SumarCifrasEntero {
    public static void main(String[] args) {
        float [] num = {1245};
        int n = 0;
        for (int i = 0; i < num.length; i++) {
            n= n+i%10;
        } //for
        System.out.println(n);
    }//main
} //all
