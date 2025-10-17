public class Camara extends Producto {
    private String marca;
    private String modelo;
    private double resolucion;
    private Foto foto;

    public Camara(int numero, double precio, String descripcion,
        String marca, String modelo, double resolucion, Foto foto) {
        super(numero, precio, descripcion);
        this.marca = marca;
        this.modelo = modelo;
        this.resolucion = resolucion;
        this.foto = foto;
    }

    public Foto tomarFoto() {
        System.out.println(" Tomando foto con la cámara " + modelo + "...");
        return foto;
    }

    public double calcularPrecio() {
        return precio + resolucion * 10;
    }

    public void mostrarInfo() {
        System.out.println(" Cámara: " + marca +
         "  Modelo: " + modelo +  "  Resolución: " + resolucion + "MP" +  "  Precio: $" + precio);
    }
}
