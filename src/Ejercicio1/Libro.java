package Ejercicio1;

public class Libro {
    private String titulo;
    private int precio;
    private int stock;
    private Autor autor;

    public Libro(String titulo, int precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                " " + autor +
                '}';
    }
    public void mensaje(){
        System.out.println("El Libro "+this.getTitulo()+" de "+getAutor().getNombre()+". Se vende a "+getPrecio()+" pesos");
    }



    public void mensaje(Autor aut){
        System.out.println("El Libro "+this.getTitulo()+" de "+getAutor().getNombre()+" y "+aut.getNombre()+". Se vende a "+getPrecio()+" pesos");
    }

    public void mensaje(Autor aut,Autor aut2){
        System.out.println("El Libro "+this.getTitulo()+" de "+getAutor().getNombre()+" , "+aut.getNombre()+" y "+aut2.getNombre()+". Se vende a "+getPrecio()+" pesos");
    }

}
