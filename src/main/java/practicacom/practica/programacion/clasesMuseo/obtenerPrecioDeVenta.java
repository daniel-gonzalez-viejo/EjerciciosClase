package practicacom.practica.programacion.clasesMuseo;

import practicacom.practica.programacion.clasesMuseo.tipoObra.TIPO_OBRA;

public class obtenerPrecioDeVenta extends modificarObra implements TIPO_OBRA{

    final String COMISION_GALERÍA = VERDE + "Comisión de la galería: " + BLANCO;
    final String IMPORTE_POR_PESO = VERDE + "Importe por peso (EUR): " + BLANCO;
    final String IMPORTE_POR_ALTURA = VERDE + "Importe por altura (EUR): " + BLANCO;
    final String PRECIO_VENTA = VERDE +"Precio de venta (EUR): "+ BLANCO;
    final String PRECIO_VENTA_DOLARES = VERDE + "Precio de venta (USD): " + BLANCO;
    final String DESCUENTO_PINTURA = VERDE + "Descuento (10% Pintura EUR): " + BLANCO;
    final String DESCUENTO_ESCULTURA = VERDE + "Descuento (20% Escultura EUR): " + BLANCO;
    
    private double importePeso;
    private double importeAltura;
    private double importePiezas;
    private double descuento;
    private double precio_final;
    private double comision;

    public obtenerPrecioDeVenta() {
    } 

    public double getComision() {
        return comision;
    }

    public void setComision(double comision, double precio) {
        this.comision = precio * comision;
    }

    public double getImportePeso() {
        return importePeso;
    }

    public void setImportePeso(double importePeso) {
        this.importePeso = importePeso;
    }

    public double getImporteAltura() {
        return importeAltura;
    }

    public void setImporteAltura(double importeAltura) {
        this.importeAltura = importeAltura;
    }

    public double getImportePiezas() {
        return importePiezas;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento * getPrecio_final();
    }

    public double getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(obras aux, double precio_final) {
        this.precio_final = precio_final + aux.getPrecio() + getComision() + getImportePeso() + getImporteAltura() + getImportePiezas();
    }



    public void obtenerPrecio(obras aux) {
        if (aux != null) {
            setComision(aux.getPrecio(), 0.25);  //comision = aux.getPrecio()*0.25;
            importePorPeso(aux.getPeso());
            importePorAltura(aux.getAltura());
            System.out.println("");
            System.out.println("------------------------------");
            System.out.println(NOMBRE + aux.getNombre());
            System.out.println(ALTURA + aux.getAltura());
            System.out.println(PESO + aux.getPeso());
            System.out.println(PRECIO + aux.getPrecio());
            System.out.println(COMISION_GALERÍA + getComision());
            System.out.println(IMPORTE_POR_PESO + getImportePeso());
            System.out.println(IMPORTE_POR_ALTURA + getImporteAltura());
            importePorPiezaAdicional(aux.getPiezas());
            setPrecio_final(aux, precio_final);
            //precio_final = aux.getPrecio() + comision + importePeso + importeAltura + importePiezas;
            System.out.println(PRECIO_VENTA + getPrecio_final());
            conversionADolares(precio_final);
            descuentosPorObra(aux);
            System.out.println(PRECIO_VENTA + (getPrecio_final() - descuento));
            System.out.println("");
        } 

    }

    public void importePorPeso(double peso) {
        if (peso > 1) {
            setImportePeso(100);
        }
        else {
            setImportePeso(20);
        }
    }

    public void importePorAltura(double altura) {
        if (altura > 2) {
            setImporteAltura(100);
        }
        else {
            setImporteAltura(20);
        }
    }

    public void importePorPiezaAdicional(int piezas) {
        if (piezas > 2) {
            for (int i = 3; i <= piezas; i++) {
                System.out.println(VERDE + "Importe adicional - Pieza " + i + " (EUR):" + BLANCO + " 10");
                importePiezas += 10;
            }
        }
    }

    public void conversionADolares(double precioFinal) {
        precioFinal = precioFinal * 0.99;
        System.out.println(PRECIO_VENTA_DOLARES + precioFinal);
    }

    public void descuentosPorObra(obras aux) {
        if (aux.getTipo().equalsIgnoreCase(TIPO_OBRA.getPintura())) {
            setDescuento(0.1);
            System.out.println(DESCUENTO_PINTURA + getDescuento());
        }
        else if (aux.getTipo().equalsIgnoreCase(TIPO_OBRA.getEscultura())) {
            setDescuento(0.2);
            System.out.println(DESCUENTO_ESCULTURA + getDescuento());
        }

    }


}
