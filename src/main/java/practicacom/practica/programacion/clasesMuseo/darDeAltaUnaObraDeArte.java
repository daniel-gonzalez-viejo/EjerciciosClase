package practicacom.practica.programacion.clasesMuseo;

import java.util.*;
import java.util.Scanner;

public class darDeAltaUnaObraDeArte {
    private int ID = 6;
    private String Tipo;
    private String Nombre;
    private String Autor;
    private double Precio;
    private int Altura;
    private int Peso;
    private String Material;
    private String Tecnica;
    private int Piezas;
    private String Descripción;

    Vector v = new Vector<>(10);
    Scanner sc = new Scanner(System.in);

    public darDeAltaUnaObraDeArte(int iD, String tipo, String nombre, String autor, double precio, int altura, int peso,
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

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
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

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int altura) {
        Altura = altura;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
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

    public void darDeAlta(int iD, String tipo, String nombre, String autor, double precio, int altura, int peso,
    String material, String tecnica, int piezas, String descripción) {
        System.out.println("ID: ");
        v.addElement(sc.nextLine());
        System.out.println("Tipo: ");
        v.addElement(sc.nextLine());
        System.out.println("Nombre: ");
        v.addElement(sc.nextLine());
        System.out.println("Autor: ");
        v.addElement(sc.nextLine());
        System.out.println("Precio: ");
        v.addElement(sc.nextLine());
        System.out.println("Altura: ");
        v.addElement(sc.nextLine());
        System.out.println("Peso: ");
        v.addElement(sc.nextLine());
        System.out.println("Material: ");
        v.addElement(sc.nextLine());
        System.out.println("Técnica: ");
        v.addElement(sc.nextLine());
        System.out.println("Piezas: ");
        v.addElement(sc.nextLine());
        System.out.println("Descripción ");
        v.addElement(sc.nextLine());
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
