package com.tiernoparla.ejerciciosclase;

public class AreaTriangulo {
    public static void main(String[] args) {
        
        int cat1 = 10; //Cateto 1
        int cat2 = 10; //Cateto 2
        int base = 18; //Base
        
        int x = base/2;
        int h = (cat1^2) + (x^2); //La altura
        double d = Math.sqrt(h); //Para sacar la raiz cuadrada de h

        double area = ((base * d) / 2);
                
        System.out.println(area);
    } //main
} //all
