package Ejercicio1;

import java.util.ArrayList;

public class Principal1 {
    public static void main(String[] args) {
        ArrayList<Autor> prueba = new ArrayList<Autor>();  //arreglo auxiliar

        //Ejercicio 1
        System.out.println("Ejercicio 1");
        //Inciso a
        Autor josh;
        josh = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        //Inciso b
        System.out.println(josh.toString());
        //Inciso c
        Libro libro1;
        libro1 = new Libro("Effective Java", 450, 150, josh);
        //Inciso d
        System.out.println(libro1.toString());
        //Inciso e
        libro1.setPrecio(500);
        libro1.setStock(libro1.getStock() + 50);
        //Inciso f
        System.out.println(libro1.getAutor1().toString());
        //Inciso g
        System.out.println(libro1.mostrar());
        //Inciso h

        Autor renzo = new Autor("Facu", "Loscos", "facu@mail", 'M');  //carga auxiliar
        Autor pedro = new Autor("Guille", "Mainini", "guille@mail", 'M');  //carga auxiliar
        prueba.add(josh);  //los agrego al arreglo
        prueba.add(renzo);  //los agrego al arreglo
        prueba.add(pedro);  //los agrego al arreglo
        libro1.setListaAutores(prueba);
        libro1.mostrarMagia();


    }
}