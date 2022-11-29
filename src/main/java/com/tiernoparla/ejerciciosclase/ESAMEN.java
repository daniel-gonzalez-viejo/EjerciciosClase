package com.tiernoparla.ejerciciosclase;
import java.util.ArrayList;
import java.util.Scanner;


public class ESAMEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño = 0;
        System.out.println("¿Cómo de grande es el tablero?");
        tamaño = sc.nextInt();
        int tabla [] = new int [tamaño];
        
        int Posicion = 0;
        int Posicion_ordenador = (int)(Math.random()*(tamaño));
        final int USUARIO = 9;
        final int ORDENADOR = 1;
        
        boolean ganador = true;
            
        jugarTresEnRaya(tabla, Posicion, sc, ORDENADOR, USUARIO, ganador, 
                Posicion_ordenador, tamaño);
        
    } //main

    public static void jugarTresEnRaya(int[] tabla, int Posicion, Scanner sc, 
            final int ORDENADOR, final int USUARIO, boolean ganador, 
            int Posicion_ordenador, int tamaño) {
        for (int i = 0; i <= tabla.length; i++) {
            insertarFichaUsuario(Posicion, sc, tabla, ORDENADOR, USUARIO);
            
            if (saberQuienHaGanado(tabla, ORDENADOR, USUARIO, ganador)) break;
            
            System.out.println("");
            System.out.println("///////////////////");
            System.out.println("");
            
            insertarFichaOrdenador(Posicion_ordenador, tamaño, tabla, USUARIO, 
                    ORDENADOR); 
            
            if (saberQuienHaGanado(tabla, ORDENADOR, USUARIO, ganador)) break;
        } //for
    }

    public static boolean saberQuienHaGanado(int[] tabla, final int ORDENADOR, 
            final int USUARIO, boolean ganador) {
        int contador = 0;
        final String JUGADOR_ORDENADOR = "Ordenador";
        final String JUGADOR_USUARIO = "Usuario";
        System.out.println("");
        System.out.println("");
        for (int j = 1; j < tabla.length-1; j++) {
            if (tabla[j] == ORDENADOR || tabla[j] == USUARIO) {
                if (tabla[j] - tabla[j-1] == tabla[j+1] - tabla[j]) {
                    if (tabla[j] == ORDENADOR) {
                        System.out.println("Ha ganado el jugador " 
                            + JUGADOR_ORDENADOR);
                    } //if
                    else {
                        System.out.println("Ha ganado el jugador " 
                            + JUGADOR_USUARIO);
                    } //else
                    ganador = false;
                    break;
                } //if
            } //if
        } //for
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == ORDENADOR || tabla[i] == USUARIO) {
                contador++;
                if (contador == tabla.length) {
                    System.out.println("Ha habido un empate");
                    ganador = false;
                    break;
                } //if
            } //if
        } //for
        if (ganador == false) {
            return true;
        } //if
        return false;
    }

    public static void insertarFichaOrdenador(int Posicion_ordenador, 
            int tamaño, int[] tabla, final int USUARIO, final int ORDENADOR) {
        for (int j = 0; j < 9999; j++) {
            Posicion_ordenador = (int)(Math.random()*tamaño);
            while (tabla[Posicion_ordenador] == USUARIO 
                    || tabla[Posicion_ordenador] == ORDENADOR) {
                Posicion_ordenador = (int)(Math.random()*tamaño);
            } //while
        } //for
        tabla[Posicion_ordenador] = ORDENADOR;
        
        printearLaTabla(tabla);
        
        System.out.println("");
        System.out.println("El ordenador ha hecho su jugada");
    }

    public static void insertarFichaUsuario(int Posicion, Scanner sc, 
            int[] tabla, final int ORDENADOR, final int USUARIO) {
        System.out.println("");
        System.out.println("Dame una posicion: ");
        Posicion = sc.nextInt();
        while (Posicion >= tabla.length || Posicion < 0) {
            System.out.println("Posición no disponible, pon otra posición");
            Posicion = sc.nextInt();
        } //while
        while (tabla[Posicion] == ORDENADOR || tabla[Posicion] == USUARIO) {
            System.out.println("Posicion usada, pon otra posición");
            Posicion = sc.nextInt();
        } //while
        tabla[Posicion] = USUARIO;
        System.out.println("");
        printearLaTabla(tabla);
    }

    public static void printearLaTabla(int[] tabla) {
        for (int j = 0; j < tabla.length; j++) {
            System.out.print(tabla[j]);
        } //for
    }
} //all
