import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🧍 Datos del cliente
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = sc.nextLine();
        Cliente cliente = new Cliente(nombreCliente);

        // 🧾 Número de pedido
        System.out.print("Ingrese el número del pedido: ");
        int numeroPedido = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        // 🛒 Tipo de producto
        System.out.println("\nSeleccione el tipo de producto (foto / impresion / camara): ");
        String tipo = sc.nextLine();

        // 🏭 Crear producto con método factory
        Producto producto = Producto.crearProducto(tipo);

        // 📦 Crear pedido y mostrar resumen
        if (producto != null) {
            Pedido pedido = new Pedido(numeroPedido, cliente, producto);
            pedido.mostrarResumen();
        } else {
            System.out.println(" No se pudo crear el pedido.");
        }

        sc.close();
    }
}
