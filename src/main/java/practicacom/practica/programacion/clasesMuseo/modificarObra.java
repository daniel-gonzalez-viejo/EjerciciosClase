package practicacom.practica.programacion.clasesMuseo;
import java.util.Scanner;

public class modificarObra extends darDeAltaUnaObraDeArte {

    Scanner sc = new Scanner(System.in);
    String código;
    
    public modificarObra() {
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String cod) {
        código = cod;
    }

    public void pedirObra() {
        System.out.print("¿Qué obra quieres visualizar?:  ");
        setCódigo(sc.nextLine());
    }

    public void modificar(obras aux) {
        String auxiliar_texto;  
        double auxiliar_dinero;
        int auxiliar_cifras;             
            if (aux != null) {
                System.out.print (ID);
                auxiliar_texto = sc.nextLine();
                aux.setID(auxiliar_texto);
                System.out.print (TIPO);
                auxiliar_texto = sc.nextLine();
                aux.setTipo(auxiliar_texto);
                System.out.print (NOMBRE);
                auxiliar_texto = sc.nextLine();
                aux.setNombre(auxiliar_texto);
                System.out.print (AUTOR);
                auxiliar_texto = sc.nextLine();
                aux.setAutor(auxiliar_texto);
                System.out.print (PRECIO);
                auxiliar_dinero = sc.nextDouble();
                aux.setPrecio(auxiliar_dinero);
                System.out.print (ALTURA);
                auxiliar_dinero = sc.nextDouble();
                aux.setAltura(auxiliar_dinero);
                Scanner sc = new Scanner(System.in); //Esta inserción de escáner es para arreglar un error con el escáner
                System.out.print (PESO);
                auxiliar_dinero = sc.nextDouble();
                aux.setPeso(auxiliar_dinero);
                sc.nextLine(); //Esta inserción de escáner es para arreglar un error con el escáner
                System.out.print (MATERIAL);
                auxiliar_texto = sc.nextLine();
                aux.setMaterial(auxiliar_texto);
                System.out.print (TÉCNICA);
                auxiliar_texto = sc.nextLine();
                aux.setTécnica(auxiliar_texto);
                System.out.print (PIEZAS);
                auxiliar_cifras = sc.nextInt();
                aux.setPiezas(auxiliar_cifras);
                sc.nextLine(); //Esta inserción de escáner es para arreglar un error con el escáner
                System.out.print (DESCRIPCIÓN);
                auxiliar_texto = sc.nextLine();
                aux.setDescripción(auxiliar_texto);
            } 
    }

    
    
    
}
