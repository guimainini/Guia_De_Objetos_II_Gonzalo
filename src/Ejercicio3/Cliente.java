package Ejercicio3;

public class Cliente {
    private int id;
    private String nombre;
    private char genero;

    public Cliente(int id, String nombre, char genero) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }





}
