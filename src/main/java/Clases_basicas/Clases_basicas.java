package Clases_basicas;
import ClasesGeom.Cilindro;
import ClasesGeom.Circulo;
import ClasesGeom.Linea;

public class Clases_basicas {
    public static void main(String[] args) {
        
      /*  Circulo c = new Circulo();
        
        System.out.println("radio de c: " + c.getRadio());
        System.out.println("area de c: " + c.area());
        System.out.println("circunferencia de c: " + c.long_circunferencia());
        
        c.setRadio(3.4);
        
        System.out.println("radio de c: " + c.getRadio());
        System.out.println("area de c: " + c.area());
        System.out.println("circunferencia de c: " + c.long_circunferencia());
        
        System.out.println(c.toString());
        System.out.println(c);
   */ 
        Cilindro c = new Cilindro();
        
        System.out.println("El Area del cilindro es: " + (c.getRadio()*c.getLongitud()));
    } //main
} // All
