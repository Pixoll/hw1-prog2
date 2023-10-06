import java.util.Date;

public class Main {
    public static void main(String[] args) {
        final Direccion direccionF = new Direccion("Calle abc #456");
        final Direccion direccionE = new Direccion("Calle xyz #987");
        final Direccion direccionMB = new Direccion("Calle dolar #666");

        final Cliente felipe = new Cliente("Felipe", "21.502.400-8", direccionF);
        final Cliente enzo = new Cliente("Enzo", "20.618.797-2", direccionE);
        final Cliente mrBeast = new Cliente("Mr. Beast", "13.752.798-K", direccionMB);

        final Articulo naranja = new Articulo("Naranja", "Citrico dulce 🍊", 1500, 1.5f);
        final Articulo manzana = new Articulo("Manzana", "Fruta roja dulce 🍎", 2200, 1.2f);
        final Articulo platano = new Articulo("Platano", "Fruta tropical amarilla dulce 🍌", 1250, 1);
        final Articulo tomate = new Articulo("Tomate", "Fruta usada en ensaladas 🍅", 2000, 2.2f);
        final Articulo palta = new Articulo("Palta", "Fruta con un cremoso interior verde 🥑", 5000, 1.3f);

        final OrdenCompra compraF = new OrdenCompra(new Date(), "comprando", felipe);
        // Llenando el carrito
        compraF.addDetalleOrden(manzana, 3); // 6600
        compraF.addDetalleOrden(naranja, 2); // 3000
        compraF.addDetalleOrden(platano, 4); // 5000
        compraF.addDetalleOrden(tomate, 1); // 2000
        compraF.addDetalleOrden(palta, 2); // 10000

        // Pagando
        compraF.setEstado("pagando");
        final Efectivo pagoEfectivoF = new Efectivo(30000, new Date(), compraF);
        compraF.addPago(pagoEfectivoF);

        // Terminando compra
        final float vuelto = pagoEfectivoF.calcDevolucion();
        final Boleta boletaF = new Boleta("3754198", felipe.getRut(), new Date(), direccionF, compraF);
        compraF.setDocumento(boletaF);
        compraF.setEstado("pagado");

        final OrdenCompra compraE = new OrdenCompra(new Date(), "comprando", enzo);
        // Llenando el carrito
        compraE.addDetalleOrden(manzana, 1); // 2200
        compraE.addDetalleOrden(naranja, 3); // 4500
        compraE.addDetalleOrden(platano, 4); // 5000
        compraE.addDetalleOrden(tomate, 1); // 2000
        compraE.addDetalleOrden(palta, 5); // 25000

        // Pagando
        compraE.setEstado("pagando");
        final float precioCompraE = compraE.calcPrecio();
        final Tarjeta pagoTarjetaE = new Tarjeta(precioCompraE, new Date(), "Debito", "651249512749512", compraE);
        compraE.addPago(pagoTarjetaE);

        // Terminando compra
        final Boleta boletaE = new Boleta("847596", enzo.getRut(), new Date(), direccionE, compraE);
        compraE.setDocumento(boletaE);
        compraE.setEstado("pagado");

        final OrdenCompra compraMB = new OrdenCompra(new Date(), "comprando", mrBeast);
        // Llenando el carrito
        compraF.addDetalleOrden(manzana, 1000);
        compraF.addDetalleOrden(naranja, 2000);
        compraF.addDetalleOrden(platano, 3000);
        compraF.addDetalleOrden(tomate, 4000);
        compraF.addDetalleOrden(palta, 5000);

        // Pagando
        compraMB.setEstado("pagando");
        final float precioCompraMB = compraMB.calcPrecio();
        final Transferencia transferencia1MB = new Transferencia(precioCompraMB / 2, new Date(), "US Bank", "999888777666", compraMB);
        final Transferencia transferencia2MB = new Transferencia(precioCompraMB / 2, new Date(), "US Bank", "999888777666", compraMB);
        compraE.addPago(transferencia1MB);
        compraE.addPago(transferencia2MB);

        // Terminando compra
        final Factura facturaMB = new Factura("847596", mrBeast.getRut(), new Date(), direccionMB, compraMB);
        compraMB.setDocumento(facturaMB);
        compraMB.setEstado("pagado");
    }
}
