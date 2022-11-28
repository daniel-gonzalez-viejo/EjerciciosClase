package ClasesGeom;

public class Linea {
    //atr linea
    private double inicio = 0.0;
    private double fin = 1.0;
    //const linea
    public Linea(){}
    
    public Linea(double inicio, double fin){
        this.inicio = inicio;
        this.fin = fin;
    }
    ////metodos///
    // getters & setters

        public double getInicio() {
            return this.inicio;
        }

        public void setInicio(double inicio) {
            this.inicio = inicio;
        }

        public double getFin() {
            return this.fin;
        }

        public void setFin(double fin) {
            this.fin = fin;
        }
        
        //to string
        @Override
        public String toString(){
            return "Linea: [ punto inicio: " + this.inicio + " punto final : " 
                    + this.fin;
        }
        
        public double longitud(){
            return Math.abs(this.inicio - this.fin);
        }
    
    } //Linea