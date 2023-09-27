import java.util.Date;

public abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;
    private OrdenCompra compra;

    public DocTributario() {
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Direccion getDireccion() {
        return this.direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public OrdenCompra getCompra() {
        return this.compra;
    }

    public void setCompra(OrdenCompra compra) {
        this.compra = compra;
    }

    public String toString() {
        return this.numero
                + " Rut: " + this.rut
                + " Fecha: " + this.fecha.toString();
    }
}
