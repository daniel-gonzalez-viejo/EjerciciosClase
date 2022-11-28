package com.tiernoparla.ejerciciosclase;

import java.util.Arrays;
import java.util.*;

public class PRACTICA_DEFINITIVA {

    public static int[] insertarBitsParidad(int[] matriz2, int index, int value) {
        int[] result = new int[matriz2.length + 1];
        System.arraycopy(matriz2, 0, result, 0, index);
        result[index] = value;
        System.arraycopy(matriz2, index, result, index + 1, matriz2.length - index);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;

        System.out.println("¿Como de grande quieres que sea la matriz?");
        A = sc.nextInt();

        int value = 0;
        int index = 0;

        int N = (int) (Math.sqrt(A));
        int bits_paridad = 0;
        int pot = 1;
        int M = 0;
        

        int matriz[][] = new int[N][N];
        int matriz2[] = new int[A];

        System.out.println("MATRIZ GENERADA");
        System.out.println("---------------");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random() * 2); //Se sustituyen las variables "x" e "y" por aleatorios entre "0" y "1"
                matriz2[M] = matriz[x][y];
                M++;
            } //for
            System.out.println();
        } //for
        
        for (int i = 0; i < matriz2.length; i++) {
            System.out.print(matriz2[i]);
            if ((i+1) % N == 0) {
                System.out.println("");
            } //if
        }

        ///////////////////////////////////////////////////////////////////////
        System.out.println("");
        System.out.println("CUANTOS BITS SE NECESITAN");
        System.out.println("---------------");

        for (int i = 1; i <= A; i++) {
            pot = pot * 2;
            bits_paridad = i;
            if (pot > A) {
                System.out.println("Se necesitan " + bits_paridad + " bits de paridad");
                break;
            } //if
        } //for

        ///////////////////////////////////////////////////////////////////////
        System.out.println("");
        System.out.println("NUEVA MATRIZ CON LOS BITS DE PARIDAD VACÍOS");
        System.out.println("---------------");

        if (matriz2[0] == matriz2[0]) {
            matriz2 = insertarBitsParidad(matriz2, index, value);
            index = 1;
        }

        for (int i = 1; i < matriz2.length + 1; i++) {
            System.out.print(matriz2[i - 1]);
            if (1 == index) {
                matriz2 = insertarBitsParidad(matriz2, index, value);
                index = 2;
            } //if
            if (i == index) {
                matriz2 = insertarBitsParidad(matriz2, index, value);
                index = index * 2;
            } //if
        } //for     

        System.out.println("");
        System.out.println("");
        System.out.println("NUEVA MATRIZ CON LOS BITS DE PARIDAD LLENOS");
        System.out.println("---------------");

        int z = 0;
        int incremental = 1;
        int posicion = 1;

        for (int x = 0; x < bits_paridad; x++) {
            for (int i = 0; i < matriz2.length; i++) {
                String str = Long.toBinaryString(i); //Convertir la posición actual del bucle en string binario 
                long tmp = Long.parseLong(str); //Convertir el string binario en un int para trabajar con él
                if (tmp / incremental % 2 == 1) {
                    z = z + matriz2[i];
                } //if
            } //for

            if (z % 2 == 0) {
                matriz2[posicion] = 0;
            } //if

            if (z % 2 == 1) {
                matriz2[posicion] = 1;
            } //if
            z = 0;
            posicion = posicion * 2;
            incremental = incremental * 10;
        } //for

        /////////CONTAR LOS BITS DE PARIDAD PARA CREAR EL BIT GLOBAL/////////
        int sum = Arrays.stream(matriz2).sum();
        if (sum % 2 == 0) {
            matriz2[0] = 0;
        } //if
        else if (sum % 2 == 1) {
            matriz2[0] = 1;
        } //else if

        //////VOLVER A PRINTEAR LA MATRIZ PARA VER SI SE PONEN LOS BITS DE PARIDAD////////
        for (int i = 0; i < matriz2.length; i++) {
            System.out.print(matriz2[i]);

        } //for   

        System.out.println("");
        System.out.println("");
        System.out.println("PROVOCAR LOS CAMBIOS ALEATORIOS");
        System.out.println("---------------");

        int AA = (int) (Math.random() * A);
        double BB = Math.random();
        int count = 0;

        if (BB <= 0.33) {
            System.out.println(BB);
            for (int i = 0; i < 2; i++) {
                AA = (int) (Math.random() * A);
                count++;
                if (matriz2[AA] == 0) {
                    matriz2[AA] = 1;
                    continue;
                } //if
                if (matriz2[AA] == 1) {
                    matriz2[AA] = 0;
                    continue;
                } //if
            } //for
        } //if
        if (BB > 0.33 && BB <= 0.66) {
            System.out.println(BB);
            count++;
            if (matriz2[AA] == 0) {
                matriz2[AA] = 1;
            } //if
            else if (matriz2[AA] == 1) {
                matriz2[AA] = 0;
            } //if
        } //if

        for (int i = 0; i < matriz2.length; i++) {
            System.out.print(matriz2[i]);
        } //for
        System.out.println("");
        System.err.println("Se han provocado " + count + " cambio(s)");

        System.out.println("");
        System.out.println("");
        System.out.println("MIRAR CUALES HAN SIDO LOS CAMBIOS");
        System.out.println("---------------");

        z = 0;
        posicion = 1;
        incremental = 1;
        int error_1 = 0;
        int err_cont = 0;

        for (int x = 0; x < bits_paridad; x++) {
            for (int i = 0; i < matriz2.length; i++) {
                String str = Long.toBinaryString(i); //Convertir la posición actual del bucle en string binario 
                long tmp = Long.parseLong(str); //Convertir el string binario en un int para trabajar con él
                if (tmp / incremental % 2 == 1) {
                    z = z + matriz2[i];
                } //if
            } //for

            if (z % 2 == 1) {
                error_1 = error_1 + posicion;
                err_cont++;
            }

            z = 0;
            posicion = posicion * 2;
            incremental = incremental * 10;
            sum = Arrays.stream(matriz2).sum();
        } //for

        for (int i = 0; i < 1; i++) {
            if (error_1 > 0 && sum % 2 == 0) {
                System.out.println("Hay dos errores");
                break;
            } //if
            if (error_1 > 0) {
                System.out.println("Hay un error en la posicion " + error_1);
                break;
            } //if
            if (sum % 2 != 0 && matriz2[0] == 0) {
                System.out.println("Hay un error en la posicion 0");
                break;
            } //if
            if (error_1 == 0) {
                System.out.println("No hay errores");
                break;
            } //if
        } //for

    } //main
} //all
