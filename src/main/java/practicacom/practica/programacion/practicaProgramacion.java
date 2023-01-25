package practicacom.practica.programacion;

import practicacom.practica.programacion.clasesMuseo.darDeAltaUnaObraDeArte;
import java.util.Scanner;

public class practicaProgramacion {
    public static void main(String[] args) {



        darDeAltaUnaObraDeArte art = new darDeAltaUnaObraDeArte(1, "Cuadro", "Cuadro de mariposas", "Van Gogh", 
        4, 5, 2, null, "oleo", 1, "Un cuadro mu feo");

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué quieres hacer");
        System.out.println("1. Visualizar obras de arte");
        int n = sc.nextInt();

        switch (n){
            case 1: {
                System.out.println("soy tonot");
            }
            case 2: {
                System.out.println("no soy tonot");
            }
        }
    }
}
