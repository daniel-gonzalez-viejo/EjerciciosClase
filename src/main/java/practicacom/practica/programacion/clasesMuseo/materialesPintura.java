package practicacom.practica.programacion.clasesMuseo;

public class materialesPintura {
    final static String OLEO = "Oleo";
    final static String ACUARELA = "Acuarela";
    final static String CARBONCILLO = "Carboncillo";

    final static String MATERIALES[] = {OLEO, ACUARELA, CARBONCILLO};

    public static String getOleo() {
        return OLEO;
    }

    public static String getAcuarela() {
        return ACUARELA;
    }

    public static String getCarboncillo() {
        return CARBONCILLO;
    }

    public static String[] getMateriales() {
        return MATERIALES;
    }

    interface TIPO_MATERIALES_PINTURA {
        public static String getOleo() {
            return OLEO;
        }
    
        public static String getAcuarela() {
            return ACUARELA;
        }
    
        public static String getCarboncillo() {
            return CARBONCILLO;
        }
    
        public static String[] getMateriales() {
            return MATERIALES;
        }
    }
}
