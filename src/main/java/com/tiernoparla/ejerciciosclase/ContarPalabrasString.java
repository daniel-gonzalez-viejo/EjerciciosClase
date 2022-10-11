package com.tiernoparla.ejerciciosclase;

public class ContarPalabrasString {
    public static void main(String[] args) {
        String str = "   Salimos   a   las     20    ";
        str = str.trim(); //Para borrar caracteres en blanco iniciales y finales
        String[] palabras = str.split("\\s+"); // Para borrar espacios en blanco y duplicados 
        System.out.println(palabras.length);
    } //main
}//all
