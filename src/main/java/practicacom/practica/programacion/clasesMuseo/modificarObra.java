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









                
                auxiliar_texto = ;
                aux.setNombre(auxiliar_texto);
                System.out.print (AUTOR);
                auxiliar_texto = insertarAutor();
                aux.setAutor(auxiliar_texto);
                System.out.print (PRECIO);
                auxiliar_dinero = insertarPrecio();
                aux.setPrecio(auxiliar_dinero);
                System.out.print (ALTURA);
                auxiliar_dinero = insertarAltura();
                aux.setAltura(auxiliar_dinero);
                System.out.print (PESO);
                auxiliar_dinero = insertarPeso();
                aux.setPeso(auxiliar_dinero);
                System.out.print (MATERIAL);
                auxiliar_texto = insertarMaterial(MENSAJE_ERROR_MATERIAL);
                aux.setMaterial(auxiliar_texto);
                System.out.print (TÉCNICA);
                auxiliar_texto = insertarTecnica(MENSAJE_ERROR_TECNICA);
                aux.setTécnica(auxiliar_texto);
                System.out.print (PIEZAS);
                auxiliar_cifras = insertarPiezas();
                aux.setPiezas(auxiliar_cifras);
                System.out.print (DESCRIPCIÓN);
                auxiliar_texto = insertarDescripción();
                aux.setDescripción(auxiliar_texto);
            }     
        }
}
