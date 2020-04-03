package Ejercicio1;

import java.util.ArrayList;

public class Libro {
    //Atributos
    private String titulo;
    private float precio;
    private int stock;
    private Autor autor1;
    private ArrayList<Autor> listaAutores = new ArrayList<Autor>();

    //Metodos
    public Libro (String titulo, float precio, int stock, Autor autor1){
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor1 = autor1;
        this.listaAutores = listaAutores;
    }

    @Override
    public String toString() {
        int i = listaAutores.size();
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor1 +
                '}';
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock(){
        return stock;
    }

    public void setListaAutores(ArrayList<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    public String mostrar(){
        return "El libro, "+titulo+" de "+ autor1.getNombre()+". Se vende a "+precio+" pesos";
    }

    public void mostrarArray(){  //auxiliar que muestra el arreglo dinamico de Autores
        for (int i=0; i<listaAutores.size(); i++){
            System.out.println(listaAutores.get(i));
        }
    }

    public Autor getAutor1() {
        return autor1;
    }

    public void mostrarNombreArray(){  //auxiliar que muestra los nombres del arreglo dinamico
        for (int i=0; i<listaAutores.size(); i++){
            System.out.println(listaAutores.get(i).getNombre());
        }
    }

    public String fusionar(){  //auxiliar que junta los nombres de los Autores
        String fusion = new String();
        for (int i=0; i<listaAutores.size(); i++){
            fusion += " "+listaAutores.get(i).getNombre();
        }
        return fusion;
    }

    public void mostrarMagia(){  //el nuevo mostrar, asi no borraba el anterior
        //int i = listaAutores.size();
        System.out.println("El libro, "+titulo+" de"+fusionar()+". Se vende a "+precio+" pesos");
    }
}
