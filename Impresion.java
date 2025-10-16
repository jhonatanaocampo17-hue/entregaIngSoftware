public class Impresion extends Producto {
    private String color;
    private String tipoPapel;
    private String tamano;
    private Foto[] fotos;

    public Impresion(int numero, double precio, String descripcion,
                     String color, String tipoPapel, String tamano, Foto[] fotos) {
        super(numero, precio, descripcion);
        this.color = color;
        this.tipoPapel = tipoPapel;
        this.tamano = tamano;
        this.fotos = fotos;
    }

    public void imprimir() {
        System.out.println("🖨️ Imprimiendo fotos en papel " + tipoPapel + "...");
        for (int i = 0; i < fotos.length; i++) {
            fotos[i].print();
        }
    }

    public double calcularPrecio() {
        double total = precio * fotos.length;
        if (color.equalsIgnoreCase("color")) {
            total += 500;
        }
        return total;
    }

    public void mostrarInfo() {
        System.out.println("🖨️ Impresión: " + descripcion +
                           " | Tamaño: " + tamano +
                           " | Tipo de papel: " + tipoPapel +
                           " | Precio: $" + precio);
    }
}
