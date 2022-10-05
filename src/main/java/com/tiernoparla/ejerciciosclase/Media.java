package com.tiernoparla.ejerciciosclase;


public class Media {
    public static void main(String[] args) {
        float [] num = {4,3,5,6};
        float n = 0;
        
        for (int i = 0; i < num.length; i++) {
            n = n + num [i];
        } // for
            System.out.println(n/num.length);
    } //main
} //all
