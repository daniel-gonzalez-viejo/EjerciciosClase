package com.tiernoparla.ejerciciosclase;

import java.util.Arrays;
import java.util.*;

public class DanielGonzalezViejo_practica_1 {

    // (GENERADOR DE MATRIZ)
    // MÉTODO QUE GENERA UNA MATRIZ CON NÚMEROS ALEATORIOS, Y LUEGO LA INTRODUCE EN
    // UNA MATRIZ UNIDIMENSIONAL
    public static int[] crearMatriz(int longitud, int[][] matriz, int posicion_nueva_matriz, int TAMAÑO_AL_CUADRADO) {
        int nueva_matriz[] = new int[longitud];
        System.out.println("MATRIZ GENERADA");
        System.out.println("---------------");
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random() * 2); // Se sustituyen las variables "x" e "y" por aleatorios entre
                                                          // "0" y "1"
                nueva_matriz[posicion_nueva_matriz] = matriz[x][y];
                posicion_nueva_matriz++;
            } // for
        } // for
        printearMatriz(nueva_matriz, TAMAÑO_AL_CUADRADO); // MÉTODO PARA PRINTEAR LA NUEVA MATRIZ CON SOLO EL MENSAJE
        return nueva_matriz;
    } // crearMatriz

    // (SENDER)
    // MÉTODO QUE CALCULA CUANTOS BITS DE PARIDAD SON NECESARIOS
    public static int contarBits(int longitud, int potencia_bits_paridad) {
        System.out.println("");
        System.out.println("CUANTOS BITS SE NECESITAN");
        System.out.println("---------------");
        int bits_paridad = 0;
        for (int i = 1; i <= longitud; i++) {
            potencia_bits_paridad = potencia_bits_paridad * 2;
            bits_paridad = i;
            if (potencia_bits_paridad > longitud) {
                System.out.println("Se necesitan " + bits_paridad + " bits de paridad");
                break;
            } // if
        } // for
        return bits_paridad;
    } // contarBits

    // MÉTODO PARA PRINTEAR POR PANTALLA LA NUEVA MATRIZ
    public static void printearMatriz(int[] nueva_matriz, int TAMAÑO_AL_CUADRADO) {
        for (int i = 0; i < nueva_matriz.length; i++) {
            System.out.print(nueva_matriz[i]);
            if ((i + 1) % TAMAÑO_AL_CUADRADO == 0) { // Para ordenar la nueva matriz, al ser unidimensional no se
                System.out.println(""); // ordena por su propia cuenta
            } // if
        } // for
    } // printearMatriz

    // MÉTODO PARA PODER INSERTAR BITS EN UN ARRAY DE TAMAÑO FIJO
    public static int[] insertarBitsParidad(int[] nueva_matriz, int indice, int valor) {
        int[] resultado = new int[nueva_matriz.length + 1];
        System.arraycopy(nueva_matriz, 0, resultado, 0, indice);
        resultado[indice] = valor;
        System.arraycopy(nueva_matriz, indice, resultado, indice + 1, nueva_matriz.length - indice);
        return resultado;
    } // insertarBitsParidad

    // MÉTODO PARA INSERTAR LOS BITS DE PARIDAD EN LAS POSICIONES ADECUADAS. EL
    // NÚMERO INSERTADO ES 0 PARA NO DAÑAR EL CONTEO
    public static int[] matrizConBitsDeParidadVacios(int[] nueva_matriz, int indice, int valor) {
        if (nueva_matriz[0] == nueva_matriz[0]) {
            nueva_matriz = insertarBitsParidad(nueva_matriz, indice, valor);
            indice = 1;
        } // if
        for (int i = 1; i < nueva_matriz.length + 1; i++) {

            if (1 == indice) {
                nueva_matriz = insertarBitsParidad(nueva_matriz, indice, valor);
                indice = 2;
            } // if
            if (i == indice) {
                nueva_matriz = insertarBitsParidad(nueva_matriz, indice, valor);
                indice = indice * 2;
            } // if
        } // for
        return nueva_matriz;
    } // printearMatrizConBitsDeParidadVacios

    // MÉTODO PARA CAMBIAR LOS BITS DE PARIDAD POR LOS QUE LE CORRESPONDEN Y LUEGO
    // PRINTEE POR PANTALLA
    public static int[] printearMatrizConBitsDeParidadSeteados(int bits_paridad, int[] nueva_matriz, int incremental,
            int acumulador, int posicion, int TAMAÑO_AL_CUADRADO, int suma_total_tabla) throws NumberFormatException {
        System.out.println("");
        System.out.println("NUEVA MATRIZ CON LOS BITS DE PARIDAD LLENOS");
        System.out.println("---------------");
        for (int x = 0; x < bits_paridad; x++) {
            for (int i = 0; i < nueva_matriz.length; i++) {
                String NUMERO_A_STRING_BINARIO = Long.toBinaryString(i); // Convertir la posición actual del bucle en
                                                                         // string binario
                long STRING_BINARIO_A_LONG = Long.parseLong(NUMERO_A_STRING_BINARIO); // Convertir el string binario en
                                                                                      // un int
                if (STRING_BINARIO_A_LONG / incremental % 2 == 1) {
                    acumulador = acumulador + nueva_matriz[i];
                } // if
            } // for

            if (acumulador % 2 == 0) {
                nueva_matriz[posicion] = 0;
            } // if

            if (acumulador % 2 == 1) {
                nueva_matriz[posicion] = 1;
            } // if
            acumulador = 0;
            posicion = posicion * 2;
            incremental = incremental * 10;
        } // for

        // CONTAR LOS BITS DE PARIDAD PARA CREAR EL BIT GLOBAL

        suma_total_tabla = Arrays.stream(nueva_matriz).sum();
        if (suma_total_tabla % 2 == 0) {
            nueva_matriz[0] = 0;
        } // if
        else if (suma_total_tabla % 2 == 1) {
            nueva_matriz[0] = 1;
        } // else if

        printearMatriz(nueva_matriz, TAMAÑO_AL_CUADRADO);

        return nueva_matriz;
    } // printearMatrizConBitsDeParidadSeteados

    // (NOISE)
    // MÉTODO PARA PROVOCAR 1, 2 o NINGÚN CAMBIO EN UNA POSICIÓN ALEATORIA
    public static void provocarCambiosAleatorios(int longitud, int[] nueva_matriz, int TAMAÑO_AL_CUADRADO,
            int posicion_que_va_a_cambiar, double probabilidad_de_error) {
        System.out.println("");
        System.out.println("");
        System.out.println("PROVOCAR LOS CAMBIOS ALEATORIOS");
        System.out.println("---------------");

        // PARA PROVOCAR SOLO UN CAMBIO
        if (probabilidad_de_error <= 0.33) {
            for (int i = 0; i < 2; i++) {
                posicion_que_va_a_cambiar = probabilidadDeError(longitud, nueva_matriz, posicion_que_va_a_cambiar);
            } // for
        } // if

        // PARA PROVOCAR DOS CAMBIOS
        if (probabilidad_de_error > 0.33 && probabilidad_de_error <= 0.66) {
            posicion_que_va_a_cambiar = probabilidadDeError(longitud, nueva_matriz, posicion_que_va_a_cambiar);
        } // if
        printearMatriz(nueva_matriz, TAMAÑO_AL_CUADRADO);
    } // provocarCambiosAleatorios

    // MÉTODO PARA PROVOCAR LOS ERRORES
    private static int probabilidadDeError(int longitud, int[] nueva_matriz, int posicion_que_va_a_cambiar) {
        posicion_que_va_a_cambiar = (int) (Math.random() * longitud);
        if (nueva_matriz[posicion_que_va_a_cambiar] == 0) {
            nueva_matriz[posicion_que_va_a_cambiar] = 1;
            return posicion_que_va_a_cambiar;
        } // if
        if (nueva_matriz[posicion_que_va_a_cambiar] == 1) {
            nueva_matriz[posicion_que_va_a_cambiar] = 0;
            return posicion_que_va_a_cambiar;
        } // if
        return posicion_que_va_a_cambiar;
    }

    // (RECIEVER)
    // MÉTODO PARA COMPROBAR CUANTOS ERRORES SE HAN DADO
    public static void comprobarCuantosErroresExisten(int errores, int acumulador, int posicion, int incremental,
            int bits_paridad, int[] nueva_matriz, int suma_total_tabla, boolean comprobar_fallos)
            throws NumberFormatException {
        System.out.println("");
        System.out.println("");
        System.out.println("MIRAR CUALES HAN SIDO LOS CAMBIOS");
        System.out.println("---------------");

        for (int x = 0; x < bits_paridad; x++) {
            for (int i = 0; i < nueva_matriz.length; i++) {
                String NUMERO_A_STRING_BINARIO = Long.toBinaryString(i); // Convertir la posición actual del bucle en
                                                                         // string binario
                long STRING_BINARIO_A_LONG = Long.parseLong(NUMERO_A_STRING_BINARIO); // Convertir el string binario en
                                                                                      // un int
                if (STRING_BINARIO_A_LONG / incremental % 2 == 1) {
                    acumulador = acumulador + nueva_matriz[i];
                } // if
            } // for

            if (acumulador % 2 == 1) {
                errores = errores + posicion;
            }

            acumulador = 0;
            posicion = posicion * 2;
            incremental = incremental * 10;
            suma_total_tabla = Arrays.stream(nueva_matriz).sum();
        } // for

        while (comprobar_fallos = true) {
            if (errores > 0 && suma_total_tabla % 2 == 0) {
                System.out.println("Hay dos errores");
                break;
            } // if
            if (errores > 0) {
                System.out.println("Hay un error en la posicion " + errores);
                break;
            } // if
            if (suma_total_tabla % 2 != 0 && nueva_matriz[0] == 0) {
                System.out.println("Hay un error en la posicion 0");
                break;
            } // if
            if (errores == 0) {
                System.out.println("No hay errores");
                break;
            } // if
            comprobar_fallos = false;
        } // while
    } // comprobarCuantosErroresExisten

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud = 0;
        System.out.println("¿Como de grande quieres que sea la matriz?");
        longitud = sc.nextInt();
        int valor = 0;
        int indice = 0;
        int posicion_que_va_a_cambiar = (int) (Math.random() * longitud);
        double probabilidad_de_error = Math.random();
        int errores = 0;
        boolean comprobar_fallos = true;

        int suma_total_tabla = 0;
        final int TAMAÑO_AL_CUADRADO = (int) (Math.sqrt(longitud));
        int potencia_bits_paridad = 1;
        int posicion_nueva_matriz = 0;
        int acumulador = 0;
        int incremental = 1;
        int posicion = 1;

        int matriz[][] = new int[TAMAÑO_AL_CUADRADO][TAMAÑO_AL_CUADRADO];
        int nueva_matriz[] = crearMatriz(longitud, matriz, posicion_nueva_matriz, TAMAÑO_AL_CUADRADO);
        int bits_paridad = contarBits(longitud, potencia_bits_paridad);
        nueva_matriz = matrizConBitsDeParidadVacios(nueva_matriz, indice, valor);
        nueva_matriz = printearMatrizConBitsDeParidadSeteados(bits_paridad, nueva_matriz, incremental, acumulador,
                posicion,
                TAMAÑO_AL_CUADRADO, suma_total_tabla);
        provocarCambiosAleatorios(longitud, nueva_matriz, TAMAÑO_AL_CUADRADO, posicion_que_va_a_cambiar,
                probabilidad_de_error);
        comprobarCuantosErroresExisten(errores, acumulador, posicion, incremental, bits_paridad, nueva_matriz,
                suma_total_tabla,
                comprobar_fallos);
    } // main
}