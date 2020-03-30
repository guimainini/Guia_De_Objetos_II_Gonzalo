package Ejercicio3;
public class Cuenta {
    private int identificador;
    private double balance;
    private Cliente cliente;

    public Cuenta(int identificador, double balance, Cliente cliente) {
        this.identificador = identificador;
        this.balance = balance;
        this.cliente = cliente;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "identificador=" + identificador +
                ", balance=" + balance +
                ", cliente=" + cliente +
                '}';
    }

    public void depositar(double depo){
        this.balance += depo;
    }
    public void extraer(double extraer){

        if( (balance - extraer) >= - 2000 ){
            balance -= extraer;
        }else{
            System.out.println("No se puede retirar mas de esa plata");
        }




    }



}
