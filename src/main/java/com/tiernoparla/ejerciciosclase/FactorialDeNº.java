package com.tiernoparla.ejerciciosclase;

public class FactorialDeNÂș {

    public static void main(String[] args) {

        final int total = 8;
        int facto = 1;
        int prov = 1;

        for (int i = 1; i <= total; i++) {
            facto = i * prov;
            prov = facto;
            System.out.println(facto);
        } //for
    } //main
} //all
