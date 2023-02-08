package practicacom.practica.programacion.clasesMuseo;

public class obtenerPrecioDeVenta extends modificarObra{
    private double importePeso;
    private double importeAltura;
    private double importePiezas;
    private double descuento;
    private double precioFinal;
    private double comision;

    public obtenerPrecioDeVenta() {
    }

    public void obtenerPrecio(obras aux) {
        if (aux != null) {
            comision = aux.getPrecio()*0.25;
            importePorPeso(aux.getPeso());
            importePorAltura(aux.getAltura());
            System.out.println("");
            System.out.println("------------------------------");
            System.out.println("Nombre: " + aux.getNombre());
            System.out.println("Altura(m): " + aux.getAltura());
            System.out.println("Peso(t): " + aux.getPeso());
            System.out.println("Precio(euros): " + aux.getPrecio());
            System.out.println("Comisión de la galería: " + comision);
            System.out.println("Importe por peso (euros): " + importePeso);
            System.out.println("Importe por altura (euros): " + importeAltura);
            importePorPiezaAdicional(aux.getPiezas());
            precioFinal = aux.getPrecio() + comision + importePeso + importeAltura + importePiezas;
            System.out.println("Precio de venta (euros): " + precioFinal);
            conversionADolares(precioFinal);
            descuentosPorObra(aux.getTipo());
            System.out.println("Precio de venta (euros): " + (precioFinal - descuento));
            System.out.println("");
        } 

    }

    public void importePorPeso(double peso) {
        if (peso > 1) {
            importePeso = 100;
        }
        else {
            importePeso = 20;
        }
    }

    public void importePorAltura(double altura) {
        if (altura > 2) {
            importeAltura = 100;
        }
        else {
            importeAltura = 20;
        }
    }

    public void importePorPiezaAdicional(int piezas) {
        if (piezas > 2) {
            for (int i = 3; i <= piezas; i++) {
                System.out.println("Importe adicional - Pieza " + i + " (euros): 10");
                importePiezas += 10;
            }
        }
    }

    public void conversionADolares(double precioFinal) {
        precioFinal = precioFinal * 0.99;
        System.out.println("Precio de venta (dolares): " + precioFinal);
    }

    public void descuentosPorObra(String Tipo) {
        if (Tipo == "Pintura") {
            descuento = precioFinal * 0.1;
            System.out.println("Descuento (10% Pintura euros): " + descuento);
        }
        else if (Tipo == "Escultura") {
            descuento = precioFinal * 0.2;
            System.out.println("Descuento (20% Escultura euros): " + descuento);
        }

    }


}
