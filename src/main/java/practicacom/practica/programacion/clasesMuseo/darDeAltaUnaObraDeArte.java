package practicacom.practica.programacion.clasesMuseo;

import java.util.Scanner;
import java.util.Vector;

public class darDeAltaUnaObraDeArte {
    private String ID = "6";
    private String Tipo;
    private String Nombre;
    private String Autor;
    private double Precio;
    private double Altura;
    private double Peso;
    private String Material;
    private String Tecnica;
    private int Piezas;
    private String Descripción;
    private Vector v = new Vector<>(10);

    Scanner sc = new Scanner(System.in);

    public darDeAltaUnaObraDeArte(String iD, String tipo, String nombre, String autor, double precio, double altura, double peso,
            String material, String tecnica, int piezas, String descripción) {
                ;
        ID = iD;
        Tipo = tipo;
        Nombre = nombre;
        Autor = autor;
        Precio = precio;
        Altura = altura;
        Peso = peso;
        Material = material;
        Tecnica = tecnica;
        Piezas = piezas;
        Descripción = descripción;
    }

    public darDeAltaUnaObraDeArte(){};

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public String getTecnica() {
        return Tecnica;
    }

    public void setTecnica(String tecnica) {
        Tecnica = tecnica;
    }

    public int getPiezas() {
        return Piezas;
    }

    public void setPiezas(int piezas) {
        Piezas = piezas;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String descripción) {
        Descripción = descripción;
    }

    public void darDeAlta() {
        System.out.println("ID: ");
        v.insertElementAt(sc.nextLine(), 1);
        System.out.println("Tipo: ");
        v.insertElementAt(sc.nextLine(), 2);
        System.out.println("Nombre: ");
        v.insertElementAt(sc.nextLine(), 3);
        System.out.println("Autor: ");
        v.insertElementAt(sc.nextLine(), 4);
        System.out.println("Precio: ");
        v.insertElementAt(sc.nextDouble(), 5);
        System.out.println("Altura: ");
        v.insertElementAt(sc.nextInt(), 6);
        System.out.println("Peso: ");
        v.insertElementAt(sc.nextInt(), 7);
        System.out.println("Material: ");
        v.insertElementAt(sc.nextLine(), 8);
        System.out.println("Técnica: ");
        v.insertElementAt(sc.nextLine(), 9);
        System.out.println("Piezas: ");
        v.insertElementAt(sc.nextLine(), 10);
        System.out.println("Descripción ");
        v.insertElementAt(sc.nextLine(), 11);
    }

    public String getCabeceros() {
        return "ID" + "    " + "Tipo" + "       " + "Nombre" + "      " + "Autor"
                    + "     " + "Precio" + "     " + "Altura" + "     " + "Peso" + "     " + "Material"
                    + "     " + "Tecnica" + "     " + "Piezas" + "     " + "Descripción" + "";
    }

    @Override
    public String toString() {
        return ID + "     " + Tipo + "     " + Nombre + "     " + Autor
                + "     " + Precio + "     " + Altura + "     " + Peso + "     " + Material
                + "     " + Tecnica + "     " + Piezas + "     " + Descripción + "";}
    
    

    

}
