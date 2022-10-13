package com.tiernoparla.ejerciciosclase;

public class InterésAnual {
    public static void main(String[] args) {
        
        int x = 100;
        int y = 2;
        int z = 100;
        
        for (int i = 0; i < y; i++) {
            x = x+(x*z/100);
        } //for
        System.out.println(x);
    }//main
}//all
