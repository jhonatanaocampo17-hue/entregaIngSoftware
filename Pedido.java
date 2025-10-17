public class Pedido {
    private int numeroPedido;
    private Cliente cliente;
    private Producto producto;
    private int numeroTarjetaCredito;

    public Pedido(int numeroPedido, Cliente cliente, int numeroTarjetaCredito, Producto producto) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.producto = producto;
    }

    public double calcularTotal() {
        return producto.calcularPrecio();
    }

    public void mostrarPedido() {
        System.out.println("\n============================");
        System.out.println(" N° Pedido: " + numeroPedido);
        cliente.mostrarDatos();
        producto.mostrarInfo();
        System.out.println(" Tarjeta usada: ****" + (numeroTarjetaCredito % 10000));
        System.out.println(" Total a pagar: $" + calcularTotal());
        System.out.println("============================\n");
    }
}
