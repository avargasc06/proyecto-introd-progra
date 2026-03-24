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
    public String titulo;
    public String autor;
    public String codigo;
    public String fechaPublicacion;
    public int cantiadad;

    public Libro(String titulo, String autor, String codigo, String fechaPublicacion, int cantiadad) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.fechaPublicacion = fechaPublicacion;
        this.cantiadad = cantiadad;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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

    
    
    
    
    
    
    
}
