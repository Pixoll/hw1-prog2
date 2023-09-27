public class Tranferencia extends Pago {
    private String banco;
    private String numCuenta;

    public Tranferencia() {
        super();
    }


    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumCuenta() {
        return this.numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String toString() {
        return "Transferencia "
                + " Banco: " + this.banco
                + " #Cuenta: " + this.numCuenta
                + " " + super.toString();
    }
}
