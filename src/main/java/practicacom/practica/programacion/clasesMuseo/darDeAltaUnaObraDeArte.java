package practicacom.practica.programacion.clasesMuseo;

public class darDeAltaUnaObraDeArte {
    private int ID;
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
    
    public darDeAltaUnaObraDeArte(int iD, String tipo, String nombre, String autor, double precio, int altura, int peso,
            String material, String tecnica, int piezas, String descripción) {
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
    

    

}
