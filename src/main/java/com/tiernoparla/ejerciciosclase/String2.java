package com.tiernoparla.ejerciciosclase;

public class String2 {
    public static void main(String[] args) {
        String let = "abcde";
        String output;
       
        
        if ((let.length () % 2) == 0) {
            output = let.substring((let.length()/2)-1, (let.length()/2)+1);
        } //if
        else {
            output = String.valueOf(let.charAt(let.length()/2));
        } //else
        String substr = let.substring (1,2);
        System.out.println(output);

    } //main
} //all
