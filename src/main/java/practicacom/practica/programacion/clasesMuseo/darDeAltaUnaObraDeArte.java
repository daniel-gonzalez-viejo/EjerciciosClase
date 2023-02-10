package practicacom.practica.programacion.clasesMuseo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class darDeAltaUnaObraDeArte extends verObras{
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

    public darDeAltaUnaObraDeArte() {
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

    public String insertarNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.print(NOMBRE);
        setNombre(sc.nextLine());
        return getNombre();
    }

    public String insertarAutor() {
        Scanner sc = new Scanner(System.in);
        System.out.print(AUTOR);
        setAutor(sc.nextLine());
        return getAutor();
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

    public String insertarDescripción() {
        Scanner sc = new Scanner(System.in);
        System.out.print(DESCRIPCIÓN);
        setDescripción(sc.nextLine());
        return getDescripción();
    }

    public void darDeAlta() {
        insertarID(TAMAÑO_MAXIMO_ID, MENSAJE_ERROR_ID);
        insertarTipo(MENSAJE_ERROR_TIPO);
        insertarNombre();
        insertarAutor();
        insertarPrecio(); 
        insertarAltura();
        insertarPeso();
        insertarMaterial(MENSAJE_ERROR_MATERIAL);
        insertarTecnica(MENSAJE_ERROR_TECNICA);
        insertarPiezas();
        insertarDescripción();
    }

    public obras nuevaObra() {
        darDeAlta();
        obras P6 = new obras(getID() , getTipo(), getNombre(), getAutor() , getPrecio() , getAltura() , getPeso() , 
          getMaterial() , getTécnica() , getPiezas() , getDescripción());
        return P6;
    }

}
