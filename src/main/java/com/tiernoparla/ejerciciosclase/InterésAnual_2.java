package com.tiernoparla.ejerciciosclase;

public class InterésAnual_2 {
        public static void main(String[] args) {
        
        int x = 10000;
        int y = 3;
        int i = 0;
        
        while (i < y) {
            x = x+(x*5/100);
            i++;
        } //for
        System.out.println(x);
    }//main
}//all
