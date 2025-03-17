/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.biblioteca.main;

import autonoma.biblioteca.models.Biblioteca;
import autonoma.biblioteca.models.Libro;
import autonoma.biblioteca.views.PaginaPrincipal;

/**
 *
 * @author juane
 */
public class BibliotecaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro= new Libro();
        PaginaPrincipal pagina = new PaginaPrincipal(biblioteca, libro);
        pagina.setVisible(true);
    }
    
}
