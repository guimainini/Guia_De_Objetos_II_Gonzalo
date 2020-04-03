package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal2 {
    static ArrayList<ItemVenta> arregloDeProductos = new ArrayList<ItemVenta>();
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        int opcion,id;
        String nombre,descripcion;
        double precioUnitario, total = 0;

        // la inicio con null, por si no entra al switch
        ItemVenta productoIndividual = null;

        /*UUID idePrimero = UUID.randomUUID();
        System.out.println(idePrimero);*/
       /* LocalDate ahora = LocalDate.now();
        System.out.println(ahora);*/

       //Inciso b

        Cliente clienteUno = new Cliente("Guillermo","guimainini@gmail.com",20);

        Factura facturaPrimera = new Factura(50000,clienteUno);

        //Inciso c
        System.out.println(facturaPrimera.toString());
        System.out.println("El Monto es "+facturaPrimera.getMontoTotal()+" se la aplica un descuento de %"+clienteUno.getPorcentajeDescuento()+" siendo un TOTAL de -> "+facturaPrimera.montoFinal());

        //Inciso d
        System.out.println("Factura = "+facturaPrimera.getIdePrimero()+" Fecha = "+facturaPrimera.getDiaActual()+" Monton = "+facturaPrimera.getMontoTotal()+" " +
                "Monto con Descuento = "+facturaPrimera.montoFinal()+" Cliente -> "+clienteUno.getId()+" Nombre -> "+clienteUno.getNombre()+" " +
                "MAIL -> "+clienteUno.getEmail()+" Descuento %"+clienteUno.getPorcentajeDescuento());


        //Inciso e

        do{
            System.out.println("1. Desea ingresar productos : ");
            System.out.println("2. Salir : ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el id : ");
                    id = in.nextInt();
                    in.nextLine();
                    System.out.print("Ingrese el nombre : ");
                    nombre = in.nextLine();
                    System.out.print("Ingrese la descripcion : ");
                    descripcion = in.nextLine();
                    System.out.print("Ingrese el precio unitario : ");
                    precioUnitario = in.nextDouble();

                    //esto lo hice al principio pero como esta dentro de un "if" puede q no entre nunca e INTELLIJ me tira error

                    productoIndividual = new ItemVenta(id,nombre,descripcion,precioUnitario);

                    //asi no funcionaba
                   /*productoIndividual.setId(id);
                    productoIndividual.setNombre(nombre);
                    productoIndividual.setDescripcion(descripcion);
                    productoIndividual.setPrecioUnitario(precioUnitario);*/

                    arregloDeProductos.add(productoIndividual);

                    //devuelvo el numero de arreglos q llene
                    System.out.println("En el arreglo hay : "+arregloDeProductos.size()+" Productos cargados ");

                    //nuestro todo el arreglo
                    System.out.println(arregloDeProductos);




                    break;
                case 2 :
                    System.out.println(".:Saliendo:.");
                    break;
                default:
                    System.out.println("Ingresaste mal el numero PAPU");
            }
        }while(opcion !=2 );


        /* recorro todo el arreglo dinamico para sumar la totalidad de los precios unitarios */
        sumaSinDescuente();



        Cliente cliente2 = new Cliente("Facu","floscos@hotmail.com",15);


        Factura factu = new Factura(total ,cliente2);
        mostrarMagia();




        System.out.println(factu.toString());

        System.out.println("El monto a pagar Sin descuento es : "+sumaSinDescuente());
        System.out.print("El monto a pagar Con Descuento es : "+(sumaSinDescuente()-(sumaSinDescuente()*15)/100));


    }

    static public String fusionar(){  //auxiliar que junta los nombres de los Autores
        String fusion = new String();
        for (int i=0; i<arregloDeProductos.size(); i++){
            fusion += " "+arregloDeProductos.get(i).getNombre();
        }
        return fusion;
    }

    static public void mostrarMagia(){  //el nuevo mostrar, asi no borraba el anterior
        System.out.println("Los productos son : "+fusionar());
    }

    static public double sumaSinDescuente(){
        double monto = 0;
        for(int i=0; i<arregloDeProductos.size();i++) {
            monto += arregloDeProductos.get(i).getPrecioUnitario();
        }
        //System.out.println("La suma total a pagar es Sin Descuento: "+monto);
        return monto;
    }



}
