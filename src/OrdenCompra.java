import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private Cliente cliente;
    private DocTributario documento;
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

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DocTributario getDocumento() {
        return this.documento;
    }

    public void setDocumento(DocTributario documento) {
        this.documento = documento;
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
