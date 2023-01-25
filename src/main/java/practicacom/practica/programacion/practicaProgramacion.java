package practicacom.practica.programacion;

import practicacom.practica.programacion.clasesMuseo.darDeAltaUnaObraDeArte;
import java.util.Scanner;

public class practicaProgramacion {
    public static void main(String[] args) {



        darDeAltaUnaObraDeArte art = new darDeAltaUnaObraDeArte(1, "Cuadro", "Cuadro de mariposas", "Van Gogh", 
        4, 5, 2, null, "oleo", 1, "Un cuadro mu feo");
        art.setAutor("Van gogh");

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué quieres hacer");
        System.out.println("1. Visualizar obras de arte");
        String n = sc.nextLine();

        switch (n){
            case "Ver cuadros": {
                System.out.println(art.getCabeceros());
                System.out.println(art.toString());
            }
        }
    }
}
