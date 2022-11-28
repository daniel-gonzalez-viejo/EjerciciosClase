package ClasesGeom;

public class Circulo {
    
    //atr
    private double radio = 1.0;
    private String color = "rojo";
    
    //const
    public Circulo(){}
    
    public Circulo(double radio){
        this.radio = radio;
    }
    ////metodos///
    // getters & setters

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area(){
        return (Math.PI)*Math.pow((this.radio),2);
    }
    
    public double long_circunferencia(){
        return 2*(Math.PI)*(this.radio);
    }
    
    @Override
    public String toString(){
        return "Circulo radio " + this.radio + " color: " + this.color;
    }
} //Circulo
