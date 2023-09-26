import java.util.Date;

public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;

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

    public String toString() {
        return this.numero
                + " Rut: " + this.rut
                + " Fecha: " + this.fecha.toString();
    }
}
