import java.util.Date;

public abstract class Pago {
    private float monto;
    private Date fecha;

    public Pago() {
    }

    public float getMonto() {
        return this.monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String toString() {
        return "Monto: " + this.monto
                + " Fecha: " + this.fecha.toString();
    }
}
