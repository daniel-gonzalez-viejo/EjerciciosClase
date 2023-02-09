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
            if (aux != null) {
                aux.setID(insertarID(TAMAÑO_MAXIMO_ID, MENSAJE_ERROR_ID));
                aux.setTipo(insertarTipo(MENSAJE_ERROR_TIPO));
                aux.setNombre(insertarNombre());
                aux.setAutor(insertarAutor());
                aux.setPrecio(insertarPrecio());
                aux.setAltura(insertarAltura());
                aux.setPeso(insertarPeso());
                aux.setMaterial(insertarMaterial(MENSAJE_ERROR_MATERIAL));
                aux.setTécnica(insertarTecnica(MENSAJE_ERROR_TECNICA));
                aux.setPiezas(insertarPiezas());
                aux.setDescripción(insertarDescripción());
            }     
        }
}
