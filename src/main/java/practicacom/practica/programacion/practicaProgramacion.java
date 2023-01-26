package practicacom.practica.programacion;

import practicacom.practica.programacion.clasesMuseo.darDeAltaUnaObraDeArte;
import java.util.Scanner;

public class practicaProgramacion {
    public static void main(String[] args) {



        darDeAltaUnaObraDeArte art = new darDeAltaUnaObraDeArte(001, "Cuadro", "Guernica", "P.Picasso", 
        1000, 5, 2, null, "Óleo", 1, "Un cuadro mu feo");
        darDeAltaUnaObraDeArte arte = new darDeAltaUnaObraDeArte(001, "Cuadro", "Guernica", "P.Picasso", 
        1000, 5, 2, null, "Óleo", 1, "Un cuadro mu feo");
        darDeAltaUnaObraDeArte arto = new darDeAltaUnaObraDeArte(001, "Cuadro", "Guernica", "P.Picasso", 
        1000, 5, 2, null, "Óleo", 1, "Un cuadro mu feo");

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué quieres hacer");
        System.out.println("1. Ver cuadros");
        String n = sc.nextLine();

        switch (n){
            case "Ver cuadros": {
                System.out.println(art.getID());

            }
        }
    }
}
