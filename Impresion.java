public class Impresion extends Producto {
    private String tipoPapel;

    public Impresion(String nombre, double precio, String tipoPapel) {
        super(nombre, precio);
        this.tipoPapel = tipoPapel;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(" Impresión: " + nombre +
                           " | Tipo de papel: " + tipoPapel +
                           " | Precio: $" + precio);
    }
}
