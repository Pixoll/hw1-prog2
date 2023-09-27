import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<Pago> pagos;
    private ArrayList<DetalleOrden> ordenes;

    public OrdenCompra() {
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void calcPrecioSinIVA() {
    }

    public void calcIVA() {
    }

    public void calcPrecio() {
    }

    public void calcPeso() {
    }

    public String toString() {
        return "OrdenCompra " + this.fecha
                + " Estado: " + this.estado;
    }
}
