package practicacom.practica.programacion.clasesMuseo;
import java.util.Scanner;
import java.util.Vector;

import practicacom.practica.programacion.clasesMuseo.obras;

public class abrirMenu {
    public static void main(String[] args) {
        
    int opcionMenu;

    final String OPCIONES = "¿Qué quieres hacer?";
    final String OPCION_1 = "1. Ver cuadros";
    final String OPCION_2 = "2. Dar de alta";
    final String OPCION_3 = "3. Modificar los datos de una de las obras";
    final String OPCION_4 = "4. Visualizar los datos de una de las obras de arte expuestas";
    final String OPCION_5 = "5. Obtener el precio de venta de una de las obras de arte expuestas";
    final String OPCION_6 = "6. Imprimir una etiqueta para clasificar una de las obras expuestas y dar información adicional";
    final String SALIR = "7. Salir";
    
    boolean interruptor = false;

    Scanner sc = new Scanner(System.in);

    obras P1 = new obras("001" , "Pintura", "Guernica", "P.Picasso" , 1000 , 5 , 2 ,   "null" ,   "Óleo" , 5 , "Cuadro de la guerra civil");
    obras P2 = new obras("002" , "Pintura", "La Vie" , "P.Picasso" , 200 , 5 , 1 , "null" , "Óleo" , 5 , "Óleo");
    obras P3 = new obras("003" , "Pintura", "El Sueño" , "P.Picasso" , 300 , 5 , 1.3 , "null" ,   "Óleo" , 5 , "Óleo");
    obras P4 = new obras("004" , "Pintura", "Retrato.D Maar" , "P.Picasso" , 400 , 5 , 1 , "null" , "Óleo" , 5 , "Óleo");
    obras P5 = new obras("005" , "Escultura", "El piel roja" , "U.Chueca" , 350 , 5 , 1 ,  "acero" , "null" ,  5 , "Escultura");
    
    verObras Pa = new verObras(10);
    Pa.agregar(P1);
    Pa.agregar(P2);
    Pa.agregar(P3);
    Pa.agregar(P4);
    Pa.agregar(P5);
    



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
                System.out.println(P1.Cabeceros());
                System.out.println(Pa.toStrin());
                break;
            }  
            
            case 2: {
                obras P6 = new obras("006" , "Pintura", "Guernica", "P.Picasso" , 1000 , 5 , 2 ,   "null" ,   "Óleo" , 5 , "Cuadro de la guerra civil");
                Pa.agregar(P6);
                //System.out.println(P1.toStrin());
             break;
            } /*
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

