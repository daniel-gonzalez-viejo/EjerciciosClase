package practicacom.practica.programacion.clasesMuseo;

public class imprimirEtiqueta extends modificarObra{

    public imprimirEtiqueta() {
    }

    public void imprimirUnaEtiqueta(obras aux) {
        if (aux != null) {
            System.out.println();
            System.out.println("------------------------------");
            System.out.println("Nombre: " + aux.getNombre());
            System.out.println("Autor: " + aux.getAutor());
            System.out.println("Descripción: " + aux.getDescripción());
        } 
    }
    
    
}
