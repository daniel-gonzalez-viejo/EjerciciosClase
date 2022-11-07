package com.tiernoparla.ejerciciosclase;

public class DígitosPares {
    
    public static void main(String[] args) {
        
        int [] num = {2,7,3,8};
        int f = 0;

        
        for (int i = 0; i < num.length; i++) {
             f = num [0+i];
                if (f%2 == 0) {
                    System.out.println(f + " es primo");
                } //if
                else{
                    System.out.println(f + " no es primo");
                }

        } //for
        
    } //main
} //all
