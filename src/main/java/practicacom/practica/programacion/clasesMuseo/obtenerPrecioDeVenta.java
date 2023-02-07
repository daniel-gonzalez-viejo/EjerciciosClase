package practicacom.practica.programacion.clasesMuseo;

public class obtenerPrecioDeVenta extends verObras{
    
    public void obtenerPrecio(obras aux) {
        if (aux != null) {
            double precioFinal;
            double comision = aux.getPrecio()*0.25;
            System.out.println("");
            System.out.println("------------------------------");
            System.out.println("Nombre: " + aux.getNombre());
            System.out.println("Altura(m): " + aux.getAltura());
            System.out.println("Peso(t): " + aux.getPeso());
            System.out.println("Precio(euros): " + aux.getPrecio());
            System.out.println("Comisión de la galería: " + comision);
            precioFinal = aux.getPrecio() + comision;
            System.out.println("Precio total: " + precioFinal);
            System.out.println("");
        } 

    }

}
