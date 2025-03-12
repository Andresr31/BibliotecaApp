
package autonoma.biblioteca.models;

/**
 *
 * Modelo que permite representar una persona
 * 
 * @author Carlos Andrés Rojas Parra
 * @since 20250312
 * @version 1.0.0
 */
public abstract class Persona {
    
    //////////////////////////////////////////////////////////////////
    /// Atributos
    
    /**
     * Nombre de la persona
     */
    private String nombre;
    /**
     * Cédula de ciudadanía de la persona
     */
    private String documentoIdentidad;
    /**
     * Email de la persona
     */
    private String correoElectronico;

       
    
    ///////////////////////////////////////////////////////////////
    /// Método constructor
    public Persona(String nombre, String documentoIdentidad, String correoElectronico) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.correoElectronico = correoElectronico;
    }
    
    ///////////////////////////////////////////////////////////////
    /// Método de acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
    
    
    
}
