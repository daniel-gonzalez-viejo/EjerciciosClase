package practicacom.practica.programacion.clasesMuseo;

public class visualizarDatos extends modificarObra {

    public visualizarDatos() {
    }

    public void mostrarDatos(obras aux) {         
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

}
