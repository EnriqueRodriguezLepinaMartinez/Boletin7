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
public class Boletin7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter","J.K Rowling",1,0);
        System.out.println(libro1.toString());
        libro1.prestamo();
        System.out.println(libro1.toString());
        libro1.devolucion();
        System.out.println(libro1.toString());
    }
    
}
