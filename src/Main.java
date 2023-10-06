import java.util.Date;

public class Main {
    static final String ESTADO_COMPRANDO = "Comprando";
    static final String ESTADO_PAGANDO = "Pagando";
    static final String ESTADO_PAGADO = "Pagado";

    public static void main(String[] args) {
        final Direccion direccionF = new Direccion("Calle abc #456");
        final Direccion direccionE = new Direccion("Calle xyz #987");
        final Direccion direccionMB = new Direccion("Calle dolar #666");

        final Cliente felipe = new Cliente("Felipe", "21.502.400-8", direccionF);
        final Cliente enzo = new Cliente("Enzo", "20.618.797-2", direccionE);
        final Cliente mrBeast = new Cliente("Mr. Beast", "13.752.798-K", direccionMB);
        Main.printClientes(felipe, enzo, mrBeast);

        final Articulo naranja = new Articulo("Naranja", "Citrico dulce 🍊", 1500, 1.5f);
        final Articulo manzana = new Articulo("Manzana", "Fruta roja dulce 🍎", 2200, 1.2f);
        final Articulo platano = new Articulo("Platano", "Fruta tropical amarilla dulce 🍌", 1250, 1);
        final Articulo tomate = new Articulo("Tomate", "Fruta usada en ensaladas 🍅", 2000, 2.2f);
        final Articulo palta = new Articulo("Palta", "Fruta con un cremoso interior verde 🥑", 5000, 1.3f);
        Main.printArticulos(naranja, manzana, platano, tomate, palta);

        final OrdenCompra compraF = new OrdenCompra(new Date(), Main.ESTADO_COMPRANDO, felipe);
        // Llenando el carrito
        compraF.addDetalleOrden(manzana, 3); // 6600
        compraF.addDetalleOrden(naranja, 2); // 3000
        compraF.addDetalleOrden(platano, 4); // 5000
        compraF.addDetalleOrden(tomate, 1); // 2000
        compraF.addDetalleOrden(palta, 2); // 10000
        Main.printCompra(compraF);

        // Pagando
        compraF.setEstado(Main.ESTADO_PAGANDO);
        final Efectivo pagoEfectivoF = new Efectivo(30000, new Date(), compraF);
        compraF.addPago(pagoEfectivoF);
        Main.printCompra(compraF);

        // Terminando compra
        final float vuelto = pagoEfectivoF.calcDevolucion();
        final Boleta boletaF = new Boleta("3754198", felipe.getRut(), new Date(), direccionF, compraF);
        compraF.setDocumento(boletaF);
        compraF.setEstado(Main.ESTADO_PAGADO);
        Main.printCompra(compraF);

        final OrdenCompra compraE = new OrdenCompra(new Date(), Main.ESTADO_COMPRANDO, enzo);
        // Llenando el carrito
        compraE.addDetalleOrden(manzana, 1); // 2200
        compraE.addDetalleOrden(naranja, 3); // 4500
        compraE.addDetalleOrden(platano, 4); // 5000
        compraE.addDetalleOrden(tomate, 1); // 2000
        compraE.addDetalleOrden(palta, 5); // 25000
        Main.printCompra(compraE);

        // Pagando
        compraE.setEstado(Main.ESTADO_PAGANDO);
        final float precioCompraE = compraE.calcPrecio();
        final Tarjeta pagoTarjetaE = new Tarjeta(precioCompraE, new Date(), "Debito", "651249512749512", compraE);
        compraE.addPago(pagoTarjetaE);
        Main.printCompra(compraE);

        // Terminando compra
        final Boleta boletaE = new Boleta("847596", enzo.getRut(), new Date(), direccionE, compraE);
        compraE.setDocumento(boletaE);
        compraE.setEstado(Main.ESTADO_PAGADO);
        Main.printCompra(compraE);

        final OrdenCompra compraMB = new OrdenCompra(new Date(), Main.ESTADO_COMPRANDO, mrBeast);
        // Llenando el carrito
        compraMB.addDetalleOrden(manzana, 1000);
        compraMB.addDetalleOrden(naranja, 2000);
        compraMB.addDetalleOrden(platano, 3000);
        compraMB.addDetalleOrden(tomate, 4000);
        compraMB.addDetalleOrden(palta, 5000);
        Main.printCompra(compraMB);

        // Pagando
        compraMB.setEstado(Main.ESTADO_PAGANDO);
        final float precioCompraMB = compraMB.calcPrecio();
        final Transferencia transferencia1MB = new Transferencia(precioCompraMB / 2, new Date(), "US Bank", "999888777666", compraMB);
        final Transferencia transferencia2MB = new Transferencia(precioCompraMB / 2, new Date(), "US Bank", "999888777666", compraMB);
        compraMB.addPago(transferencia1MB);
        compraMB.addPago(transferencia2MB);
        Main.printCompra(compraMB);

        // Terminando compra
        final Factura facturaMB = new Factura("847596", mrBeast.getRut(), new Date(), direccionMB, compraMB);
        compraMB.setDocumento(facturaMB);
        compraMB.setEstado(Main.ESTADO_PAGADO);
        Main.printCompra(compraMB);
    }

    static public void printClientes(Cliente... clientes) {
        System.out.println("Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        System.out.println();
    }

    static public void printArticulos(Articulo... articulos) {
        System.out.println("Articulos disponibles:");
        for (Articulo articulo : articulos) {
            System.out.println(articulo);
        }
        System.out.println();
    }

    static public void printCompra(OrdenCompra compra) {
        final String estado = compra.getEstado();
        System.out.println(compra);

        if (estado.equals(Main.ESTADO_COMPRANDO)) {
            System.out.println("Carrito:");
            int i = 0;
            DetalleOrden orden;

            while (true) {
                orden = compra.getOrden(i++);
                if (orden == null) break;
                System.out.println("#" + i + ": " + orden);
            }

            System.out.println();
            return;
        }

        if (estado.equals(Main.ESTADO_PAGANDO)) {
            System.out.println("Pagos:");
            int i = 0;
            Pago pago;

            while (true) {
                pago = compra.getPago(i++);
                if (pago == null) break;
                System.out.println("#" + i + ": " + pago);
            }

            System.out.println();
            return;
        }

        if (estado.equals(Main.ESTADO_PAGADO)) {
            System.out.println(compra.getDocumento());
        }
    }
}
