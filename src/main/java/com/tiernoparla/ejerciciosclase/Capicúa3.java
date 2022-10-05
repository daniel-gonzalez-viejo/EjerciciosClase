package com.tiernoparla.ejerciciosclase;

public class Capicúa3 {
    public static void main(String[] args) {
        int n = 1551;
        
        int tmp = n;
        int cifra;
        int reverso = 0;
        
        while(tmp > 0) {
            
            cifra = tmp % 10;
            reverso = reverso*10 + cifra;
            tmp = tmp/10;
            
        } //while
            System.out.println(reverso);
    } //main
    
} //all
