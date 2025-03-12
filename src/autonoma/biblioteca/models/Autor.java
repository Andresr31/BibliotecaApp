/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.biblioteca.models;

/**
 * modelo que representa un Autor
 *
 * @author Juan Sebastian Lopez Guzman
 * @since 20250312
 * @version 1.0.0
 * 
 */
public class Autor {
    ///////////Atributos
    /**
     * Nombre de la editorial
     */
    private String editorial;
    /**
     * nombre de la profesion 
     */
    private String profesion;
    
    ///////////Metodo constructor
    public Autor(String editorial, String profesion) {
        this.editorial = editorial;
        this.profesion = profesion;
    }
    /////////////Metodos de acceso

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    
    
}
