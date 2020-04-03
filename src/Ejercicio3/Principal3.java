package Ejercicio3;

import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {
        String memoria[] = new String[10];
        boolean salir = true;
        Scanner in = new Scanner(System.in);
        int option,i=0;
        double depositar,extraer;
        //Inciso a
        Cliente clienteUno = new Cliente(1,"Guillermo",'M');
        System.out.println(clienteUno.toString());

        //Inciso b
        Cuenta cuentaUno = new Cuenta(1,10000,clienteUno);
        System.out.println(cuentaUno);

        //Inciso c
        while(salir){
            System.out.println("1.Depositar");
            System.out.println("2.Extraer");
            System.out.println("3.Salir");
            option = in.nextInt();

            switch (option){
                case 1:
                    System.out.print("Cuanta plata desea depositar : ");
                    depositar = in.nextDouble();
                    cuentaUno.depositar(depositar);
                    System.out.println("Su balance es : "+cuentaUno.getBalance());
                    memoria[i] = "Deposito: El "+clienteUno.getNombre()+" deposito "+depositar;
                    i++;
                    break;
                case 2:
                    System.out.println("Cuanta plata desea extraer : ");
                    extraer = in.nextDouble();
                    cuentaUno.extraer(extraer);
                    //Lo printe en la clase
                    //System.out.println("Su balance es : "+cuentin.getBalance());
                    memoria[i] = "Extraccion: El "+clienteUno.getNombre()+" retiro "+extraer;
                    i++;
                    break;
                case 3:
                    salir = false;
                    break;
                default:
                    System.out.println("Opcion invalida...");
            }


        }

    //Inciso d echo

    //Inciso e
        for (int j = 0; j < i; j++) {
            System.out.println(memoria[j]);
        }



    }



}
