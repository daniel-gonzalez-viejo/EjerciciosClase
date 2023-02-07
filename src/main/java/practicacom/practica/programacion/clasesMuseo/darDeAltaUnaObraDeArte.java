package practicacom.practica.programacion.clasesMuseo;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.RunElement;

import practicacom.practica.programacion.clasesMuseo.obras;

public class darDeAltaUnaObraDeArte{
    private String ID;
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

    Scanner sc = new Scanner(System.in);

    public darDeAltaUnaObraDeArte(String iD, String tipo, String nombre, String autor, double precio, double altura,
            double peso, String material, String tecnica, int piezas, String descripción) {
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

    public darDeAltaUnaObraDeArte() {
    }

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
        System.out.print("ID: ");
        setID(sc.nextLine());
        System.out.print("Tipo: ");
        setTipo(sc.nextLine());
        System.out.print("Nombre: ");
        setNombre(sc.nextLine());;
        System.out.print("Autor: ");
        setAutor(sc.nextLine());
        System.out.print("Precio: ");
        setPrecio(sc.nextDouble());
        System.out.print("Altura: ");
        setAltura(sc.nextDouble());
        System.out.print("Peso: ");
        setAltura(sc.nextDouble());
        System.out.print("Material: ");
        setMaterial(sc.nextLine());
        System.out.print("Técnica: ");
        setTecnica(sc.nextLine());
        System.out.print("Piezas: ");
        setPiezas(sc.nextInt());
        System.out.print("Descripción ");
        setDescripción(sc.nextLine());
    }

    public obras nuevaObra() {
        darDeAlta();
        obras P6 = new obras(getID() , getTipo(), getNombre(), getAutor() , getPrecio() , getAltura() , getPeso() , 
          getMaterial() , getTecnica() , getPiezas() , getDescripción());
        return P6;
    }
    
    
    

    

}
