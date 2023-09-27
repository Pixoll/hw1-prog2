public class DetalleOrden {
    private int cantidad;

    public DetalleOrden() {
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void calcPrecio() {
    }

    public void calcPrecioSinIVA() {
    }

    public void calcIVA() {
    }

    public void calcPeso() {
    }

    public String toString() {
        return "DetalleOrden " + this.cantidad;
    }
}
