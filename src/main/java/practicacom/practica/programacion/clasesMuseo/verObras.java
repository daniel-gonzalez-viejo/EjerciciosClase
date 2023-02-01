package practicacom.practica.programacion.clasesMuseo;
import java.util.Arrays;
import java.util.Scanner;

public class verObras {

    public Object[] objeto = new verObras[8];
    private String ID;
    private String Tipo;
    private String Nombre;
    private String Autor;
    private double Precio;
    private double Altura;
    private double Peso;
    private String Material;
    private String Técnica;
    private int Piezas;
    private String Descripción;
    
    public verObras(String iD, String tipo, String nombre, String autor, double precio,
            double altura, double peso, String material, String técnica, int piezas, String descripción) {
        ID = iD;
        Tipo = tipo;
        Nombre = nombre;
        Autor = autor;
        Precio = precio;
        Altura = altura;
        Peso = peso;
        Material = material;
        Técnica = técnica;
        Piezas = piezas;
        Descripción = descripción;
    }

    public verObras() {
    }

    public void verLasObras(){
        objeto[0] = new verObras(ID = "001", "Pintura", "  Guernica","       P.Picasso", 1000,5, 2,   null,  "Óleo", 5, "Cuadro de la guerra civil");        objeto[1] = new verObras("002", "Pintura", "  La Vie", "         P.Picasso", 200,  5, 1,   null,  "Óleo", 5, "Óleo");
        objeto[1] = new verObras(ID = "002", "Pintura", "  La Vie", "         P.Picasso", 200,  5, 1,   null,  "Óleo", 5, "Óleo");
        objeto[2] = new verObras(ID = "003", "Pintura", "  El Sueño", "       P.Picasso", 300,  5, 1.3, null,  "Óleo", 5, "Óleo");
        objeto[3] = new verObras(ID = "004", "Pintura", "  Retrato.D Maar", " P.Picasso", 400,  5, 1,   null,  "Óleo", 5, "Óleo");
        objeto[4] = new verObras(ID = "005", "Escultura", "El piel roja", "   U.Chueca",  350,  5, 1,  "acero", null,  5, "Escultura");
        
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(Cabeceras());

        for(int i = 0; i < objeto.length; i++) {
            if (objeto[i] == null) {
                break;
            }
            System.out.println(objeto[i].toString());
        }

    }

    public String Cabeceras() {
        return "ID" + "    " + "Tipo" + "        " + "Nombre" + "            " + "Autor" + "       " + "Precio" + "   "
         + "Alt." + "  " + "Peso"        + "  " + "Mat." + "  " + "Técnica" + "     " + "Piezas" + "       " + "Descripción";
    }

    @Override
    public String toString() {
        return ID + "   " + Tipo + "   " + Nombre + "   " + Autor + "   " + Precio + "   " + Altura + "   " + Peso
                + "   " + Material + "   " + Técnica + "   " + "     " + Piezas + "   " + "         " + Descripción;
    }
}
