package com.tiernoparla.ejerciciosclase;

import java.util.Scanner;

public class Facturas {
    Scanner sc = new Scanner(System.in);
    static int Código;
    static int Litros;
    static int Precio_l;
    ////////////////////
    static int Facturas_positivas; //Para contar las facturas de +600€
    static int Facturacion;
    static int Litros_Código1;
    
    public void pedirFactura() {
        System.out.println("Introduce el código del producto: ");
        Código = sc.nextInt();
        System.out.println("Introduce cuantos litros quieres: ");
        Litros = sc.nextInt();
        if (Código == 1) {
            Precio_l = 5;
        }
        } //pedirFactura
    public void imprimirFactura(){
        System.out.println("TICKET DE PRUEBA");
        System.out.println("");
        System.out.println("----------------------");
        System.out.println("Código: " + Código);
        System.out.println("Litros: " + Litros);
        System.out.println("Precio por litro: " + Precio_l);
        System.out.println("Total: " + Litros*Precio_l + " euros");
    } //imprimirFactura
    public void Resultado(){
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println("En total ha habido " + Facturas_positivas + " ventas de más de 600 euros");
        System.out.println("En total se han vendido " + Litros_Código1 + " litros");
        System.out.println("En total se han ganado " + Facturacion + " euros");
        System.out.println("-----------------------");
    } //Resultado
    
    
    
    public static void main(String[] args) {
        Facturas e = new Facturas (); //Para invocar a Facturas como clase
        
        
        for (int i = 0; i < 5 ; i++) {
            e.pedirFactura(); //Para llamar a imprimirFactura
                if (Código == 1) {
                    Litros_Código1 = Litros_Código1 + Litros;
                    Facturacion = Facturacion + (Litros*Precio_l);
                        if (Litros*Precio_l >= 600) {
                            Facturas_positivas++;
                        } //if
                        e.imprimirFactura();
                } //if
                else {
                    System.out.println("El codigo no es correcto");
                    continue;
                     } //else
                
        }//for
        e.Resultado();
        
    } //main
    } //Facturas 
  
    ///////////////////////////////////////////////////////////////////////////



        
        
        
        
    