package practicacom.practica.programacion.clasesMuseo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class obras {
    final static String ROJO = "\u001B[31m";
    final static String VERDE = "\u001B[32m";
    final static String AMARILLO = "\u001B[33m";
    final static String AZUL = "\u001B[34m";
    final static String MORADO = "\u001B[35m";
    final static String CYAN = "\u001B[36m";
    final static String BLANCO = "\u001B[37m";

    final static String ID = VERDE + "ID: " + BLANCO;
    final static String TIPO = VERDE + "Tipo: " + BLANCO;
    final static String NOMBRE = VERDE + "Nombre: " + BLANCO;
    final static String AUTOR = VERDE + "Autor: " + BLANCO;
    final static String PRECIO = VERDE + "Precio: " + BLANCO;
    final static String ALTURA = VERDE + "Altura: " + BLANCO;
    final static String PESO = VERDE + "Peso: " + BLANCO;
    final static String MATERIAL = VERDE + "Material: " + BLANCO;
    final static String TÉCNICA = VERDE + "Técnica: " + BLANCO;
    final static String PIEZAS = VERDE + "Piezas: " + BLANCO;
    final static String DESCRIPCIÓN = VERDE + "Descripción: " + BLANCO;

    final static String MENSAJE_ERROR_ID_BLANCO = ROJO + "El ID no puede estar en blanco" + BLANCO;
    final static String MENSAJE_ERROR_ID = ROJO + "El ID es demasiado largo, por favor introduce un ID de máximo tres carácteres (por ejemplo 006): " + BLANCO;
    final static String MENSAJE_ERROR_TIPO = ROJO + "Únicamente se aceptan obras de tipo [Pintura] o [Escultura]. Comprueba que esté escrito correctamente: " + BLANCO;
    final static String MENSAJE_ERROR_MATERIAL = ROJO + "Únicamente se aceptan materiales de tipo [Acero], [Cobre] o [Hierro]. Comprueba que esté escrito correctamente: " + BLANCO;
    final static String MENSAJE_ERROR_TECNICA = ROJO + "Únicamente se aceptan técnicas de tipo [Oleo], [Acuarela] o [Carboncillo]. Comprueba que esté escrito correctamente: " + BLANCO;
    final static String MENSAJE_ERROR_PRECIO = ROJO + "El precio debe ser de carácter numérico: " + BLANCO;
    final static String MENSAJE_ERROR_ALTURA = ROJO + "La altura debe ser de carácter numérico: " + BLANCO;
    final static String MENSAJE_ERROR_PESO = ROJO + "El peso debe ser de carácter numérico: " + BLANCO;
    final static String MENSAJE_ERROR_PIEZAS = ROJO + "La cantidad de piezas debe ser de carácter numérico: " + BLANCO;



    final static int TAMAÑO_MAXIMO_ID = 3;
    final static String OPCION_TIPO_PINTURA = "Pintura";
    final static String OPCION_TIPO_ESCULTURA = "Escultura";
    final static String OPCION_MATERIAL_ACERO = "Acero";
    final static String OPCION_MATERIAL_COBRE = "Cobre";
    final static String OPCION_MATERIAL_HIERRO = "Hierro";
    final static String OPCION_TECNICA_OLEO = "Oleo";
    final static String OPCION_TECNICA_ACUARELA = "Acuarela";
    final static String OPCION_TECNICA_CARBONCILLO = "Carboncillo";

    static boolean inserción_exitosa = false;    

    private String id;
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

    public obras(String id, String tipo, String nombre, String autor, double precio, double altura, double peso,
            String material, String técnica, int piezas, String descripción) {
        this.id = id;
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
        return id;
    }
    public void setID(String iD) {
        id = iD;
    }

    public String insertarID(int n, String mensaje_error) {
        while (!inserción_exitosa) {
            Scanner sc = new Scanner(System.in);
            System.out.print(ID);
            setID(sc.nextLine());
            if (getID().isBlank()) {
                System.out.println(MENSAJE_ERROR_ID_BLANCO);
            }
            else if (getID().length() <= n && !getID().isBlank()) {
                inserción_exitosa = true;
                break;
            }    
            else if (getID().length() > n) {
                System.out.println(mensaje_error);
            }
            else {
                System.out.println(MENSAJE_ERROR_ID_BLANCO);
            }
        }
        inserción_exitosa = false;
        return getID();
    }

    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public String insertarTipo(String mensaje_error) {
        while (!inserción_exitosa) {
            Scanner sc = new Scanner(System.in);
            System.out.print(TIPO);
            setTipo(sc.nextLine());
            if (getTipo().equals(OPCION_TIPO_PINTURA) || getTipo().equals(OPCION_TIPO_ESCULTURA)) {
                inserción_exitosa = true;
                break;
            }
            else {
                System.out.println(mensaje_error);
            }
        }
        inserción_exitosa = false;
        return getTipo();
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String insertarNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.print(NOMBRE);
        setNombre(sc.nextLine());
        return getNombre();
    }

    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }

    public String insertarAutor() {
        Scanner sc = new Scanner(System.in);
        System.out.print(AUTOR);
        setAutor(sc.nextLine());
        return getAutor();
    }

    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }

    public double insertarPrecio() {
        while(!inserción_exitosa) {
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print(PRECIO);
                setPrecio(sc.nextDouble());
                inserción_exitosa = true;
            }
            catch (InputMismatchException e) {
                System.out.println(MENSAJE_ERROR_PRECIO);
            }
        }
        inserción_exitosa = false;
        return getPrecio();
    }

    public double getAltura() {
        return Altura;
    }
    public void setAltura(double altura) {
        Altura = altura;
    }
    public double insertarAltura() {
        while(!inserción_exitosa) {
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print(ALTURA);
                setAltura(sc.nextDouble());
                inserción_exitosa = true;
            }
            catch (InputMismatchException e) {
                System.out.println(MENSAJE_ERROR_ALTURA);
            }
        }
        inserción_exitosa = false;
        return getAltura();
    }
    public double getPeso() {
        return Peso;
    }
    public void setPeso(double peso) {
        Peso = peso;
    }
    public double insertarPeso() {
        while(!inserción_exitosa) {
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print(PESO);
                setPeso(sc.nextDouble());
                inserción_exitosa = true;
            }
            catch (InputMismatchException e) {
                System.out.println(MENSAJE_ERROR_PESO);
            }
        }
        inserción_exitosa = false;
        return getPeso();
    }

    public String getMaterial() {
        return Material;
    }
    public void setMaterial(String material) {
        Material = material;
    }
    public String insertarMaterial(String mensaje_error) {
        if (getTipo().equals(OPCION_TIPO_PINTURA)) {
            setMaterial("   ");
        }
        else if (getTipo().equals(OPCION_TIPO_ESCULTURA)) {
            while (!inserción_exitosa) {
            Scanner sc = new Scanner(System.in);
            System.out.print(MATERIAL);
            setMaterial(sc.nextLine());
                if (getMaterial().equals(OPCION_MATERIAL_ACERO) || getMaterial().equals(OPCION_MATERIAL_COBRE) 
                    || getMaterial().equals(OPCION_MATERIAL_HIERRO)) {
                    inserción_exitosa = true;
                    break;
                }
                else {
                    System.out.println(mensaje_error);
                }
            }
            inserción_exitosa = false;
        }
        return getMaterial();
    }

    public String getTécnica() {
        return Técnica;
    }
    public void setTécnica(String técnica) {
        Técnica = técnica;
    }
    public String insertarTecnica(String mensaje_error) {
        if (getTipo().equals(OPCION_TIPO_ESCULTURA)) {
            setTécnica("   ");
        }
        else if (getTipo().equals(OPCION_TIPO_PINTURA)) {
            while (!inserción_exitosa) {
            Scanner sc = new Scanner(System.in);
            System.out.print(TÉCNICA);
            setTécnica(sc.nextLine());
                if (getTécnica().equals(OPCION_TECNICA_ACUARELA) || getTécnica().equals(OPCION_TECNICA_CARBONCILLO) 
                    || getTécnica().equals(OPCION_TECNICA_OLEO)) {
                    inserción_exitosa = true;
                    break;
                }
                else {
                    System.out.println(mensaje_error);
                }
            }
            inserción_exitosa = false;
        }
        return getTécnica();
    }

    public int getPiezas() {
        return Piezas;
    }
    public void setPiezas(int piezas) {
        Piezas = piezas;
    }
    public int insertarPiezas() {
        while(!inserción_exitosa) {
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print(PIEZAS);
                setPiezas(sc.nextInt());
                inserción_exitosa = true;
            }
            catch (InputMismatchException e) {
                System.out.println(MENSAJE_ERROR_PIEZAS);
            }
        }
        inserción_exitosa = false;
        return getPiezas();
    }

    public String getDescripción() {
        return Descripción;
    }
    public void setDescripción(String descripción) {
        Descripción = descripción;
    }
    public String insertarDescripción() {
        Scanner sc = new Scanner(System.in);
        System.out.print(DESCRIPCIÓN);
        setDescripción(sc.nextLine());
        return getDescripción();
    }

    public String Cabeceros() {
        String s = "";
        System.out.print(VERDE + "ID" + "     ");
        System.out.print("Tipo" + "     ");
        System.out.print("Nombre" + "     ");
        System.out.print("Autor" + "     ");
        System.out.print("Precio" + "     ");
        System.out.print("Altura" + "     ");
        System.out.print("Peso" + "     ");
        System.out.print("Material" + "     ");
        System.out.print("Técnica" + "     ");
        System.out.print("Piezas" + "     ");
        System.out.print("Descripción" + BLANCO);
        return s;
    }
    

    @Override
    public String toString() {
        String s = "";
        s += ROJO + id + "     " + BLANCO;
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