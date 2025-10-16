public abstract class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract void mostrarInfo();

    // 🔹 Método Factory Method simplificado
    public static Producto crearProducto(String tipo) {
        switch (tipo.toLowerCase()) {
            case "foto":
                return new Foto("Retrato profesional", 50.0, "1080p");
            case "impresion":
                return new Impresion("Poster decorativo", 30.0, "Papel fotográfico");
            case "camara":
                return new Camara("Canon EOS 90D", 1200.0, "Canon");
            default:
                System.out.println(" Tipo de producto no válido. (foto / impresion / camara)");
                return null;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
