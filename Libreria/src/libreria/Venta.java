package libreria;

public class Venta {

    private String titulo;
    private int cantidad;

    public Venta(String titulo, int cantidad) {
        this.titulo = titulo;
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String mostrarInfo() {
        return "Libro: " + titulo + " | Cantidad: " + cantidad;
    }
}
