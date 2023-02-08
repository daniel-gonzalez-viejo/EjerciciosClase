package practicacom.practica.programacion.clasesMuseo;
import java.util.Scanner;

public class abrirMenu extends verObras{
    public static void main(String[] args) {

    int tamaño_predeterminado = 5;
    int opcion_menu;
    boolean interruptor = false;

    final String OPCIONES = "¿Qué quieres hacer?";
    final String OPCION_1 = "1. Ver cuadros";
    final String OPCION_2 = "2. Dar de alta";
    final String OPCION_3 = "3. Modificar los datos de una de las obras";
    final String OPCION_4 = "4. Visualizar los datos de una de las obras de arte expuestas";
    final String OPCION_5 = "5. Obtener el precio de venta de una de las obras de arte expuestas";
    final String OPCION_6 = "6. Imprimir una etiqueta para clasificar una de las obras expuestas y dar información adicional";
    final String SALIR = "7. Salir";

    Scanner sc = new Scanner(System.in);

    obras P1 = new obras("001" , "Pintura", "Guernica", "P.Picasso" , 1000 , 5 , 2 ,   "null" ,   "Óleo" , 5 , "Cuadro de la guerra civil");
    obras P2 = new obras("002" , "Pintura", "La Vie" , "P.Picasso" , 200 , 5 , 1 , "null" , "Óleo" , 5 , "Óleo");
    obras P3 = new obras("003" , "Pintura", "El Sueño" , "P.Picasso" , 300 , 5 , 1.3 , "null" ,   "Óleo" , 5 , "Óleo");
    obras P4 = new obras("004" , "Pintura", "Retrato.D Maar" , "P.Picasso" , 400 , 5 , 1 , "null" , "Óleo" , 5 , "Óleo");
    obras P5 = new obras("005" , "Escultura", "El piel roja" , "U.Chueca" , 350 , 5 , 1 ,  "acero" , "null" ,  5 , "Escultura");
    
    verObras galería = new verObras(tamaño_predeterminado);

    galería.agregar(P1);
    galería.agregar(P2);
    galería.agregar(P3);
    galería.agregar(P4);
    galería.agregar(P5);
    
        while (!interruptor) {
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println(OPCIONES);
            System.out.println(OPCION_1);
            System.out.println(OPCION_2);
            System.out.println(OPCION_3);
            System.out.println(OPCION_4);
            System.out.println(OPCION_5);
            System.out.println(OPCION_6);
            System.out.println(SALIR);
            System.out.println("-------------------------------------------------------------------------------------------------------");
            opcion_menu = sc.nextInt();
            
        switch (opcion_menu){
            case 1: {
                System.out.println(P1.Cabeceros());
                System.out.println(galería.toStrin());
                break;
            }  
            case 2: {
                darDeAltaUnaObraDeArte dar = new darDeAltaUnaObraDeArte();
                galería.agregar(dar.nuevaObra());
                break;
            } 
            case 3: {
                modificarObra mod = new modificarObra();
                mod.pedirObra();
                obras aux = galería.buscar(mod.getCódigo());
                mod.modificar(aux);
                break;
            } 
            case 4: {
                visualizarDatos vis = new visualizarDatos();
                vis.pedirObra();
                obras aux = galería.buscar(vis.getCódigo());
                vis.mostrarDatos(aux);
                break;
            }
            case 5: {
                obtenerPrecioDeVenta obt = new obtenerPrecioDeVenta();
                obt.pedirObra();
                obras aux = galería.buscar(obt.getCódigo());
                obt.obtenerPrecio(aux);
                break;
            }
            case 6: {
                imprimirEtiqueta imp = new imprimirEtiqueta();
                imp.pedirObra();
                obras aux = galería.buscar(imp.getCódigo());
                imp.imprimirUnaEtiqueta(aux);
                break;
            }  
            case 7: {
                System.out.println("Adios");
                interruptor = true;
                break;
            }
        } 
        
    }
    }

}
