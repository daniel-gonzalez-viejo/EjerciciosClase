package com.tiernoparla.ejerciciosclase;

public class Coche { // creación de la clase
    //atributos:

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;
    // constructor: 

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;

        
    }

    // comportamientos o métodos:

    public void acelerar(Integer cantidad) {
        this.velocidad += cantidad;
        
        
    }
}
