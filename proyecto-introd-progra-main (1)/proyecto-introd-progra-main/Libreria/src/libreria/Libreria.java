/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;
import static libreria.Main.mostrarlibros;
import javax.swing.JOptionPane;
import static libreria.Main.consultarVentas;
import static libreria.Main.registrarLibro;
import static libreria.Main.registrarVenta;
import static libreria.Main.buscarlibro;
import static libreria.Main.actualizarLibro;
/**
 *
 * @author dilsh
 */

public class Libreria {

    /**
     * @param args the command line arguments
     */
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
                    + "2. Actualizar información\n"
                    + "3. Volver"
                    
            ));

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Registrar libro");
                    registrarLibro();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Actualizar información");
                    actualizarLibro();
                    break;
                   
                    
            }

        } while (op != 3);
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
                    + "2. buscar libro\n"
                    + "3. Volver"
            ));

            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Ver inventario");
                     mostrarlibros();        
                    
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Buscar libro");
                    buscarlibro();
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