package practicacom.practica.programacion.clasesMuseo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class abrirMenu extends verObras{
    public static void main(String[] args) {

    final String OPCIONES = CYAN + "¿Qué quieres hacer?" + BLANCO;
    final String OPCION_1 = VERDE + "[1]" + BLANCO + " Ver cuadros";
    final String OPCION_2 = VERDE + "[2]" + BLANCO + " Dar de alta";
    final String OPCION_3 = VERDE + "[3]" + BLANCO + " Modificar los datos de una de las obras";
    final String OPCION_4 = VERDE + "[4]" + BLANCO + " Visualizar los datos de una de las obras de arte expuestas";
    final String OPCION_5 = VERDE + "[5]" + BLANCO + " Obtener el precio de venta de una de las obras de arte expuestas";
    final String OPCION_6 = VERDE + "[6]" + BLANCO + " Imprimir una etiqueta para clasificar una de las obras expuestas y dar información adicional";
    final String SALIR = ROJO + "[7]" + BLANCO + " Salir";
    final String MENSAJE_DESPEDIDA = "Corre plátano";
    final String ESPACIO_DIFERENCIADOR = "-------------------------------------------------------------------------------------------------";
    final String[] OPCIONES_MENU = {OPCIONES, ESPACIO_DIFERENCIADOR,  OPCION_1, OPCION_2, OPCION_3, OPCION_4, OPCION_5, OPCION_6, SALIR};
    final String ERROR_MENU = "Se ha producido un error en la inserción de comando";

    Scanner sc = new Scanner(System.in);

    int tamaño_predeterminado = 5;
    boolean interruptor = false;

    obras P1 = new obras("001" , "Pintura", "Guernica", "P.Picasso" , 1000 , 5 , 2 , "    " ,   "Óleo" , 5 , "Cuadro de la guerra civil");
    obras P2 = new obras("002" , "Pintura", "La Vie" , "P.Picasso" , 200 , 5 , 1 , "    " , "Óleo" , 5 , "Óleo");
    obras P3 = new obras("003" , "Pintura", "El Sueño" , "P.Picasso" , 300 , 5 , 1.3 , "    " ,   "Óleo" , 5 , "Óleo");
    obras P4 = new obras("004" , "Pintura", "Retrato.D Maar" , "P.Picasso" , 400 , 5 , 1 , "    " , "Óleo" , 5 , "Óleo");
    obras P5 = new obras("005" , "Escultura", "El piel roja" , "U.Chueca" , 350 , 5 , 1 , "acero" , "    " ,  5 , "Escultura");
    
    final obras[] OBRAS_INICIALES = {P1, P2, P3, P4, P5};

    verObras galería = new verObras(tamaño_predeterminado);

    for (int i = 0; i < tamaño_predeterminado; i++) {
        galería.agregar(OBRAS_INICIALES[i]);
    }
    
    while (!interruptor) {

        int opcion_menu = 0;

        System.out.println(ESPACIO_DIFERENCIADOR);
        for (final String OPCION_MENU : OPCIONES_MENU) {
            System.out.println(OPCION_MENU);
        }
        System.out.println(ESPACIO_DIFERENCIADOR);

        try { 
            opcion_menu = sc.nextInt();
            System.out.println(ESPACIO_DIFERENCIADOR);
        }
        catch (InputMismatchException ime) {
            System.out.println(ERROR_MENU);
            sc.nextInt();
            continue;
        }
        
      
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
                System.out.println(MENSAJE_DESPEDIDA);
                System.out.println("https://www.youtube.com/watch?v=4pNMdJPGooE");
                interruptor = true;
                break;
            }
            default: {
                System.out.println(ERROR_MENU);
            }
        } 
        
    }
    }

}
