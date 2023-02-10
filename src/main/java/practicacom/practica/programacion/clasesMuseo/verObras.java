package practicacom.practica.programacion.clasesMuseo;

public class verObras extends obras{

    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MORADO = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";
    
    private obras vec[];
    private int tamaño;
    private int posiciones;

    public verObras(int n) {
        tamaño = n;
        vec = new obras[tamaño];
        posiciones = 0;
    }

    public verObras() {
    }

    public void aumentarTamaño(obras valor) { 
        if (tamaño == vec.length) {
          obras[] newData = new obras[vec.length + 1];
          System.arraycopy(vec, 0, newData, 0, vec.length);
          vec = newData;
        }
        vec[tamaño++] = valor;
    }

    public boolean agregar (obras n) {
        aumentarTamaño(n);
        if(posiciones < tamaño) {
            vec[posiciones++] = n;
            return true;
        }
        return false;
    }

    public obras buscar(String id) {
        for (int i = 0; i < posiciones; i++) {
            if(vec[i].getID().equals(id)) {
                return vec[i];
            }
        }
        return null;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String toStrin() {
        String s = "";
        for (int i = 0; i < posiciones; i++) {
            s += vec[i].toString();
        }
        return s;
    }

    
}