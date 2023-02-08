package practicacom.practica.programacion.clasesMuseo;

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

    Scanner sc = new Scanner(System.in);

    public darDeAltaUnaObraDeArte() {
    }

    public void insertarID() {
        System.out.print(ID);
        setID(sc.nextLine());
    }
    

    public void darDeAlta() {
        insertarID();
        while (getID().length() > 3) {
            System.out.println("El ID es demasiado largo, por favor introduce un ID de máximo tres carácteres (por ejemplo 006): ");
            insertarID();
        }
        System.out.print(TIPO);
        setTipo(sc.nextLine());
        System.out.print(NOMBRE);
        setNombre(sc.nextLine());;
        System.out.print(AUTOR);
        setAutor(sc.nextLine());
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
