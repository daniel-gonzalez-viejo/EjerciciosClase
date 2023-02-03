package practicacom.practica.programacion.clasesMuseo;

import java.util.Vector;

public class verObras {

    public Vector[] objeto2 = new Vector[4];
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
    Vector objeto = new Vector();
    
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


    public String Cabeceras() {
        return "ID" + "    " + "Tipo" + "        " + "Nombre" + "            " + "Autor" + "       " + "Precio" + "   "
         + "Alt." + "  " + "Peso"        + "  " + "Mat." + "  " + "Técnica" + "     " + "Piezas" + "       " + "Descripción";
    }

    public Vector obrasDeArte(Vector objeto) {
        objeto.addElement("001" + "   Pintura"+ "     Guernica"+ "          P.Picasso" + "   1000" + "     5" + "     2" +   "null"+   "Óleo" + 5 + "Cuadro de la guerra civil");
        objeto.addElement("002" + "   Pintura"+ "     La Vie"+ "            P.Picasso" + "   200" +  "      5" + "     1" +   "null"+   "Óleo" + 5 + "Óleo");
        objeto.addElement("003" + "   Pintura"+ "     El Sueño"+ "          P.Picasso" + "   300" +  "      5" + "     1.3" + "null"+   "Óleo" + 5 + "Óleo");
        objeto.addElement("004" + "   Pintura"+ "     Retrato.D Maar"+ "    P.Picasso" + "   400" +  "      5" + "     1" +   "null"+   "Óleo" + 5 + "Óleo");
        objeto.addElement("005" + "   Escultura"+ "   El piel roja"+ "      U.Chueca" + "    350" +  "      5" + "     1" +  "acero" + null +  5 + "Escultura");

        return objeto;

    }

    public void verLasObras(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println(Cabeceras());
        obrasDeArte(objeto);

        for(int i = 0; i < objeto.size(); i++) {
            System.out.println(objeto.elementAt(i)+"\t");
        }
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
        return Técnica;
    }

    public void setTecnica(String tecnica) {
        Técnica = tecnica;
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

    public Vector[] getObjeto2() {
        return objeto2;
    }

    public void setObjeto2(Vector[] objeto2) {
        objeto2 = objeto2;
    }


    @Override
    public String toString() {
        return ID + "   " + Tipo + "   " + Nombre + "   " + Autor + "   " + Precio + "   " + Altura + "   " + Peso
                + "   " + Material + "   " + Técnica + "   " + "     " + Piezas + "   " + "         " + Descripción;
    }
}
