public abstract class Producto {
    protected int numero;
    protected double precio;
    protected String descripcion;

    public Producto(int numero, double precio, String descripcion) {
        this.numero = numero;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public abstract void mostrarInfo();
    public abstract double calcularPrecio();

    // 🏭 Factory Method (simplificado)
    public static Producto crearProducto(String tipo) {
        if (tipo.equalsIgnoreCase("impresion")) {
            Foto foto = new Foto("retrato.jpg", "JPG", 2.5);
            return new Impresion(1, 35.0, "Impresión brillante", "Color", "Mate", "A4", new Foto[]{foto});
        } else if (tipo.equalsIgnoreCase("camara")) {
            Foto foto = new Foto("prueba.jpg", "PNG", 3.0);
            return new Camara(2, 800.0, "Cámara profesional", "Canon", "EOS 90D", 24.2, foto);
        } else {
            System.out.println("Tipo de producto no válido (impresion / camara)");
            return null;
        }
    }

    public double getPrecio() {
        return precio;
    }
}
