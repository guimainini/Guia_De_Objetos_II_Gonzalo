package Ejercicio2;

import java.util.UUID;

public class Cliente {
    private UUID id = UUID.randomUUID();
    private String nombre;
    private String email;
    private double porcentajeDescuento;

    public Cliente(String nombre, String email, double porcentajeDescuento) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", porcentajeDescuento=" + porcentajeDescuento +
                '}';
    }
}
