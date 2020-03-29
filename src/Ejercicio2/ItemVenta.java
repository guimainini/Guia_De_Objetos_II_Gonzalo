package Ejercicio2;

public class ItemVenta {
    private int id;
    private String nombre;
    private String descripcion;
    private double precioUnitario;



    public ItemVenta(int id, String nombre, String descripcion, double precioUnitario) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }



    public String getNombre() {
        return nombre;
    }


    public double getPrecioUnitario() {
        return precioUnitario;
    }

    @Override
    public String toString() {
        return "ItemVenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precioUnitario=" + precioUnitario +
                '}';
    }



}
