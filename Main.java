import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su cédula: ");
        String cedula = sc.next();

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.next();

        Cliente cliente = new Cliente(cedula, nombre);
        cliente.realizarPedido();

        System.out.print("Ingrese el número de tarjeta: ");
        int tarjeta = sc.nextInt();

        System.out.print("Ingrese el tipo de producto (impresion / camara): ");
        String tipo = sc.next();

        Producto producto = Producto.crearProducto(tipo);

        if (producto != null) {
            Pedido pedido = new Pedido(cliente, tarjeta, producto);
            pedido.mostrarPedido();
        } else {
            System.out.println(" Producto no válido.");
        }

        sc.close();
    }
}
