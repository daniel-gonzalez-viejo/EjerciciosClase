package practicacom.practica.programacion;

import practicacom.practica.programacion.clasesMuseo.darDeAltaUnaObraDeArte;
import java.util.Scanner;

public class practicaProgramacion {
    public static void main(String[] args) {



        darDeAltaUnaObraDeArte art = new darDeAltaUnaObraDeArte(1, "Cuadro", "Cuadro de mariposas", "Van Gogh", 
        4, 5, 2, null, "oleo", 1, "Un cuadro mu feo");

        int n = 2;

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
