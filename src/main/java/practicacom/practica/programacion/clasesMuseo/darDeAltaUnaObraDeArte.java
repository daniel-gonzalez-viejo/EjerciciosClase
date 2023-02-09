package practicacom.practica.programacion.clasesMuseo;

import java.io.ObjectInputStream.GetField;
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


    final static int TAMAÑO_MAXIMO_ID = 3;
    final static String OPCION_TIPO_PINTURA = "Pintura";
    final static String OPCION_TIPO_ESCULTURA = "Escultura";
    final static String OPCION_MATERIAL_ACERO = "Acero";
    final static String OPCION_MATERIAL_COBRE = "Cobre";
    final static String OPCION_MATERIAL_HIERRO = "Hierro";


    static boolean inserción_exitosa = false;    

    public darDeAltaUnaObraDeArte() {
    }

    public void insertarID(int n, String mensaje_error) {
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
    }

    public void insertarTipo(String mensaje_error) {
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
    }

    public void insertarNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.print(NOMBRE);
        setNombre(sc.nextLine());
    }

    public void insertarAutor() {
        Scanner sc = new Scanner(System.in);
        System.out.print(AUTOR);
        setAutor(sc.nextLine());
    }

    public void insertarPrecio() {
        Scanner sc = new Scanner(System.in);
        System.out.print(PRECIO);
        setPrecio(sc.nextDouble());
    }

    public void insertarAltura() {
        Scanner sc = new Scanner(System.in);
        System.out.print(ALTURA);
        setAltura(sc.nextDouble());
    }

    public void insertarPeso() {
        Scanner sc = new Scanner(System.in);
        System.out.print(PESO);
        setPeso(sc.nextDouble());
    }

    public void insertarMaterial(String mensaje_error) {
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
        
        /*System.out.print(TÉCNICA);
        setTécnica(sc.next());
        System.out.print(PIEZAS);
        setPiezas(sc.nextInt());
        sc.nextLine(); //Esta inserción de escáner es para arreglar un error con el escáner
        System.out.print(DESCRIPCIÓN);
        setDescripción(sc.nextLine());
        */
    }

    public obras nuevaObra() {
        darDeAlta();
        obras P6 = new obras(getID() , getTipo(), getNombre(), getAutor() , getPrecio() , getAltura() , getPeso() , 
          getMaterial() , getTécnica() , getPiezas() , getDescripción());
        return P6;
    }

}
