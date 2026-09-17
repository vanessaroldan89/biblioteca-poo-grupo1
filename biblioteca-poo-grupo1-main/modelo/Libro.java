package modelo;

// Principio SOLID: SRP (Responsabilidad Unica)
// La clase solo se encarga de mantener los datos del libro
public class Libro {
    
    // Atributos en private para cumplir con el encapsulamiento
    private String titulo;
    private String isbn;
    private Autor autor;
    private boolean disponible;

    // Constructor principal
    public Libro(String titulo, String isbn, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.disponible = true; // Por defecto el libro esta disponible al crearlo
    }

    // Metodos Getters para leer los datos
    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Metodos Setters para modificar los datos
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
// Método para mostrar los detalles base del libro
public void mostrarDetalles() {
    System.out.println("Titulo: " + titulo + " | ISBN: " + isbn + " | Autor: " +(autor != null ? autor.getNombre() : "Sin autor") + " | Disponible: " + disponible);
  }
}