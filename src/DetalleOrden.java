public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    private OrdenCompra compra;
    public DetalleOrden() {
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Articulo getArticulo() {
        return this.articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public OrdenCompra getCompra() {
        return this.compra;
    }

    public void setCompra(OrdenCompra compra) {
        this.compra = compra;
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
