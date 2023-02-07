package practicacom.practica.programacion.clasesMuseo;

public class obras {
    protected String ID;
    protected String Tipo;
    protected String Nombre;
    protected String Autor;
    protected double Precio;
    protected double Altura;
    protected double Peso;
    protected String Material;
    protected String Técnica;
    protected int Piezas;
    protected String Descripción;
    public obras(String iD, String tipo, String nombre, String autor, double precio, double altura, double peso,
            String material, String técnica, int piezas, String descripción) {
        this.ID = iD;
        this.Tipo = tipo;
        this.Nombre = nombre;
        this.Autor = autor;
        this.Precio = precio;
        this.Altura = altura;
        this.Peso = peso;
        this.Material = material;
        this.Técnica = técnica;
        this.Piezas = piezas;
        this.Descripción = descripción;
    }

    public obras() {
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
    public String getTécnica() {
        return Técnica;
    }
    public void setTécnica(String técnica) {
        Técnica = técnica;
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

    public String Cabeceros() {
        String s = "";
        System.out.print("ID" + "     ");
        System.out.print("Tipo" + "     ");
        System.out.print("Nombre" + "     ");
        System.out.print("Autor" + "     ");
        System.out.print("Precio" + "     ");
        System.out.print("Altura" + "     ");
        System.out.print("Peso" + "     ");
        System.out.print("Material" + "     ");
        System.out.print("Técnica" + "     ");
        System.out.print("Piezas" + "     ");
        System.out.print("Descripción");
        return s;
    }

    @Override
    public String toString() {
        String s = "";
        s += ID + "     ";
        s += Tipo + "     ";
        s += Nombre + "     ";
        s += Autor + "     ";
        s += Precio + "     ";
        s += Altura + "     ";
        s += Peso + "     ";
        s += Material + "     ";
        s += Técnica + "     ";
        s += Piezas + "     ";
        s += Descripción + "\n";

        return s;
    }

    

    
    
}