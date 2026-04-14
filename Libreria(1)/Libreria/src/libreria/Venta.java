package libreria;

public class Venta {

    private String titulo;
    private int cantidad;
    private String fecha;

    public Venta(String titulo, int cantidad, String fecha) {
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public String mostrarInfo() {
        return "Libro: " + titulo + " | Cantidad: " + cantidad + " | Fecha: " + fecha;
    }
}
