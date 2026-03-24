package main;

import javax.swing.JOptionPane;

public class Main {

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
                    JOptionPane.showMessageDialog(null, "Registrar venta");
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Consultar ventas");
                    break;
            }

        } while (op != 3);
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
                    JOptionPane.showMessageDialog(null, "Reporte ventas");
                    break;
            }

        } while (op != 3);
    }
}