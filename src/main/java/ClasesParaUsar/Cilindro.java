package ClasesParaUsar;

public class Cilindro {
    //atr
    private double inicio = 0.0;
    private double fin = 1.0;
    private double radio = 1.0;
    private double longitud = 0;
    //constr
    public Cilindro(){}
    public Cilindro(double inicio, double fin, double radio, double longitud){
        this.inicio = inicio;
        this.fin = fin;
        this.radio = radio;
        this.longitud = Math.abs(this.inicio - this.fin);
    }
    ////metodos///
    // getters & setters

    public double getRadio() {
        return this.radio;
    }

    public double getLongitud() {
        return this.longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    
    
    
    
}
