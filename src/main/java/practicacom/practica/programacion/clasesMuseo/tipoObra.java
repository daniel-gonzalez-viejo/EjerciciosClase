package practicacom.practica.programacion.clasesMuseo;

public class tipoObra {
    protected static final String PINTURA = "Pintura"; 
    protected static final String ESCULTURA = "Escultura";

    protected static final String TIPOS[] = {PINTURA, ESCULTURA};

    public static String getPintura() {
        return PINTURA;
    }
    public static String getObra() {
        return ESCULTURA;
    }
    public static String[] getTipos() {
        return TIPOS;
    }

    interface TIPO_OBRA {

        public static String getPintura() {
            return PINTURA;
        }
        public static String getObra() {
            return ESCULTURA;
        } 
        public static String[] getTipos() {
            return TIPOS;
        }
    }


    
    
}