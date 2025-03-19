package autonoma.biblioteca.models;
import java.util.ArrayList;
import autonoma.biblioteca.models.Libro;

/**
* @Daniel Munos
* @since 20250315
* @version 1.0.0
*/
    


public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Autor> autores;
    private ArrayList<Persona> personas;
    
    // Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.personas = new ArrayList<>();
    }

    // Métodos        
    public String mostrarLibros() {
        if (libros.isEmpty()) {
            return "No hay libros en la biblioteca.";
        }
        StringBuilder lista = new StringBuilder();
        for (Libro libro : libros) {
            lista.append("ID: ").append(libro.getId()).append(", Título: ").append(libro.getTitulo()).append("\n");
        }
        return lista.toString();
    }

    public boolean agregarLibro(Libro libro) {
        if (libro != null && !libros.contains(libro)) {
            return libros.add(libro);
        }
        return false;
    }
    public boolean agregarAutor(Autor autor) {
        if (autor != null && !autores.contains(autor)) {
            return autores.add(autor);
        }
        return false;
    }
    
    public boolean agregarPersona(Persona persona) {
        if (persona != null && !personas.contains(persona)) {
            return personas.add(persona);
        }
        return false;
    }
    
    public Libro buscarLibro(String nombre) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(nombre)) {
                return libro;
            }
        }
        return null;
    }

    public boolean actualizarLibro(long id, Libro libroActualizado) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == id) {
                libros.set(i, libroActualizado);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarLibro(long id) {
        return libros.removeIf(libro -> libro.getId() == id);
    }

    public ArrayList<Libro> obtenerLibrosAlfabeticamente() {
        ArrayList<Libro> librosOrdenados = new ArrayList<>(libros);
        librosOrdenados.sort((l1, l2) -> l1.getTitulo().compareToIgnoreCase(l2.getTitulo()));
        return librosOrdenados;
    }
    public ArrayList<Libro> mostrarLibrosArr() {
        return this.libros;
    }
    public long obtenerUltimoID() {
    if (libros.isEmpty()) { 
        return 0;
    }
    
    long maxID = 0;
    for (Libro libro : libros) {
        if (libro.getId() > maxID) {
            maxID = libro.getId();
        }
    }
    return maxID;
}  
}



