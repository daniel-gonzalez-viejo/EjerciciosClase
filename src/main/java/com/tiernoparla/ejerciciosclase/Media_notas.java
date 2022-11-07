package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;

public class Media_notas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N;
        final int total = 6;
        int contador_aprobados = 0;
        int contador_suspensos = 0;
        int contador_condicionados = 0;
        
        System.out.println("Dame seis notas: ");
        
        
        
        for (int i = 0; i < total; i++) {
            N = sc.nextInt();
            if (N >= 5) {
                contador_aprobados++;
            } //if
            else if (N == 4) {
                contador_condicionados++;
            } //else if
            else if (N < 4) {
                contador_suspensos++;
            } //else if
        } //for
        System.out.println("Han aprobado " + contador_aprobados + 
        ",han suspendido " + contador_suspensos + 
        " y se han quedado condicionados " + contador_condicionados + 
        " alumnos");
    } //main
} //all
