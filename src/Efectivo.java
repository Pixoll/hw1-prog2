import java.util.Date;

public class Efectivo extends Pago {
    public Efectivo(float monto, Date fecha) {
        super(monto, fecha);
    }

    public void calcDevolucion() {
    }

    public String toString() {
        return "Efectivo " + super.toString();
    }
}
