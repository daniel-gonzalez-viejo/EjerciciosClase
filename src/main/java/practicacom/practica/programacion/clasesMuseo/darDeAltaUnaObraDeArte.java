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

    Scanner sc = new Scanner(System.in);

    public darDeAltaUnaObraDeArte() {
    }

    public void comprobarLongitudID(String id, int n, String mensaje_error) {
        while (id.length() > n) {
            System.out.println(mensaje_error);
            insertarID();
        }
    }

    public void comprobarTipoDeObra(String tipo, String mensaje_error) {
        while (tipo != "Pintura" || tipo != "Escultura") {
            System.out.println(mensaje_error);
            insertarTipo();
        }
    }

    public void insertarID() {
        System.out.print(ID);
        setID(sc.nextLine());
    }

    public void insertarTipo() {
        System.out.print(TIPO);
        setTipo(sc.nextLine());
    }

    public void insertarNombre() {
        System.out.print(NOMBRE);
        setNombre(sc.nextLine());
    }

    public void insertarAutor() {
        System.out.print(AUTOR);
        setAutor(sc.nextLine());
    }



    public void darDeAlta() {
        insertarID();
        comprobarLongitudID(getID(), 3, MENSAJE_ERROR_ID);
        insertarTipo();
        insertarNombre();
        insertarAutor();
        System.out.print(PRECIO);
        setPrecio(sc.nextDouble());
        System.out.print(ALTURA);
        setAltura(sc.nextDouble());
        Scanner sc = new Scanner(System.in); //Esta inserción de escáner es para arreglar un error con el escáner
        System.out.print(PESO);
        setPeso(sc.nextDouble());
        sc.nextLine(); //Esta inserción de escáner es para arreglar un error con el escáner
        System.out.print(MATERIAL);
        setMaterial(sc.nextLine());
        System.out.print(TÉCNICA);
        setTécnica(sc.next());
        System.out.print(PIEZAS);
        setPiezas(sc.nextInt());
        sc.nextLine(); //Esta inserción de escáner es para arreglar un error con el escáner
        System.out.print(DESCRIPCIÓN);
        setDescripción(sc.nextLine());
    }

    public obras nuevaObra() {
        darDeAlta();
        obras P6 = new obras(getID() , getTipo(), getNombre(), getAutor() , getPrecio() , getAltura() , getPeso() , 
          getMaterial() , getTécnica() , getPiezas() , getDescripción());
        return P6;
    }

}
