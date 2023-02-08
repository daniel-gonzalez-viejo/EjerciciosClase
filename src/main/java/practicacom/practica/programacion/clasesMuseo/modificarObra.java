package practicacom.practica.programacion.clasesMuseo;
import java.util.Scanner;

public class modificarObra extends darDeAltaUnaObraDeArte {

    Scanner sc = new Scanner(System.in);
    String Ced;
    Scanner dd = new Scanner(System.in);
    
    public modificarObra() {
    }

    public String getCed() {
        return Ced;
    }

    public void setCed(String ced) {
        Ced = ced;
    }

    public void pedirObra() {
        System.out.print("¿Qué obra quieres visualizar?:  ");
        setCed(dd.nextLine());
    }

    public void modificar(obras aux) {
        String nuevo;  
        double nuevo2;
        int nuevo3;             
            if (aux != null) {
                System.out.print (ID);
                nuevo = dd.nextLine();
                aux.setID(nuevo);
                System.out.print (TIPO);
                nuevo = dd.nextLine();
                aux.setTipo(nuevo);
                System.out.print (NOMBRE);
                nuevo = dd.nextLine();
                aux.setNombre(nuevo);
                System.out.print (AUTOR);
                nuevo = dd.nextLine();
                aux.setAutor(nuevo);
                System.out.print (PRECIO);
                nuevo2 = dd.nextDouble();
                aux.setPrecio(nuevo2);
                System.out.print (ALTURA);
                nuevo2 = dd.nextDouble();
                aux.setAltura(nuevo2);
                Scanner dd = new Scanner(System.in); //Esta inserción de escáner es para arreglar un error con el escáner
                System.out.print (PESO);
                nuevo2 = dd.nextDouble();
                aux.setPeso(nuevo2);
                dd.nextLine(); //Esta inserción de escáner es para arreglar un error con el escáner
                System.out.print (MATERIAL);
                nuevo = dd.nextLine();
                aux.setMaterial(nuevo);
                System.out.print (TÉCNICA);
                nuevo = dd.nextLine();
                aux.setTécnica(nuevo);
                System.out.print (PIEZAS);
                nuevo3 = dd.nextInt();
                aux.setPiezas(nuevo3);
                dd.nextLine(); //Esta inserción de escáner es para arreglar un error con el escáner
                System.out.print (DESCRIPCIÓN);
                nuevo = dd.nextLine();
                aux.setDescripción(nuevo);
            } 
    }

    
    
    
}
