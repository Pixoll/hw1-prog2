import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;
    private ArrayList<OrdenCompra> compras;

    public Cliente() {
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return this.direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String toString() {
        return "Cliente " + this.nombre
                + " Rut: " + this.rut;
    }
}
