package practicacom.practica.programacion;

import practicacom.practica.programacion.clasesMuseo.darDeAltaUnaObraDeArte;
import practicacom.practica.programacion.clasesMuseo.verObras;

import java.util.Scanner;
import java.util.*;

public class practicaProgramacion {
    public static void main(String[] args) {

        verObras objeto[]=new verObras[5];

        boolean interruptor = false;
        final int VEROBRAS = 1;


        objeto[0] = new verObras("001", "Pintura", "  Guernica","       P.Picasso", 1000,5, 2,   null,  "Óleo", 5, "Cuadro de la guerra civil");
        objeto[1] = new verObras("002", "Pintura", "  La Vie", "         P.Picasso", 200,  5, 1,   null,  "Óleo", 5, "Óleo");
        objeto[2] = new verObras("003", "Pintura", "  El Sueño", "       P.Picasso", 300,  5, 1.3, null,  "Óleo", 5, "Óleo");
        objeto[3] = new verObras("004", "Pintura", "  Retrato.D Maar", " P.Picasso", 400,  5, 1,   null,  "Óleo", 5, "Óleo");
        objeto[4] = new verObras("005", "Escultura", "El piel roja", "   U.Chueca",  350,  5, 1,  "acero", null,  5, "Escultura");
       // objeto[5] = new verObras(006, "Pintura", "Guernica", "P.Picasso", 1000, 5, 2, null, "Óleo", 5, "Cuadro de la guerra civil");

        Scanner sc = new Scanner(System.in);

        while (!interruptor) {

            
            System.out.println("¿Qué quieres hacer");
            System.out.println("1. Ver cuadros");
            System.out.println("2. Dar de alta");
            System.out.println("3. Modificar los datos de una de las obras");
            System.out.println("4. Visualizar los datos de una de las obras de arte expuestas");
            System.out.println("5. Obtener el precio de venta de una de las obras de arte expuestas");
            System.out.println("6. Imprimir una etiqueta para clasificar una de las obras expuestas y dar información adicional");
            System.out.println("7. Salir");
            int n = sc.nextInt();


        switch (n){
            case VEROBRAS: {
                for(int i = 0; i < objeto.length; i++) {
                    if (objeto[i]==null) {
                        break;
                    }
                    System.out.println(objeto[i]);
                }
                break;
            }
            case 2: {
                darDeAltaUnaObraDeArte dar = new darDeAltaUnaObraDeArte();
                darDeAltaUnaObraDeArte objeto2[]=new darDeAltaUnaObraDeArte[6];
                for(int i = 0; i <= objeto.length; i++) {
                    objeto2[i] = objeto[i];
                }
            }
            case 3: {
                System.out.println("bbb");
            }
            case 4: {

            }
            case 5: {

            }
            case 6: {

            }
            case 7: {
                System.out.println("Adios");
                interruptor = true;
            }

        }
        
    }
    sc.close();


        }
    }

