package com.tiernoparla.ejerciciosclase;

public class Matriz {
    public static void main(String[] args) {
        
        int N = 3;
        int matriz [][] = new int [N][N];
        int a = 0;
        
        //METODO 1 PRINTEAR NUMEROS
        
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int)(Math.random()*2); //Se sustituyen las variables "x" e "y" por aleatorios entre "0" y "1"
               // System.out.print(matriz [x][y]); 
                a = matriz [x][y];
                System.out.print(a);
        } //for
            
        //METODO 2 PRINTEAR NUMEROS (AUNQUE ME ESTÁ FALLANDO)
        
        //for (int[] ara: matriz){
        //    System.out.println(Arrays.toString(ara));
        // }//for
        }//for  
        
    } //main
} //all
