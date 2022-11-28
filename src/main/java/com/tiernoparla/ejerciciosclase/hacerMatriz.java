package com.tiernoparla.ejerciciosclase;

public class hacerMatriz {
    static int[] Matriz(int Bits[]) {
        
        int matriz[];  
        int tamaño;
        
        int i = 0;
        int Bits_paridad = 0; 
        int j = 0;
        int k = 0;  
        
        tamaño = Bits.length;
        
        //Para sacar el numero necesario de bits de paridad + el global
        while(i < tamaño) {  
            // 2 power of parity bits must equal to the current position(number of bits traversed + number of parity bits + 1).  
            if(Math.pow(2, Bits_paridad) == (i + Bits_paridad + 1)) {  
                Bits_paridad++;  
            }// if  
            else {  
                i++;  
            } //else  
        } //while
        
        // Para saber el tamaño total de la matriz
        matriz = new int[tamaño + Bits_paridad];
        
        for(i = 1; i <= matriz.length; i++) {  
            // condition to find parity bit location  
            if(Math.pow(2, j) == i) {  
              
                matriz[(i - 1)] = 2;  
                j++;  
            }// if  
            else {  
                matriz[(k + j)] = Bits[k++];  
            }// else  
        }// for
        
        // use for loop to set even parity bits at parity bit locations
        for(i = 0; i < Bits_paridad; i++) {  
          
            matriz[((int) Math.pow(2, i)) 
                    - 1] = getBits_paridad(matriz, i);  
        }// for  
          
        return matriz;  
    }
    
    static int getBits_paridad(int returnBits[], int pow) {
        
        int Bits_paridad = 0;  
        int tamaño = returnBits.length;
        
        for(int i = 0; i < tamaño; i++) {  
            // Para saber si el bit es 0 o 1
            if(returnBits[i] != 2) {
                // if not, we save the index in k by increasing 1 in its value
                int k = (i + 1); 
                
                // convert the value of k into binary  
                String str = Integer.toBinaryString(k);
                
                //Now, if the bit at the 2^(power) location of the binary value 
                //of index is 1,
                // we check the value stored at that location. 
                //If the value is 1 or 0,   
                // we will calculate the parity value.
                
                int temp = ((Integer.parseInt(str)) / 
                        ((int) Math.pow(10, pow))) % 10;  
                if(temp == 1) {  
                    if(returnBits[i] == 1) {  
                        Bits_paridad = (Bits_paridad + 1) % 2;  
                    }  
                }  
            }  
        }  
        return Bits_paridad;               
    }// getParityBit
    
}
