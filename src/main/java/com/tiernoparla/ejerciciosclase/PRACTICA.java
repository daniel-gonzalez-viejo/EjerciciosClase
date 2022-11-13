package com.tiernoparla.ejerciciosclase;

public class PRACTICA {
        int matriz [][] = new int [3][3];
        int matriz_c = 0;
        int contador = 0;
        int nueva_matriz_1 [] = new int [4];
        int nueva_matriz_2 [] = new int [4];
        int nueva_matriz_3 [] = new int [4];
        int nueva_matriz_4 [] = new int [2];
    public void matriz (){
    for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                matriz[x][y] = (int)(Math.random()*2); //Se sustituyen las variables "x" e "y" por aleatorios entre "0" y "1"
                System.out.print(matriz [x][y]); 
                matriz_c = matriz [x][y];
                contador++;
            } //for
             System.out.println();
        } //for
    } //matriz
    
    public void Sender (){
            nueva_matriz_1[0] = 0;
            //// AQUI ES PARA PONER LOS BIT NORMALES
            if (contador == 0) {
                nueva_matriz_1[3] = matriz_c;
            } //if
            if (contador == 1) { 
                nueva_matriz_2[1] = matriz_c;
            } //if
            if (contador == 2) {
                nueva_matriz_2[2] = matriz_c;
            } //if
            if (contador == 3) {
                nueva_matriz_2[3] = matriz_c;
            } //if
            if (contador == 4) {
                nueva_matriz_3[1] = matriz_c;
            } //if
            if (contador == 5) {
                nueva_matriz_3[2] = matriz_c;
            } //if
            if (contador == 6) {
                nueva_matriz_3[3] = matriz_c;
            } //if
            if (contador == 7) {
                nueva_matriz_4[0] = matriz_c;
            } //if
            if (contador == 8) {
                nueva_matriz_4[1] = matriz_c;
            } //if
            ////// AQUI ES PARA POSICIONAR LOS BITS DE PARIDAD
            if ((nueva_matriz_2[1] + nueva_matriz_3[1] + nueva_matriz_4[1] +
            nueva_matriz_1[3] + nueva_matriz_2[3] + nueva_matriz_3[3])%2 == 0) {
                nueva_matriz_1[1] = 0;
            } //if
            else if ((nueva_matriz_2[1] + nueva_matriz_3[1] + nueva_matriz_4[1] +
            nueva_matriz_1[3] + nueva_matriz_2[3] + nueva_matriz_3[3])%2 != 0) {
               nueva_matriz_1[1] = 1; 
            } //else if
            if ((nueva_matriz_1[3] + nueva_matriz_2[2] + nueva_matriz_2[3] + 
            nueva_matriz_3[2] + nueva_matriz_3[3]) %2 == 0 ){
                nueva_matriz_1[2] = 0;
            } //if
            else if ((nueva_matriz_1[3] + nueva_matriz_2[2] + nueva_matriz_2[3] + 
            nueva_matriz_3[2] + nueva_matriz_3[3]) %2 != 0 ){
                nueva_matriz_1[2] = 1;
            } //else if
            if ((nueva_matriz_2[1] + nueva_matriz_2[2] + nueva_matriz_2[3] + 
            nueva_matriz_4[0] + nueva_matriz_4[1]) %2 == 0 ){
                nueva_matriz_2[0] = 0;
            } //if
            else if ((nueva_matriz_2[1] + nueva_matriz_2[2] + nueva_matriz_2[3] + 
            nueva_matriz_4[0] + nueva_matriz_4[1]) %2 != 0 ){
                nueva_matriz_2[0] = 1;
            } //else if
            if ((nueva_matriz_3[1] + nueva_matriz_3[2] + nueva_matriz_3[3] + 
            nueva_matriz_4[0] + nueva_matriz_4[1]) %2 == 0 ){
                nueva_matriz_3[0] = 0;
            } //if
            else if ((nueva_matriz_3[1] + nueva_matriz_3[2] + nueva_matriz_3[3] + 
            nueva_matriz_4[0] + nueva_matriz_4[1]) %2 != 0 ){
                nueva_matriz_3[0] = 1;
            } //else if
            System.out.println(nueva_matriz_1);
            System.out.println(nueva_matriz_2);
            System.out.println(nueva_matriz_3);
            System.out.println(nueva_matriz_4);
    } //SenderZAAs
    
    
 class SENDER {
    public void Sender (){
            nueva_matriz_1[0] = 0;
            //// AQUI ES PARA PONER LOS BIT NORMALES
            if (contador == 0) {
                nueva_matriz_1[3] = matriz_c;
            } //if
            if (contador == 1) { 
                nueva_matriz_2[1] = matriz_c;
            } //if
            if (contador == 2) {
                nueva_matriz_2[2] = matriz_c;
            } //if
            if (contador == 3) {
                nueva_matriz_2[3] = matriz_c;
            } //if
            if (contador == 4) {
                nueva_matriz_3[1] = matriz_c;
            } //if
            if (contador == 5) {
                nueva_matriz_3[2] = matriz_c;
            } //if
            if (contador == 6) {
                nueva_matriz_3[3] = matriz_c;
            } //if
            if (contador == 7) {
                nueva_matriz_4[0] = matriz_c;
            } //if
            if (contador == 8) {
                nueva_matriz_4[1] = matriz_c;
            } //if
            ////// AQUI ES PARA POSICIONAR LOS BITS DE PARIDAD
            if ((nueva_matriz_2[1] + nueva_matriz_3[1] + nueva_matriz_4[1] +
            nueva_matriz_1[3] + nueva_matriz_2[3] + nueva_matriz_3[3])%2 == 0) {
                nueva_matriz_1[1] = 0;
            } //if
            else if ((nueva_matriz_2[1] + nueva_matriz_3[1] + nueva_matriz_4[1] +
            nueva_matriz_1[3] + nueva_matriz_2[3] + nueva_matriz_3[3])%2 != 0) {
               nueva_matriz_1[1] = 1; 
            } //else if
            if ((nueva_matriz_1[3] + nueva_matriz_2[2] + nueva_matriz_2[3] + 
            nueva_matriz_3[2] + nueva_matriz_3[3]) %2 == 0 ){
                nueva_matriz_1[2] = 0;
            } //if
            else if ((nueva_matriz_1[3] + nueva_matriz_2[2] + nueva_matriz_2[3] + 
            nueva_matriz_3[2] + nueva_matriz_3[3]) %2 != 0 ){
                nueva_matriz_1[2] = 1;
            } //else if
            if ((nueva_matriz_2[1] + nueva_matriz_2[2] + nueva_matriz_2[3] + 
            nueva_matriz_4[0] + nueva_matriz_4[1]) %2 == 0 ){
                nueva_matriz_2[0] = 0;
            } //if
            else if ((nueva_matriz_2[1] + nueva_matriz_2[2] + nueva_matriz_2[3] + 
            nueva_matriz_4[0] + nueva_matriz_4[1]) %2 != 0 ){
                nueva_matriz_2[0] = 1;
            } //else if
            if ((nueva_matriz_3[1] + nueva_matriz_3[2] + nueva_matriz_3[3] + 
            nueva_matriz_4[0] + nueva_matriz_4[1]) %2 == 0 ){
                nueva_matriz_3[0] = 0;
            } //if
            else if ((nueva_matriz_3[1] + nueva_matriz_3[2] + nueva_matriz_3[3] + 
            nueva_matriz_4[0] + nueva_matriz_4[1]) %2 != 0 ){
                nueva_matriz_3[0] = 1;
            } //else if
            System.out.println(nueva_matriz_1);
            System.out.println(nueva_matriz_2);
            System.out.println(nueva_matriz_3);
            System.out.println(nueva_matriz_4);
    } //SenderZAAs
} //SENDER
    
    public static void main(String[] args) {
        PRACTICA e = new PRACTICA();

        
        e.matriz();
        e.Sender();
    } //main
} //PRACTICA 1ª EVALUACION    
