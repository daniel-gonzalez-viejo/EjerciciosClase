package com.tiernoparla.ejerciciosclase;

public class HojaEnSucio2 {
    
    public static boolean continuarBucle(int[] digitos, final int X) {
        return digitos[0] < X && digitos[1] < X && digitos[2] < X && digitos[3] < X && digitos[4] < X;
    } //continuarBucle
    
     public static int printearLinea(int[] digitos) {
        return digitos[0]+digitos[1]+digitos[2]+digitos[3]+digitos[4];
    } //printearLinea
    
    public static void main(String[] args) {
        
        final int X = 10;
        int digitos [] = new int [5];
        
        while(continuarBucle(digitos, X)) {
            System.out.println(printearLinea(digitos));
            digitos[0]++;
            
            if (digitos[0] == 10) {
                digitos[1]++;
                digitos[0] = 0;
            } //if
            
            if (digitos[1] == 10) {
                digitos[2]++;
                digitos[1] = 0;
            } //if
            
            if (digitos[2] == 10) {
                digitos[3]++;
                digitos[2] = 0;
            } //if
            
            if (digitos[3] == 10) {
                digitos[4]++;
                digitos[3] = 0;
            } //if
            
        } //while
        
    } //main


} //all
