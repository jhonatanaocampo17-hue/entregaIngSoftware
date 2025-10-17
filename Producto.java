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

    // Factory Method
    public static Producto crearProducto(String tipo) {
        if (tipo.equalsIgnoreCase("impresion")) {
            Foto foto1 = new Foto("retrato1.jpg", "JPG", 2.5);
            Foto foto2 = new Foto("retrato2.jpg", "PNG", 3.1);
            Foto[] fotos = {foto1, foto2};

            return new Impresion(1001, 35.0, "Impresión brillante",
                    "Color", "Papel Fotográfico", "A4", fotos);

        } else if (tipo.equalsIgnoreCase("camara")) {
            Foto muestra = new Foto("muestra.png", "RAW", 4.8);
            return new Camara(2001, 850.0, "Cámara profesional para estudio",
                    "Canon", "EOS 90D", 24.2, muestra);
        } else {
            System.out.println("Tipo de producto no válido (impresion / camara).");
            return null;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
