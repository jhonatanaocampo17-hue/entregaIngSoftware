public class Main {
    public static void main(String[] args) {

        System.out.println("===  SISTEMA DE PEDIDOS FOTOGRÁFICOS ===");

        //  Datos del cliente (predeterminados)
        Cliente cliente = new Cliente("123456789", "Jonathan", "jonathan@example.com", "3001234567");
        cliente.realizarPedido();

        //  Datos de pedido
        int tarjeta = 531111;
        int numeroPedido = 1;

        //  Tipos de productos disponibles
        String tipoProducto1 = "camara";
        String tipoProducto2 = "impresion";

        //  Crear productos con el Factory Method
        Producto producto1 = Producto.crearProducto(tipoProducto1);
        Producto producto2 = Producto.crearProducto(tipoProducto2);

        //  Crear pedidos automáticos
        Pedido pedido1 = new Pedido(numeroPedido, cliente, tarjeta, producto1);
        Pedido pedido2 = new Pedido(numeroPedido + 1, cliente, tarjeta, producto2);

        //  Mostrar pedidos completos
        pedido1.mostrarPedido();
        pedido2.mostrarPedido();

        System.out.println(" Pedidos procesados correctamente.");
    }
}
