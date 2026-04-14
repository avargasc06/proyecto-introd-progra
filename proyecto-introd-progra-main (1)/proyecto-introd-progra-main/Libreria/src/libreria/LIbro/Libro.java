/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.LIbro;

/**
 *
 * @author dilsh
/Clase Libro */  
public class Libro {
    private String titulo;
    private String autor;
    private int codigo;
    private String fechaPublicacion;
    private int cantiadad;
    private Categoria categoria;

    public Libro(String titulo, String autor, int codigo, String fechaPublicacion, int cantiadad, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.fechaPublicacion = fechaPublicacion;
        this.cantiadad = cantiadad;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getCantiadad() {
        return cantiadad;
    }

    public void setCantiadad(int cantiadad) {
        this.cantiadad = cantiadad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "titulo = " + titulo + "\n"+
                "autor=" + autor +"\n"+
                "codigo=" + codigo + "\n"+
                "fechaPublicacion=" + fechaPublicacion +"\n"+
                "cantiadad=" + cantiadad +"\n"+
                "categoria=" + categoria;
    }
   

   

    
    
    
    
    
    
    
}
