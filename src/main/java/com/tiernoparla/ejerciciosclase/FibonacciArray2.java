package com.tiernoparla.ejerciciosclase;


public class FibonacciArray2 {
    public static void main(String[] args) {
        
        int n= 6;
       
        int[] Alm = new int[n];
        
        Alm [0] = 1;
        Alm [1] = 1;
        
        
        for (int i = 2; i < n; i++) {
            Alm[i] = Alm[i-1] + Alm[i-2];
        } //for
        
        for (int i = 0; i < Alm.length; i++) {

            
            System.out.println(Alm[i]);
            
        } //for
    } //main
} //all
