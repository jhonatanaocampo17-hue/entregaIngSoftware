public class Camara extends Producto {
    private String marca;

    public Camara(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(" Cámara: " + nombre +
                           " | Marca: " + marca +
                           " | Precio: $" + precio);
    }
}
