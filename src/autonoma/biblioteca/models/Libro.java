/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

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
    
    /*
    * id del libro
    */
    private long id;
    /*
    * Titulo del libro
    */
    private String titulo;
    
    
    /////////////////////////////////////////////////////////////////////////
    /////////////// metodo constructor
    public Libro(long id, String titulo){
        this.id = id;
        this.titulo = titulo;
    }
    
    ////////////////////////////////////////////////////////////////////////
    ////////////// metodo de acceso

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
