package com.tiernoparla.ejerciciosclase;

public class TablasMultiplicar {
    
    public static void main(String[] args) {
       
        int N [] = {2,3,4,7};
        int resultado = 0;
        int finalTabla = 10;
        
        for (int i = 1; i <= finalTabla; i++) {  
            for (int j = 0; j < 4; j++) {
            
            resultado = N[j]*i;
            System.out.print(resultado + " , ");
            } //for
                System.out.println(" ");
        } //for
        
    } //main
} //all
