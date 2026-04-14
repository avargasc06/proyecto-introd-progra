/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria;

/**
 *
 * @author dilsh
 */
public class Ubicacion {
    private int estante;
    private int fila;
    private int columna;

    public Ubicacion(int estante, int fila, int columna) {
        this.estante = estante;
        this.fila = fila;
        this.columna = columna;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getEstante() {
        return estante;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "estante=" + estante + ", fila=" + fila + ", columna=" + columna + '}';
    }

    
            
}
