public class Foto extends Producto {
    private String resolucion;

    public Foto(String nombre, double precio, String resolucion) {
        super(nombre, precio);
        this.resolucion = resolucion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(" Foto: " + nombre +
                           " | Resolución: " + resolucion +
                           " | Precio: $" + precio);
    }
}
