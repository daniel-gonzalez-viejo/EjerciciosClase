package practicacom.practica.programacion.clasesMuseo;

public class imprimirEtiqueta extends modificarObra{

    public imprimirEtiqueta() {
    }

    public void imprimirUnaEtiqueta(obras aux) {
        if (aux != null) {
            System.out.println();
            System.out.println("------------------------------");
            System.out.println(NOMBRE + aux.getNombre());
            System.out.println(AUTOR + aux.getAutor());
            System.out.println(DESCRIPCIÓN + aux.getDescripción());
        } 
    }
    
    
}
