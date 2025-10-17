public class Pedido {
    private Cliente cliente;
    private Producto producto;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, int numeroTarjetaCredito, Producto producto) {
        this.cliente = cliente;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.producto = producto;
    }

    public double calcularTotal() {
        return producto.calcularPrecio();
    }

    public void listarProducto() {
        producto.mostrarInfo();
    }

    public void mostrarPedido() {
        cliente.mostrarDatos();
        listarProducto();
        System.out.println(" Total a pagar: $" + calcularTotal());
    }
}
