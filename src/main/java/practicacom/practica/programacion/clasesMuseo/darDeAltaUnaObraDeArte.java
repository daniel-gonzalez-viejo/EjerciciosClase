package practicacom.practica.programacion.clasesMuseo;

import java.util.Scanner;

public class darDeAltaUnaObraDeArte extends obras{


    Scanner sc = new Scanner(System.in);

    public darDeAltaUnaObraDeArte(String iD, String tipo, String nombre, String autor, double precio, double altura,
            double peso, String material, String técnica, int piezas, String descripción) {
        super(iD, tipo, nombre, autor, precio, altura, peso, material, técnica, piezas, descripción);
    }


    public void darDeAlta() {
        System.out.print("ID: ");
        setID(sc.nextLine());
        System.out.print("Tipo: ");
        setTipo(sc.nextLine());
        System.out.print("Nombre: ");
        setNombre(sc.nextLine());;
        System.out.print("Autor: ");
        setAutor(sc.nextLine());
        System.out.print("Precio: ");
        setPrecio(sc.nextDouble());
        System.out.print("Altura: ");
        setAltura(sc.nextDouble());
        Scanner sc = new Scanner(System.in); //Esta inserción de escáner es para arreglar un error con el escáner
        System.out.print("Peso: ");
        setPeso(sc.nextDouble());
        sc.nextLine(); //Esta inserción de escáner es para arreglar un error con el escáner
        System.out.print("Material: ");
        setMaterial(sc.nextLine());
        System.out.print("Técnica: ");
        setTécnica(sc.next());
        System.out.print("Piezas: ");
        setPiezas(sc.nextInt());
        sc.nextLine(); //Esta inserción de escáner es para arreglar un error con el escáner
        System.out.print("Descripción: ");
        setDescripción(sc.nextLine());
    }

    public obras nuevaObra() {
        darDeAlta();
        obras P6 = new obras(getID() , getTipo(), getNombre(), getAutor() , getPrecio() , getAltura() , getPeso() , 
          getMaterial() , getTécnica() , getPiezas() , getDescripción());
        return P6;
    }

}
