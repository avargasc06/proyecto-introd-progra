package libreria;

import javax.swing.JOptionPane;
import libreria.LIbro.Categoria;
import libreria.LIbro.Libro;

public class Main {

    static Venta[] ventas = new Venta[100];
    static int contadorVentas = 0;
    public static Libro[] libro = new Libro[100];
    public static int contador = 0;
            

    public static void registrarLibro() {

        if (contador < libro.length) {
            String Titulo = JOptionPane.showInputDialog("Titulo del libro ");
            String Autor = JOptionPane.showInputDialog("digite el autor del libro ");
            int Codigo = Integer.parseInt(JOptionPane.showInputDialog("el codigo del libro"));
            String FechaPublicacion = JOptionPane.showInputDialog("fecha de publicacion del libro ");
            int Cantidad = Integer.parseInt(JOptionPane.showInputDialog("cantidad de libros"));
            
            Categoria  caategoria[] = Categoria.values();
            int seleccion = JOptionPane.showOptionDialog(null, "Categoria del libro", "Categoria", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, caategoria, caategoria[0]);
            Categoria catego = caategoria[seleccion];
        
            libro[contador++]=new Libro(Titulo, Autor, Codigo, FechaPublicacion, Cantidad,catego);
            JOptionPane.showMessageDialog(null,"registro correcto");
            
        }else {
            JOptionPane.showMessageDialog(null, "registro lleno");
        }         

    }

    public static void buscarlibro() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("digite el codigo del libro"));
        Libro libroo = null;

        for (int i = 0; i < contador; i++) {
            if (libro[i].getCodigo() == codigo) {
                libroo = libro[i];
                break;
            }

        }
        if (libroo != null) {
            JOptionPane.showMessageDialog(null, libroo.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro por este medio de busqueda");
        }
    }

    public static void actualizarLibro() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del libro"));
        Libro l = null;

        for (int i = 0; i < libro.length; i++) {
            if (libro[i].getCodigo()== codigo) {
                l = libro[i];
                break;
            }
        }

        if (l != null) {

            String titulo = JOptionPane.showInputDialog("Nuevo titulo:", l.getTitulo());
            l.setTitulo(titulo);
            String autor = JOptionPane.showInputDialog("Nuevo autor:", l.getAutor());
            l.setAutor(autor);
            String fecha = JOptionPane.showInputDialog("Nueva fecha:", l.getFechaPublicacion());
            l.setFechaPublicacion(fecha);
            int cant = Integer.parseInt(JOptionPane.showInputDialog("Nueva cantidad :", l.getCantiadad()));
            l.setCantiadad(cant);

            int cante = JOptionPane.showOptionDialog(null, "nueva catecoria ", "Tipo de categoria",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, Categoria.values(), Categoria.ACCION);
            l.setCategoria(Categoria.values()[cante]);

            JOptionPane.showMessageDialog(null, "libro actualizado correctamente:" + l.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el libro");
        }
        
        
        
        

    }

    public static void asignarUbicacion() {

    }

    public static void ConsultarUbicacion() {

    }

 


    public static void registrarVenta() {

        if (contadorVentas >= ventas.length) {
            JOptionPane.showMessageDialog(null, "No se pueden registrar más ventas");
            return;
        }

        String titulo = JOptionPane.showInputDialog("Ingrese el nombre del libro:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad:"));

        ventas[contadorVentas] = new Venta(titulo, cantidad);
        contadorVentas++;

        JOptionPane.showMessageDialog(null, "Venta registrada correctamente");
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

    
}
