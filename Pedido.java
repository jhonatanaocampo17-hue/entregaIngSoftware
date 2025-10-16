public class Pedido {
    private int numeroPedido;
    private Cliente cliente;
    private Producto producto;

    public Pedido(int numeroPedido, Cliente cliente, Producto producto) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.producto = producto;
    }

    public void mostrarResumen() {
        System.out.println("\n Pedido #" + numeroPedido);
        System.out.println(" Cliente: " + cliente.getNombre());
        producto.mostrarInfo();
        System.out.println(" Total a pagar: $" + producto.getPrecio());
    }
}
