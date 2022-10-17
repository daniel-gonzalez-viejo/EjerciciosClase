package com.tiernoparla.ejerciciosclase;

public class Password {
    public static void main(String[] args) {
        
        String str = "magicamente98";
        int lon = 10;
        int counter = 0;

        // NO ESTÁ ACABADO
        if (str.length() > lon){ // La expresión ("[a-zA-Z0-9]*") sirve para alcanzar todos los caracteres alfanumericos
            System.out.println("La contraseña es correcta1");
        } //if
        if (str.matches("[a-zA-Z0-9]*")) {
            System.out.println("La contraseña es correcta2");
        } //if
        for (char c: str.toCharArray()){
            if (Character.isDigit(c)){
                counter++;
            } //if
        } //for
        if (counter >= 2){
            System.out.println("La contraseña es correcta3");
        } //if
    } //main
} //all
