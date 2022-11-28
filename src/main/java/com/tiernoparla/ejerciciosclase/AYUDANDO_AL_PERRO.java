package com.tiernoparla.ejerciciosclase;

import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;
 
public class AYUDANDO_AL_PERRO{ 
    
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
        int A = 0;

        System.out.println("¿Como de grande quieres que sea la matriz?");
        A = sc.nextInt();

       
        int N = (int) (Math.sqrt(A));
        int bits_paridad = 4;
        int pot = 1;
        int M = 0;
              
        int tama = A + bits_paridad + 1;
        int n = 10;

        int matriz[][] = new int[N][N];
        int matriz2[] = new int[A];
        int matriz3[] = new int[tama];

        
        
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random() * 2); //Se sustituyen las variables "x" e "y" por aleatorios entre "0" y "1"
                System.out.print(matriz[x][y]);
                matriz2[M] = matriz[x][y];
                M++;
            } //for
            System.out.println();
        } //for
 
        
        //////////////////////////////////////////////////////////
        
        ArrayList<Long> arrlist = new ArrayList<Long>(tama);
        
        for (int i = 0; i < matriz2.length; i++) {
            arrlist.add((long)matriz2[i]);
        } //for
        
        int pow = 0;
        
        for (int i = 0; i < arrlist.size(); i++) {
            if (pow == i) {
                arrlist.add(pow,(long)0);
                pow *= 2;
            }
            if (pow == 0) {
                pow = 1;
            }
        }
        
        System.out.println(arrlist);
        
        /////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////
        
        /////CALCULAR LOS BITS DE PARIDAD
        
        long suma = 0;
        int entrada = 1;
        int cambiar_cifras = 1;

        
        for (int z = 0; z < bits_paridad; z++) {
            for (int i = 1; i < arrlist.size(); i++) {
                String binario = Long.toBinaryString(i);
                long valor = Long.parseLong(binario);
                if ((valor / cambiar_cifras) % 2 == 1) {
                    suma = suma + arrlist.get(i);
                } //if
            } //for
            
            cambiar_cifras = cambiar_cifras * 10;
            
            if (suma % 2 == 0) {
               arrlist.set(entrada,(long)0);
            }
            if (suma % 2 == 1) {
               arrlist.set(entrada,(long)1);
            }
            suma = 0;
            entrada = entrada * 2;
        } //for  
        
        //////CALCULAR EL BIT GLOBAL
        
        long y = 0;
        
        for (int i = 1; i < arrlist.size(); i++) {
            y = y + arrlist.get(i);
        } //for
        
        if (y % 2 == 0) {
            arrlist.set(0,(long)0);
        }
        
        if (y % 2 != 0) {
            arrlist.set(0,(long)1);
        }
        
        
        /////PRINTEAR POR PANTALLA LA NUEVA MATRIZ CON BITS DE PARIDAD LLENOS
        
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println("");
        System.out.println(arrlist);
        
        
        
    }
}
