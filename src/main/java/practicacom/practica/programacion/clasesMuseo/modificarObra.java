package practicacom.practica.programacion.clasesMuseo;
import java.util.Scanner;

import javax.lang.model.type.NoType;

import practicacom.practica.programacion.clasesMuseo.abrirMenu;
public class modificarObra extends obras {

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
        System.out.print("¿Qué obra quieres visualizar?");
        setCed(dd.nextLine());
    }

    public void modificar(obras aux) {
        String nuevo;               
            if (aux != null) {
                System.out.print ("Cambios: ");
                nuevo = dd.nextLine();
                aux.setID(nuevo);
            } 
    }

    
    
    
}
