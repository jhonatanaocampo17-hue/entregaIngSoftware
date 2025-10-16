public class Foto {
    private String fichero;
    private String formato;
    private double tamano;

    public Foto(String fichero, String formato, double tamano) {
        this.fichero = fichero;
        this.formato = formato;
        this.tamano = tamano;
    }

    public void print() {
        System.out.println("🖼️ Foto: " + fichero + " (" + formato + ")");
    }

    public void mostrar() {
        System.out.println("Tamaño: " + tamano + " MB");
    }
}
