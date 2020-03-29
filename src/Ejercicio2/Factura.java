package Ejercicio2;

import java.time.LocalDate;
import java.util.UUID;

public class Factura {
    private UUID idePrimero = UUID.randomUUID();
    private double montoTotal;
    private LocalDate diaActual = LocalDate.now();
    private Cliente cliente;
    //Inciso e
    private ItemVenta productos;


    //constructor
    public Factura(double montoTotal, Cliente cliente) {
        this.montoTotal = montoTotal;
        this.cliente = cliente;
    }


    public UUID getIdePrimero() {
        return idePrimero;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public LocalDate getDiaActual() {
        return diaActual;
    }



    @Override
    public String toString() {
        return "Factura{" +
                "idePrimero=" + idePrimero +
                ", montoTotal=" + montoTotal +
                ", diaActual=" + diaActual +
                ", cliente=" + cliente +'}';
    }

    public double montoFinal (){
        montoTotal -= ((montoTotal * cliente.getPorcentajeDescuento())/100);
        return montoTotal;
    }









}
