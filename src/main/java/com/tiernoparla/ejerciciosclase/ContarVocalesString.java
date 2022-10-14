package com.tiernoparla.ejerciciosclase;

public class ContarVocalesString {
public static void main(String[] args){
        
        String srt = "magicoamente";
        
        int Vocales = 0;
        
        for (int i = 0; i < srt.length(); i++) {
        char loc = srt.charAt(i);
        if (loc == 'a' || loc == 'e' || loc == 'i'|| loc == 'o'|| loc == 'u')
        Vocales++;
        } //if
        System.out.println(Vocales);
        } //main
} //all

