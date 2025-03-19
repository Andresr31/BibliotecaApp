/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

import java.util.ArrayList;

/**
 * 
 * Modelo que permite representar un libro
 *
 * @author Juan Esteban Hernández Martínez
 * @since 20250312
 * @version 1.0.0 
 */
public class Libro {
    
    /////////////////////////////////////////////////////////////////////////
    ///// atributos
    private Biblioteca biblioteca;
    
    /*
    * id del libro
    */
    private long id;
    /*
    * Titulo del libro
    */
    private String titulo;
    private Autor autor;
    
    
    /////////////////////////////////////////////////////////////////////////
    /////////////// metodo constructor

    public Libro() {
    }

    ////////////////////////////////////////////////////////////////////////
    ////////////// metodo de acceso
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
