public class Cliente {
    private String cedula;
    private String nombre;
    private String correo;
    private String telefono;

    public Cliente(String cedula, String nombre, String correo, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public void realizarPedido() {
        System.out.println("\n Cliente " + nombre + " (" + cedula + ") está realizando un pedido...");
    }

    public void mostrarDatos() {
        System.out.println(" Nombre: " + nombre + "  Cédula: " + cedula +    "  Correo: " + correo + "  Teléfono: " + telefono);
    }

    public String getNombre() {
        return nombre;
    }
}
