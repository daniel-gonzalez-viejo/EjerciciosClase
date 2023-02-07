package practicacom.practica.programacion.clasesMuseo;
<<<<<<< HEAD
import java.io.ObjectInputStream.GetField;

=======
>>>>>>> 495a01b (creo la clase visualizarDatos)

public class visualizarDatos extends modificarObra {

    public visualizarDatos() {
    }
<<<<<<< HEAD
<<<<<<< HEAD

    public void mostrarDatos(obras aux) {
        String nuevo;  
        double nuevo2;
        int nuevo3;             
            if (aux != null) {
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Autor: " + aux.getAutor());
                System.out.println("Precio(euros): " + aux.getPrecio());
                System.out.println("Altura(m): " + aux.getAltura());
                System.out.println("Peso(t): " + aux.getPeso());
                System.out.println("Número de piezas: " + aux.getPiezas());
                System.out.println("Descripción: " + aux.getDescripción());
                System.out.println("");
            } 
    }
=======
>>>>>>> 495a01b (creo la clase visualizarDatos)
=======

    @Override
    public void pedirObra() {
        super.pedirObra();
    }

    public void mostrarDatos(obras aux) {
        if(aux!= null) {
            System.out.println("Nombre: " + getNombre());
        }
    }
>>>>>>> d7f84eb (añado metodo mostrarDatos)
    
    

}
