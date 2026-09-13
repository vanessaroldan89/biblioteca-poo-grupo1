package modelo;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    
    // Encapsulamiento: atributos protegidos
    private String nombre;
    private String nacionalidad;
    
    // AGREGACIÓN: Un autor tiene una lista de libros, pero los libros son independientes
    private List<Libro> librosEscritos;

    // Constructor
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.librosEscritos = new ArrayList<>(); // Inicializamos la lista vacia
    }

    // Metodo para agregar un libro a la lista del autor
    public void agregarLibro(Libro libro) {
        this.librosEscritos.add(libro);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<Libro> getLibrosEscritos() {
        return librosEscritos;
    }
}
