public class Cliente {
    private String cedula;
    private String nombre;

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public void realizarPedido() {
        System.out.println(nombre + " está realizando un pedido...");
    }

    public void mostrarDatos() {
        System.out.println("👤 Cliente: " + nombre + " | Cédula: " + cedula);
    }

    public String getNombre() {
        return nombre;
    }
}
