package libreria;

import javax.swing.JOptionPane;
import libreria.LIbro.Libro;

public class Main {

    static Libro[] libros = new Libro[100];
    static Ubicacion[] ubicaciones = new Ubicacion[100];
    static Venta[] ventas = new Venta[100];
    static int contadorLibros = 0;
    static int contadorVentas = 0;

    public static void main(String[] args) {
        cargarDatosPrueba();

        int opcion;
        do {
            String entrada = JOptionPane.showInputDialog(
                    "MENU PRINCIPAL\n"
                    + "1. Gestion de libros\n"
                    + "2. Gestion de ubicación\n"
                    + "3. Inventario\n"
                    + "4. Venta\n"
                    + "5. Reportes\n"
                    + "6. Salir");

            if (entrada == null) {
                return;
            }

            opcion = Integer.parseInt(entrada);

            switch (opcion) {
                case 1:
                    menuLibros();
                    break;
                case 2:
                    menuUbicacion();
                    break;
                case 3:
                    menuInventario();
                    break;
                case 4:
                    menuVenta();
                    break;
                case 5:
                    menuReportes();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (opcion != 6);
    }

    public static void cargarDatosPrueba() {
        if (contadorLibros > 0) {
            return;
        }

        libros[contadorLibros] = new Libro("Programación en Java", "Juan Pérez", "L001", "2020", 10);
        ubicaciones[contadorLibros] = new Ubicacion("E1", "1", "1");
        contadorLibros++;

        libros[contadorLibros] = new Libro("Bases de Datos", "Ana Gómez", "L002", "2019", 3);
        ubicaciones[contadorLibros] = new Ubicacion("E1", "1", "2");
        contadorLibros++;

        libros[contadorLibros] = new Libro("Estructuras de Datos", "Carlos Ruiz", "L003", "2021", 6);
        ubicaciones[contadorLibros] = new Ubicacion("E2", "2", "1");
        contadorLibros++;

        ventas[contadorVentas] = new Venta("Programación en Java", 2, "2026-04-14");
        contadorVentas++;
        ventas[contadorVentas] = new Venta("Bases de Datos", 1, "2026-04-14");
        contadorVentas++;
        ventas[contadorVentas] = new Venta("Estructuras de Datos", 3, "2026-04-13");
        contadorVentas++;
    }

    public static void menuLibros() {
        int op;
        do {
            String entrada = JOptionPane.showInputDialog(
                    "GESTION DE LIBROS\n"
                    + "1. Registrar libro\n"
                    + "2. Buscar libro\n"
                    + "3. Actualizar cantidad\n"
                    + "4. Volver");

            if (entrada == null) {
                return;
            }

            op = Integer.parseInt(entrada);

            switch (op) {
                case 1:
                    registrarLibro();
                    break;
                case 2:
                    Reporte.buscarLibros(libros, ubicaciones, contadorLibros);
                    break;
                case 3:
                    actualizarCantidad();
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (op != 4);
    }

    public static void menuUbicacion() {
        int op;
        do {
            String entrada = JOptionPane.showInputDialog(
                    "GESTION DE UBICACION\n"
                    + "1. Asignar o cambiar ubicación\n"
                    + "2. Consultar ubicación por codigo\n"
                    + "3. Volver");

            if (entrada == null) {
                return;
            }

            op = Integer.parseInt(entrada);

            switch (op) {
                case 1:
                    asignarUbicacion();
                    break;
                case 2:
                    consultarUbicacion();
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        } while (op != 3);
    }

    public static void menuInventario() {
        int op;
        do {
            String entrada = JOptionPane.showInputDialog(
                    "INVENTARIO\n"
                    + "1. Ver inventario completo\n"
                    + "2. Ver libros con bajo stock\n"
                    + "3. Volver");

            if (entrada == null) {
                return;
            }

            op = Integer.parseInt(entrada);

            switch (op) {
                case 1:
                    Reporte.mostrarInventarioCompleto(libros, ubicaciones, contadorLibros);
                    break;
                case 2:
                    Reporte.reporteBajoStock(libros, contadorLibros);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        } while (op != 3);
    }

    public static void menuVenta() {
        int op;
        do {
            String entrada = JOptionPane.showInputDialog(
                    "VENTA\n"
                    + "1. Registrar venta\n"
                    + "2. Consultar ventas\n"
                    + "3. Volver");

            if (entrada == null) {
                return;
            }

            op = Integer.parseInt(entrada);

            switch (op) {
                case 1:
                    registrarVenta();
                    break;
                case 2:
                    consultarVentas();
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (op != 3);
    }

    public static void menuReportes() {
        int op;
        do {
            String entrada = JOptionPane.showInputDialog(
                    "REPORTES\n"
                    + "1. Inventario completo\n"
                    + "2. Libros con bajo stock\n"
                    + "3. Ventas por dia y acumulado\n"
                    + "4. Ocupación de estantes\n"
                    + "5. Busqueda de libros\n"
                    + "6. Volver");

            if (entrada == null) {
                return;
            }

            op = Integer.parseInt(entrada);

            switch (op) {
                case 1:
                    Reporte.mostrarInventarioCompleto(libros, ubicaciones, contadorLibros);
                    break;
                case 2:
                    Reporte.reporteBajoStock(libros, contadorLibros);
                    break;
                case 3:
                    Reporte.reporteVentasPorDia(ventas, contadorVentas);
                    break;
                case 4:
                    Reporte.reporteOcupacionEstantes(ubicaciones, contadorLibros);
                    break;
                case 5:
                    Reporte.buscarLibros(libros, ubicaciones, contadorLibros);
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (op != 6);
    }

    public static void registrarLibro() {
        if (contadorLibros >= libros.length) {
            JOptionPane.showMessageDialog(null, "No hay espacio para más libros");
            return;
        }

        String titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        if (titulo == null) {
            return;
        }
        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        if (autor == null) {
            return;
        }
        String codigo = JOptionPane.showInputDialog("Ingrese el código del libro:");
        if (codigo == null) {
            return;
        }
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de publicación:");
        if (fecha == null) {
            return;
        }
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad disponible:"));
        String estante = JOptionPane.showInputDialog("Ingrese el estante (ejemplo E1):");
        String fila = JOptionPane.showInputDialog("Ingrese la fila:");
        String columna = JOptionPane.showInputDialog("Ingrese la columna:");

        libros[contadorLibros] = new Libro(titulo, autor, codigo, fecha, cantidad);
        ubicaciones[contadorLibros] = new Ubicacion(estante, fila, columna);
        contadorLibros++;

        JOptionPane.showMessageDialog(null, "Libro registrado correctamente");
    }

    public static void actualizarCantidad() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del libro a actualizar:");
        if (codigo == null) {
            return;
        }

        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i] != null && libros[i].getCodigo().equalsIgnoreCase(codigo)) {
                int nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad:"));
                libros[i].setCantiadad(nuevaCantidad);
                JOptionPane.showMessageDialog(null, "Cantidad actualizada");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Libro no encontrado");
    }

    public static void asignarUbicacion() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del libro:");
        if (codigo == null) {
            return;
        }

        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i] != null && libros[i].getCodigo().equalsIgnoreCase(codigo)) {
                String estante = JOptionPane.showInputDialog("Ingrese el nuevo estante:");
                String fila = JOptionPane.showInputDialog("Ingrese la nueva fila:");
                String columna = JOptionPane.showInputDialog("Ingrese la nueva columna:");
                ubicaciones[i] = new Ubicacion(estante, fila, columna);
                JOptionPane.showMessageDialog(null, "Ubicación actualizada correctamente");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Libro no encontrado");
    }

    public static void consultarUbicacion() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del libro:");
        if (codigo == null) {
            return;
        }

        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i] != null && libros[i].getCodigo().equalsIgnoreCase(codigo)) {
                JOptionPane.showMessageDialog(null,
                        "Libro: " + libros[i].getTitulo()
                        + "\nUbicación: " + Reporte.formatoUbicacion(ubicaciones[i]));
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Libro no encontrado");
    }

    public static void registrarVenta() {
        String codigo = JOptionPane.showInputDialog("Ingrese el código del libro a vender:");
        if (codigo == null) {
            return;
        }

        for (int i = 0; i < contadorLibros; i++) {
            if (libros[i] != null && libros[i].getCodigo().equalsIgnoreCase(codigo)) {
                int cantidadVenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a vender:"));

                if (cantidadVenta <= 0) {
                    JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a cero");
                    return;
                }

                if (cantidadVenta > libros[i].getCantiadad()) {
                    JOptionPane.showMessageDialog(null, "No hay suficiente stock");
                    return;
                }

                libros[i].setCantiadad(libros[i].getCantiadad() - cantidadVenta);

                if (contadorVentas < ventas.length) {
                    String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la venta (YYYY-MM-DD):", "2026-04-14");
                    if (fecha == null || fecha.trim().isEmpty()) {
                        fecha = "2026-04-14";
                    }
                    ventas[contadorVentas] = new Venta(libros[i].getTitulo(), cantidadVenta, fecha);
                    contadorVentas++;
                }

                JOptionPane.showMessageDialog(null, "Venta registrada correctamente");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Libro no encontrado");
    }

    public static void consultarVentas() {
        if (contadorVentas == 0) {
            JOptionPane.showMessageDialog(null, "No hay ventas registradas");
            return;
        }

        String mensaje = "LISTA DE VENTAS\n\n";
        for (int i = 0; i < contadorVentas; i++) {
            mensaje += ventas[i].mostrarInfo() + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
