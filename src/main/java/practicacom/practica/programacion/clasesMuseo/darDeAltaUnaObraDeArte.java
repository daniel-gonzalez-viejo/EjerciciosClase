package practicacom.practica.programacion.clasesMuseo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class darDeAltaUnaObraDeArte extends verObras{
    final static String ID = "ID: ";
    final static String TIPO = "Tipo: ";
    final static String NOMBRE = "Nombre: ";
    final static String AUTOR = "Autor: ";
    final static String PRECIO = "Precio: ";
    final static String ALTURA = "Altura: ";
    final static String PESO = "Peso: ";
    final static String MATERIAL = "Material: ";
    final static String TÉCNICA = "Técnica: ";
    final static String PIEZAS = "Piezas: ";
    final static String DESCRIPCIÓN = "Descripción: ";

    final static String MENSAJE_ERROR_ID = "El ID es demasiado largo, por favor introduce un ID de máximo tres carácteres (por ejemplo 006): ";
    final static String MENSAJE_ERROR_TIPO = "Únicamente se aceptan obras de tipo [Pintura] o [Escultura]. Comprueba que esté escrito correctamente: ";
    final static String MENSAJE_ERROR_MATERIAL = "Únicamente se aceptan materiales de tipo [Acero], [Cobre] o [Hierro]. Comprueba que esté escrito correctamente: ";
    final static String MENSAJE_ERROR_TECNICA = "Únicamente se aceptan técnicas de tipo [Oleo], [Acuarela] o [Carboncillo]. Comprueba que esté escrito correctamente: ";
    final static String MENSAJE_ERROR_PRECIO = "El precio debe ser de carácter numérico: ";
    final static String MENSAJE_ERROR_ALTURA = "La altura debe ser de carácter numérico: ";
    final static String MENSAJE_ERROR_PESO = "El peso debe ser de carácter numérico: ";
    final static String MENSAJE_ERROR_PIEZAS = "La cantidad de piezas debe ser de carácter numérico: ";



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
            if (getID().length() <= n) {
                inserción_exitosa = true;
                break;
            }
            else {
                System.out.println(mensaje_error);
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
