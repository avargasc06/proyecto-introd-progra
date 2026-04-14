package libreria;

import javax.swing.JOptionPane;

public class Main {

    static Venta[] ventas = new Venta[100];
    static int contadorVentas = 0;

    public static void main(String[] args) {

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU PRINCIPAL\n"
                    + "1. Gestión de libros\n"
                    + "2. Gestión de ubicación\n"
                    + "3. Inventario\n"
                    + "4. Venta\n"
                    + "5. Reportes\n"
                    + "6. Salir"
            ));

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
            }

        } while (opcion != 6);
    }

    public static void menuLibros() {

        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "GESTION DE LIBROS\n"
                    + "1. Registrar libro\n"
                    + "2. Buscar libro\n"
                    + "3. Actualizar información\n"
                    + "4. Volver"
            ));

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Registrar libro");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Buscar libro");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Actualizar información");
                    break;
            }

        } while (op != 4);
    }

    public static void menuUbicacion() {

        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "GESTION DE UBICACION\n"
                    + "1. Asignar ubicación\n"
                    + "2. Consultar ubicación\n"
                    + "3. Volver"
            ));

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Asignar ubicación");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Consultar ubicación");
                    break;
            }

        } while (op != 3);
    }

    public static void menuInventario() {

        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "INVENTARIO\n"
                    + "1. Ver inventario\n"
                    + "2. Reporte inventario\n"
                    + "3. Volver"
            ));

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Ver inventario");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Reporte inventario");
                    break;
            }

        } while (op != 3);
    }

    public static void menuVenta() {

        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "VENTA\n"
                    + "1. Registrar venta\n"
                    + "2. Consultar ventas\n"
                    + "3. Volver"
            ));

            switch (op) {
                case 1:
                    registrarVenta();
                    break;
                case 2:
                    consultarVentas();
                    break;
            }

        } while (op != 3);
    }

   public static void registrarVenta() {

    String titulo = JOptionPane.showInputDialog("Ingrese el nombre del libro:");

    boolean encontrado = false;

    for (int i = 0; i < libros.length; i++) {

        if (libros[i] != null && libros[i].equalsIgnoreCase(titulo)) {

            encontrado = true;

            // eliminar libro del inventario
            libros[i] = null;
            stock[i] = 0;

            int cantidad = 1; // porque elimina el libro completo

            ventas[contadorVentas] = new Venta(titulo, cantidad);
            contadorVentas++;

            JOptionPane.showMessageDialog(null, "Libro eliminado del inventario");
        }
    }

    if (!encontrado) {
        JOptionPane.showMessageDialog(null, "Libro no encontrado");
    }
}

    public static void consultarVentas() {

        if (contadorVentas == 0) {
            JOptionPane.showMessageDialog(null, "No hay ventas registradas");
            return;
        }

        String mensaje = "LISTA DE VENTAS\n";

        for (int i = 0; i < contadorVentas; i++) {
            mensaje += ventas[i].mostrarInfo() + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static void menuReportes() {

        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "REPORTES\n"
                    + "1. Reporte inventario\n"
                    + "2. Reporte ventas\n"
                    + "3. Volver"
            ));

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Reporte inventario");
                    break;
                case 2:
                    consultarVentas();
                    break;
            }

        } while (op != 3);
    }
}
