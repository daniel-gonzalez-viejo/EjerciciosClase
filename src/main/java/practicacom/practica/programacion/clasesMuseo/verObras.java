package practicacom.practica.programacion.clasesMuseo;

public class verObras extends obras{
    
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

    public boolean agregar (obras n) {
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

    public String toStrin() {
        String s = "";
        for (int i = 0; i < posiciones; i++) {
            s += vec[i].toString();
        }
        return s;
    }

    
}