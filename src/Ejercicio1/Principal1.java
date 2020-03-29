package Ejercicio1;

public class Principal1 {
    public static void main(String[] args) {
        Autor autorin[] = new Autor[5];

        //Inciso a
        autorin[0] = new Autor("Joshua","Bloch","joshua@email.com",'M');
        //Autor autorin = new Autor("Joshua","Bloch","joshua@email.com",'M');

        //Inciso b
        System.out.println(autorin.toString());

        //Inciso c
        Libro librin = new Libro("Effective Java",450,150,autorin[0]);

        //Inciso d
        System.out.println(librin.toString());

        //Inciso e
        librin.setPrecio(500);
        librin.setStock(librin.getStock()+50);
        System.out.println(librin.toString());

        //Inciso f
        System.out.println(librin.getAutor().toString());

        //InCiso g
        librin.mensaje();

        //Inciso h
        autorin[1] = new Autor("Guillermo","Mainini", "guimainini@gmail.com",'M');

        /*for(int i = 0; i < 2; i++){
            System.out.println(autorin[i]);
        }*/

        //
        librin.mensaje(autorin[1]);


        //Probando la chanchada
        autorin[2] = new Autor("Facu","Loscos","floscos@hotmail.com",'M');

        librin.mensaje(autorin[1],autorin[2]);



    }


}
