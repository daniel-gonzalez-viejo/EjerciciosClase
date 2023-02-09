package practicacom.practica.programacion.clasesMuseo;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class darDeAltaUnaObraDeArte extends verObras{
    final String ID = "ID: ";
    final String TIPO = "Tipo: ";
    final String NOMBRE = "Nombre: ";
    final String AUTOR = "Autor: ";
    final String PRECIO = "Precio: ";
    final String ALTURA = "Altura: ";
    final String PESO = "Peso: ";
    final String MATERIAL = "Material: ";
    final String TÉCNICA = "Técnica: ";
    final String PIEZAS = "Piezas: ";
    final String DESCRIPCIÓN = "Descripción: ";

    final String MENSAJE_ERROR_ID = "El ID es demasiado largo, por favor introduce un ID de máximo tres carácteres (por ejemplo 006): ";
    final String MENSAJE_ERROR_TIPO = "Únicamente se aceptan obras de tipo [Pintura] o [Escultura]. Comprueba que esté escrito correctamente: ";

    final int TAMAÑO_MAXIMO_ID = 3;
    final String OPCION_TIPO_PINTURA = "Pintura";
    final String OPCION_TIPO_ESCULTURA = "Escultura";

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



    public void darDeAlta() {
        insertarID(TAMAÑO_MAXIMO_ID, MENSAJE_ERROR_ID);
        insertarTipo(MENSAJE_ERROR_TIPO);
        insertarNombre();
        insertarAutor();
        insertarPrecio(); 
        insertarAltura();
        //Scanner sc = new Scanner(System.in); //Esta inserción de escáner es para arreglar un error con el escáner
        insertarPeso();
        /*sc.nextLine(); //Esta inserción de escáner es para arreglar un error con el escáner
        System.out.print(MATERIAL);
        setMaterial(sc.nextLine());
        System.out.print(TÉCNICA);
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
