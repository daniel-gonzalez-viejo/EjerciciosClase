package com.tiernoparla.ejerciciosclase;

public class Arrays {
    public static void main(String[] args) {
        
        String [] palabras = {"hola", "adios"};
        
        String [] palabras2 = new String[23]; // Para fijar cantidad de memoria en el Array
        
        System.out.println(palabras2[4]);
        
        
        
        
        System.out.println(palabras[0]);
        System.out.println(palabras[1]);
        
        palabras [0] = "algo aqui";
        System.out.println(palabras[0]);
        
        for (int i = 0; i < palabras.length; i++){ // Mientras que i sea menor que la lngitud maxima del array, hará lo indicado
            System.out.println(palabras[i]);
        }
    } //main

    static boolean toString(int[] arr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} //Arrays
