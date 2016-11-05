/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

/**
 *
 * @author Ricky
 */
public class Libro {
    private String titulo, autor;
    private int numEjemplares, numPrestados;

    public Libro() {
    }
    
    public Libro(String titulo, String autor, int numEjemplares, int numPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = numPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public int getNumPrestados() {
        return numPrestados;
    }
    
    public boolean prestamo(){
        boolean prestado = false;
        if(numEjemplares>0){
            numEjemplares -=1;
            numPrestados +=1;
            prestado = true;
        }
        return prestado;
    }
    
    public boolean devolucion(){
        boolean devuelto = false;
        if(numPrestados>0){
            numPrestados -=1;
            numEjemplares +=1;
            devuelto = true;
        }
        return devuelto;
    }

    @Override
    public String toString() {
        return "Titulo = " + titulo + ", Autor = " + autor + ", Numero de ejemplares = " + numEjemplares + ", Numeros prestados = " + numPrestados;
    }
    
    
    
}
