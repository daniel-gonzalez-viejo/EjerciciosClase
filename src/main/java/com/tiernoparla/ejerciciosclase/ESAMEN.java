package com.tiernoparla.ejerciciosclase;
import java.util.Scanner;


public class ESAMEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = 17;
        int tabla [] = new int [N];
        int a = (int)Math.sqrt(N);
        
        int Posicion;
        int Posicion_ordenador = (int)(Math.random()*17);
        int Usuario = 9;
        int Ordenador = 1;
        boolean ganador = true;
            
        for (int i = 0; i <= tabla.length; i++) {
            System.out.println("");
            System.out.println("Dame una posicion: ");
            Posicion = sc.nextInt();
            if (tabla[Posicion] == 1 || tabla[Posicion] == 9) {
                System.out.println("Posicion usada, pon otra posicion");
                Posicion = sc.nextInt();
            } //if
            tabla[Posicion] = Usuario;
            System.out.println("");
            for (int j = 0; j < tabla.length; j++) {
                System.out.print(tabla[j]);
            } //for
            
            ///////////////////////////////////////////////////
            
            System.out.println("");
            System.out.println("////////////////////////");
            System.out.println("");
            //tabla[Posicion_ordenador] = Ordenador;
            for (int j = 0; j < 9999; j++) {
                Posicion_ordenador = (int)(Math.random()*N);
                if (tabla[Posicion_ordenador] == 1 || tabla[Posicion_ordenador] == 9) {
                    Posicion_ordenador = (int)(Math.random()*N);
                } //if
              //  System.out.println(Posicion_ordenador);
            } //for
            tabla[Posicion_ordenador] = Ordenador;
          //  System.out.println("");
          /*  for (int j = 0; j < tabla.length; j++) {
                System.out.print(tabla[j]);
            } //for
          */ // System.out.println("");
            System.out.println("El ordenador ha hecho su jugada");
            
            for (int j = 0; j < tabla.length; j++) {
                if (tabla[j] == 9) {
                    if (tabla[j] == tabla[j+1]) {
                        if (tabla[j+1] == tabla[j+2]) {
                            System.out.println("Ha ganado un jugador");
                            ganador = false;
                            break;
                        } //if
                    } //if
                }
            } //for
            if (ganador == false) {
                break;
            } //if
            
        } //for
            
            
        
    } //main
} //all
