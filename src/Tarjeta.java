public class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion;

    public Tarjeta(String tipo) {
        super();
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumTransaccion() {
        return this.numTransaccion;
    }

    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }

    public String toString() {
        return "Tarjeta " + this.tipo
                + " Transaccion: " + this.numTransaccion
                + " " +  super.toString();
    }
}
