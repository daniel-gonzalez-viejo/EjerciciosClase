package practicacom.practica.programacion.clasesMuseo;

public class obtenerPrecioDeVenta extends modificarObra{

    final String COMISION_GALERÍA = VERDE + "Comisión de la galería: " + BLANCO;
    final String IMPORTE_POR_PESO = VERDE + "Importe por peso (€): " + BLANCO;
    final String IMPORTE_POR_ALTURA = VERDE + "Importe por altura (€): " + BLANCO;
    final String PRECIO_VENTA = VERDE +"Precio de venta (€): "+ BLANCO;
    final String PRECIO_VENTA_DOLARES = VERDE + "Precio de venta ($): " + BLANCO;
    final String DESCUENTO_PINTURA = VERDE + "Descuento (10% Pintura €): " + BLANCO;
    final String DESCUENTO_ESCULTURA = VERDE + "Descuento (20% Escultura €): " + BLANCO;
    
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
            System.out.println(NOMBRE + aux.getNombre());
            System.out.println(ALTURA + aux.getAltura());
            System.out.println(PESO + aux.getPeso());
            System.out.println(PRECIO + aux.getPrecio());
            System.out.println(COMISION_GALERÍA + comision);
            System.out.println(IMPORTE_POR_PESO + importePeso);
            System.out.println(IMPORTE_POR_ALTURA + importeAltura);
            importePorPiezaAdicional(aux.getPiezas());
            precioFinal = aux.getPrecio() + comision + importePeso + importeAltura + importePiezas;
            System.out.println(PRECIO_VENTA + precioFinal);
            conversionADolares(precioFinal);
            descuentosPorObra(aux.getTipo());
            System.out.println(PRECIO_VENTA + (precioFinal - descuento));
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
                System.out.println(VERDE + "Importe adicional - Pieza " + i + " (euros):" + BLANCO + "10");
                importePiezas += 10;
            }
        }
    }

    public void conversionADolares(double precioFinal) {
        precioFinal = precioFinal * 0.99;
        System.out.println(PRECIO_VENTA_DOLARES + precioFinal);
    }

    public void descuentosPorObra(String Tipo) {
        if (Tipo == "Pintura") {
            descuento = precioFinal * 0.1;
            System.out.println(DESCUENTO_PINTURA + descuento);
        }
        else if (Tipo == "Escultura") {
            descuento = precioFinal * 0.2;
            System.out.println(DESCUENTO_ESCULTURA + descuento);
        }

    }


}
