package practicacom.practica.programacion.clasesMuseo;

public class abrirMenu {
    private int inserción;
    private int aa;

    public abrirMenu(int inserción) {
        this.inserción = inserción;
    }

    public int insertarMenu(int inserción) {

        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Visualizar las obras de arte existentes en la galería. Permite conocer todas las obras que se exponen.");
        System.out.println("2. Dar de alta una nueva obra de arte");
        System.out.println("3. Modificar los datos de una de las obras de arte expuestas");
        System.out.println("4. Visualizar los datos de una de las obras de arte expuestas");
        System.out.println("5. Obtener el precio de venta de una de las obras de arte expuestas");
        System.out.println("6. Imprimir una etiqueta para clasificar una de las obras expuestas y dar información adicional a los visitantes de la galería");

       switch (inserción) {
          case 1: {
             
          }
          case 2: {
            darDeAltaUnaObraDeArte s = new darDeAltaUnaObraDeArte(inserción, null, null, null, inserción, inserción, inserción, null, null, inserción, null)
          }
          case 3: {

          }
          case 4: {

          }
          case 5: {

          }
          case 6: {

          }
          
       } 
       return inserción;
    }
    
}