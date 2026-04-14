package libreria;

import javax.swing.JOptionPane;
import libreria.LIbro.Libro;

public class Reporte {

    public static void mostrarInventarioCompleto(Libro[] libros, Ubicacion[] ubicaciones, int contadorLibros) {
        String mensaje = "LISTADO DE INVENTARIO COMPLETO\n\n";

        if (contadorLibros == 0) {
            JOptionPane.showMessageDialog(null, "No hay libros registrados");
            return;
        }

        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i] != null) {
                mensaje += "Código: " + libros[i].getCodigo()
                        + "\nTítulo: " + libros[i].getTitulo()
                        + "\nAutor: " + libros[i].getAutor()
                        + "\nFecha publicación: " + libros[i].getFechaPublicacion()
                        + "\nCantidad: " + libros[i].getCantiadad()
                        + "\nUbicación: " + formatoUbicacion(ubicaciones[i])
                        + "\n-----------------------------\n";
            }
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void reporteBajoStock(Libro[] libros, int contadorLibros) {
        String mensaje = "REPORTE DE LIBROS CON BAJO STOCK\n\n";
        boolean hayBajoStock = false;

        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i] != null && libros[i].getCantiadad() <= 5) {
                mensaje += "Código: " + libros[i].getCodigo()
                        + " | Título: " + libros[i].getTitulo()
                        + " | Cantidad: " + libros[i].getCantiadad() + "\n";
                hayBajoStock = true;
            }
        }

        if (!hayBajoStock) {
            mensaje += "No hay libros con bajo stock.";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void reporteVentasPorDia(Venta[] ventas, int contadorVentas) {
        if (contadorVentas == 0) {
            JOptionPane.showMessageDialog(null, "No hay ventas registradas");
            return;
        }

        String[] fechas = new String[100];
        int[] acumulados = new int[100];
        int contadorFechas = 0;
        int totalGeneral = 0;

        for (int i = 0; i < contadorVentas; i++) {
            if (ventas[i] != null) {
                totalGeneral += ventas[i].getCantidad();
                String fecha = ventas[i].getFecha();
                boolean encontrada = false;

                for (int j = 0; j < contadorFechas; j++) {
                    if (fechas[j].equals(fecha)) {
                        acumulados[j] += ventas[i].getCantidad();
                        encontrada = true;
                        break;
                    }
                }

                if (!encontrada) {
                    fechas[contadorFechas] = fecha;
                    acumulados[contadorFechas] = ventas[i].getCantidad();
                    contadorFechas++;
                }
            }
        }

        String mensaje = "REPORTE DE VENTAS POR DÍA\n\n";
        for (int i = 0; i < contadorFechas; i++) {
            mensaje += "Fecha: " + fechas[i] + " | Total vendido: " + acumulados[i] + "\n";
        }
        mensaje += "\nACUMULADO GENERAL: " + totalGeneral;

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void reporteOcupacionEstantes(Ubicacion[] ubicaciones, int contadorLibros) {
        int capacidadTotal = 45;
        int ocupadas = 0;

        for (int i = 0; i < contadorLibros; i++) {
            if (ubicaciones[i] != null) {
                ocupadas++;
            }
        }

        int libres = capacidadTotal - ocupadas;
        if (libres < 0) {
            libres = 0;
        }

        String mensaje = "REPORTE DE OCUPACIÓN DE ESTANTES\n\n"
                + "Capacidad total estimada: " + capacidadTotal + " posiciones\n"
                + "Posiciones ocupadas: " + ocupadas + "\n"
                + "Posiciones libres: " + libres;

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void buscarLibros(Libro[] libros, Ubicacion[] ubicaciones, int contadorLibros) {
        String criterio = JOptionPane.showInputDialog(
                "Ingrese el dato a buscar por título, autor o ubicación:\n"
                + "Ejemplos: Java, Ana Gómez, E1");

        if (criterio == null || criterio.trim().isEmpty()) {
            return;
        }

        criterio = criterio.toLowerCase();
        String mensaje = "RESULTADOS DE BÚSQUEDA\n\n";
        boolean encontrado = false;

        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i] != null) {
                String ubicacionTexto = formatoUbicacion(ubicaciones[i]).toLowerCase();

                if (libros[i].getTitulo().toLowerCase().contains(criterio)
                        || libros[i].getAutor().toLowerCase().contains(criterio)
                        || ubicacionTexto.contains(criterio)) {

                    mensaje += "Código: " + libros[i].getCodigo()
                            + "\nTítulo: " + libros[i].getTitulo()
                            + "\nAutor: " + libros[i].getAutor()
                            + "\nCantidad: " + libros[i].getCantiadad()
                            + "\nUbicación: " + formatoUbicacion(ubicaciones[i])
                            + "\n-----------------------------\n";
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            mensaje += "No se encontraron libros con ese criterio.";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static String formatoUbicacion(Ubicacion ubicacion) {
        if (ubicacion == null) {
            return "Sin ubicación asignada";
        }

        return ubicacion.getEstante() + " - Fila " + ubicacion.getFila() + " - Columna " + ubicacion.getColumna();
    }
}
