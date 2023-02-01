package practicacom.practica.programacion.clasesMuseo;
import java.util.Scanner;

public class abrirMenu{
    private int opcionMenu;
    //protected verObras objeto[] = new verObras[5];

    final private String OPCIONES = "¿Qué quieres hacer?";
    final private String OPCION_1 = "1. Ver cuadros";
    final private String OPCION_2 = "2. Dar de alta";
    final private String OPCION_3 = "3. Modificar los datos de una de las obras";
    final private String OPCION_4 = "4. Visualizar los datos de una de las obras de arte expuestas";
    final private String OPCION_5 = "5. Obtener el precio de venta de una de las obras de arte expuestas";
    final private String OPCION_6 = "6. Imprimir una etiqueta para clasificar una de las obras expuestas y dar información adicional";
    final private String SALIR = "7. Salir";
    
    boolean interruptor = false;

    Scanner sc = new Scanner(System.in);

    public abrirMenu(int opcionMenu, boolean interruptor) {
        this.opcionMenu = opcionMenu;
        this.interruptor = interruptor;
    }

    public void Cabecera() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }

    public void insertarMenu() {

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
            opcionMenu = sc.nextInt();

        switch (opcionMenu){
            case 1: {
                verObras ob = new verObras();
                ob.verLasObras();
            }  
            /*
            case 2: {
                darDeAltaUnaObraDeArte dar = new darDeAltaUnaObraDeArte();
                //darDeAltaUnaObraDeArte objeto2[]=new darDeAltaUnaObraDeArte[6];
                //for(int i = 0; i < objeto.length; i++) {
                //    objeto2[i] = objeto[i];
                //}
                // objeto[5] = dar.darDeAlta();
                // break;
            } 
            case 3: {
                modificarObra mod = new modificarObra(null, null, null, null, n, n, n, null, null, n, null);
                System.out.println("¿Qué obra quieres modificar?");
                int z = sc.nextInt();
                System.out.println(objeto[z-1]);
                mod.modificarID(null);
                objeto[z-1].setID(ID);
                System.out.print("Tipo:");
                String Tipo = AA.nextLine();
                objeto[z-1].setTipo(Tipo);
                System.out.print("Nombre:");
                String Nombre = AA.nextLine();
                objeto[z-1].setNombre(Nombre);
                System.out.print("Autor:");
                String Autor = AA.nextLine();
                objeto[z-1].setAutor(Autor);
                System.out.print("Precio:");
                double Precio = AA.nextDouble();
                objeto[z-1].setPrecio(Precio);
                System.out.print("Altura:");
                double Altura = AA.nextDouble();
                objeto[z-1].setAltura(Altura);
                System.out.print("Peso:");
                double Peso = AA.nextDouble();
                objeto[z-1].setPeso(Peso);
                System.out.print("Material:");
                String Material = AA.nextLine();
                objeto[z-1].setMaterial(Material);
                System.out.print("Técnica:");
                String Técnica = AA.nextLine();
                objeto[z-1].setTecnica(Técnica);
                System.out.print("Piezas:");
                int Piezas = AA.nextInt();
                objeto[z-1].setPiezas(Piezas);
                System.out.print("Material:");
                String Descripcion = AA.nextLine();
                objeto[z-1].setDescripción(Descripcion);
                break;
            } 
            case 4: {

            }
            case 5: {

            }
            case 6: {

            }  
            case 7: {
                System.out.println("Adios");
                interruptor = true;
            }
*/
        } 
        
    }
    //sc.close();

        }
    }

