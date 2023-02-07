package practicacom.practica.programacion.clasesMuseo;

//import com.tiernoparla.obras;
public class verObras {
    
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

    public String toStrin() {
        String s = "";
        for (int i = 0; i < posiciones; i++) {
            s += vec[i].toString();
        }
        return s;
    }

    
}