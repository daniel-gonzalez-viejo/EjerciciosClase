package com.tiernoparla.ejerciciosclase;

public class ContarLetrasString {
    public static void main(String[] args) {
        
        String str = "aoiio";
        int v = 0;
        
        for (int i = 0; i < str.length (); i++) {
            char loc = str.charAt(i);
                if ((str.matches("[a/e/i/o/u]*"))){
                v++;
                } //if
        } //for
        System.out.println(v);
    } //main
} //all
