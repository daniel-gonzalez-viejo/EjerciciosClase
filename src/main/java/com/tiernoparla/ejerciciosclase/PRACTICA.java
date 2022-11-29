package com.tiernoparla.ejerciciosclase;

import java.util.Arrays;
import java.util.*;

public class PRACTICA {
    
    public static int[] crearMatriz(int A, int[][] matriz, int M) {
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
        return matriz2;
    } //crearMatriz

    public static int contarBits(int A, int pot) {
        ///////////////////////////////////////////////////////////////////////
        System.out.println("");
        System.out.println("CUANTOS BITS SE NECESITAN");
        System.out.println("---------------");
        int bits_paridad = 0;
        for (int i = 1; i <= A; i++) {
            pot = pot * 2;
            bits_paridad = i;
            if (pot > A) {
                System.out.println("Se necesitan " + bits_paridad + " bits de paridad");
                break;
            } //if
        } //for
        return bits_paridad;
    } //contarBits
    
    public static void printearMatriz(int[] matriz2, int N) {
        for (int i = 0; i < matriz2.length; i++) {
            System.out.print(matriz2[i]);
            if ((i+1) % N == 0) {
                System.out.println("");
            } //if
        } //for
    } //printearMatriz
    
    public static int[] insertarBitsParidad(int[] matriz2, int index, int value) {
        int[] result = new int[matriz2.length + 1];
        System.arraycopy(matriz2, 0, result, 0, index);
        result[index] = value;
        System.arraycopy(matriz2, index, result, index + 1, matriz2.length - index);
        return result;
    } //insertarBitsParidad
    
    public static int[] printearMatrizConBitsDeParidadVacios(int[] matriz2, int index, int value) {
        ///////////////////////////////////////////////////////////////////////
        System.out.println("");
        System.out.println("NUEVA MATRIZ CON LOS BITS DE PARIDAD VACÍOS");
        System.out.println("---------------");
        if (matriz2[0] == matriz2[0]) {
            matriz2 = insertarBitsParidad(matriz2, index, value);
            index = 1;
        } //if
        for (int i = 1; i < matriz2.length + 1; i++) {
          //  System.out.print(matriz2[i - 1]);
            if (1 == index) {
                matriz2 = insertarBitsParidad(matriz2, index, value);
                index = 2;
            } //if
            if (i == index) {
                matriz2 = insertarBitsParidad(matriz2, index, value);
                index = index * 2;
            } //if
        } //for     
        return matriz2;
    } //printearMatrizConBitsDeParidadVacios
    
    public static int[] printearMatrizConBitsDeParidadSeteados(int bits_paridad, int[] matriz2, int incremental, int z, int posicion) throws NumberFormatException {
        System.out.println("");
        System.out.println("");
        System.out.println("NUEVA MATRIZ CON LOS BITS DE PARIDAD LLENOS");
        System.out.println("---------------");
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
        
        return matriz2;
        
    } //printearMatrizConBitsDeParidadSeteados
    
    public static void provocarCambiosAleatorios(int A, int[] matriz2) {
        System.out.println("");
        System.out.println("");
        System.out.println("PROVOCAR LOS CAMBIOS ALEATORIOS");
        System.out.println("---------------");
        
        int AA = (int) (Math.random() * A);
        double BB = Math.random();
        int count = 0;
        
        if (BB <= 0.33) {
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
            count++;
            if (matriz2[AA] == 0) {
                matriz2[AA] = 1;
            } //if
            if (matriz2[AA] == 1) {
                matriz2[AA] = 0;
            } //if
        } //if
        System.out.println("La cifra es " + BB);
    } //provocarCambiosAleatorios
    
    public static void comprobarCuantosErroresExisten(int z, int posicion, int incremental, int bits_paridad, int[] matriz2, int sum) throws NumberFormatException {
        System.out.println("");
        System.out.println("");
        System.out.println("MIRAR CUALES HAN SIDO LOS CAMBIOS");
        System.out.println("---------------");

        int error_1 = 0;

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
    } //comprobarCuantosErroresExisten
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;
        System.out.println("¿Como de grande quieres que sea la matriz?");
        A = sc.nextInt();

        int value = 0;
        int index = 0;

        int sum = 0;
        final int N = (int) (Math.sqrt(A));
        int pot = 1;
        int M = 0;
        int z = 0;
        int incremental = 1;
        int posicion = 1;
        int matriz[][] = new int[N][N];
        
        
        int matriz2[] = crearMatriz(A, matriz, M);
        printearMatriz(matriz2, N);
        int bits_paridad = contarBits(A, pot);
        matriz2 = printearMatrizConBitsDeParidadVacios(matriz2, index, value);
        printearMatriz(matriz2, N);
        matriz2 = printearMatrizConBitsDeParidadSeteados(bits_paridad, matriz2, incremental, z, posicion);
        printearMatriz(matriz2, N);
        provocarCambiosAleatorios(A, matriz2);
        printearMatriz(matriz2, N);
        comprobarCuantosErroresExisten(z, posicion, incremental, bits_paridad, matriz2, sum);
    } // main
}
