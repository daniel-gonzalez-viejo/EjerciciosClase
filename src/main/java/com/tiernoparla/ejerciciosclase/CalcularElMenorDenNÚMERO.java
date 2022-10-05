package com.tiernoparla.ejerciciosclase;

public class CalcularElMenorDenNÚMERO {
    public static void main(String[] args) {
        
        double [] num  = {7.4,9.8,7.4,2.7,8.4};
        double min = num [0];
         
            
        for (int i = 1;i < num.length; i++) {
           if (min > num[i]) {
            min = num [i];
            
        } //if 
            System.out.println(min);
                     } //for
                
    } //main 
} //all
