package com.tiernoparla.ejerciciosclase;

public class Password {
    public static void main(String[] args) {
        
        String str = "magicamente10";
        int lon = 10;
        // NO ESTÁ ACABADO
        if (str.length() < lon && str.substring(1, 10).matches("[a-z]*") && str.substring(1, 10).matches("[0-9]*")){
            System.out.println("La contraseña es correcta1");
        }//if
        /*else if (str.substring(0, 3).matches("[A-Z]*")){
            System.out.println("La contraseña es correcta2");
        } // else if
        else if (str.substring(0, 3).matches("[0-9]*")){
            System.out.println("La contraseña es correcta3");
        } // else if
        */
        else{
            System.out.println("La contraseña no es correcta");
        } //else
    } //main
} //all
