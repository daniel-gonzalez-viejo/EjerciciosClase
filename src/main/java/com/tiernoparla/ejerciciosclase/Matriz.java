package com.tiernoparla.ejerciciosclase;

public class Matriz {
    public static void main(String[] args) {
        
        int N = 5;
        int matriz [][] = new int [N][N];
        
        //METODO 1 PRINTEAR NUMEROS
        
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int)(Math.random()*2);
                System.out.print(matriz [x][y]);
            } //for
            System.out.println();
            
        //METODO 2 PRINTEAR NUMEROS
        
        for (int[] ara: matriz){
            System.out.println(Arrays.toString(ara));
        }//for
        }//for  
    } //main
} //all
