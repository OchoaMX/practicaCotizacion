/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclases;

//Importar Clases
import java.util.Scanner;   //Escanea datos de entrada por cmd (Genera el objeto)

/**
 *
 * @author _Windows_
 */
public class TextCotizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Terreno terreno = new Terreno();
        terreno.setAncho(35.5f);
        terreno.setLargo(100.0f);
        terreno.imprimirTerreno();
        
        Terreno ter = new Terreno(10.0f,90.0f);
        ter.imprimirTerreno();
        
        
        Terreno ter2 = new Terreno(terreno);
        ter2.imprimirTerreno();  */

        Cotizacion cotizacion = new Cotizacion();
        Scanner sc = new Scanner(System.in);
        int opcion = 0, numCotizacion = 0, plazo = 0;
        String descripcion = "";
        float precio = 0.0f, porPagoInicial = 0.0f;

        do {
            //Pintar el menu
            System.out.println("1-Iniciar el Objeto");
            System.out.println("2-Cambiar numCotizacion");
            System.out.println("3-Cambiar Descripcion");
            System.out.println("4-Cambiar Precio");
            System.out.println("5-Cambiar Porcentaje de Pago Incial");
            System.out.println("6-Cambiar Plazo");
            System.out.println("7-Mostrar ");
            System.out.println("8-Salir");
            System.out.println("Dame la opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Teclea el numero de Cotizacion");
                    numCotizacion = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Teclea la descripcion");
                    descripcion = sc.nextLine();
                    System.out.println("Teclea la precio");
                    precio = sc.nextFloat();
                    System.out.println("Teclea el procentaje de pago inicial");
                    porPagoInicial = sc.nextFloat();
                    System.out.println("Teclea el plazo");
                    plazo = sc.nextInt();

                    cotizacion.setDescripcion(descripcion);
                    cotizacion.setNumCotizacion(numCotizacion);
                    cotizacion.setPlazos(plazo);
                    cotizacion.setPrecio(precio);
                    cotizacion.setPorPagoInicial(porPagoInicial);

                    break;
                case 2:
                    System.out.println("Teclea el numero de Cotizacion");
                    numCotizacion = sc.nextInt();
                    cotizacion.setNumCotizacion(numCotizacion);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Teclea la nueva descripción");
                    descripcion = sc.nextLine();
                    cotizacion.setDescripcion(descripcion);
                    break;
                case 4:
                    System.out.println("Teclea el nuevo precio");
                    precio = sc.nextFloat();
                    cotizacion.setPrecio(precio);
                    break;
                case 5:
                    System.out.println("Teclea el nuevo porcentaje de pago inicial");
                    porPagoInicial = sc.nextFloat();
                    cotizacion.setPorPagoInicial(porPagoInicial);
                    break;
                    
               case 6:
                    System.out.println("Teclea el nuevo plazo");
                    plazo = sc.nextInt();
                    cotizacion.setPlazos(plazo);
                    break;
                case 7:
                    cotizacion.imprimirCotizacion();
                    break;
                case 8:
                    System.out.println("Hasta la vista baby...!!");

                default:
                    System.out.println("No es una opcion valida...!!!");
            }

        } while (opcion != 8);

    }

}
