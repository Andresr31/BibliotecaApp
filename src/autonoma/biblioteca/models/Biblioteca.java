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

    // Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
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

    public Libro buscarLibro(long id) {
        for (Libro libro : libros) {
            if (libro.getId() == id) {
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
}



