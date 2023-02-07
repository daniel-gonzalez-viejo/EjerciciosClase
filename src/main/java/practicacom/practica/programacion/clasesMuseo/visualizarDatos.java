package practicacom.practica.programacion.clasesMuseo;

public class visualizarDatos extends modificarObra {

    public visualizarDatos() {
    }

    @Override
    public void pedirObra() {
        super.pedirObra();
    }

    public void mostrarDatos(obras aux) {
        if(aux!= null) {
            System.out.println("Nombre: " + getNombre());
        }
    }
    
    

}
