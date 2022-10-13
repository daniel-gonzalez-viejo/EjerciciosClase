package com.tiernoparla.ejerciciosclase;

public class AñoBisiesto {
    public static void main(String[] args) {
        
        int y = 1992;     
        
            if (y%4 != 0 ){
                System.out.println("El año " + y + " no es bisiesto");
            } //if
            
            else if (y%100 != 0 ){
                System.out.println("El año " + y + " es un bisiesto");
            } // else if
        
            else if (y%400 != 0 ){
                System.out.println("El año " + y + " no esbisiesto");
            } //else if
            
            else {
                System.out.println("El año " + y + " es bisiesto");
            } //else
    } //main
} //all
