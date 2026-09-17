package modelo;

import java.time.LocalDate;

public class Prestamo {

    // Atributos privados
    private Libro libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean activo;

    // 1. Constructor
    public Prestamo(Libro libro) {
        this.libro = libro;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = LocalDate.now().plusDays(15);
        this.activo = true;
    }

    // 2. Método para procesar el préstamo
    public void prestar() {
        if (libro.isDisponible()) {
            libro.setDisponible(false);
            this.activo = true;
            System.out.println(" El libro '" + libro.getTitulo() + "' ha sido prestado con éxito.");
        } else {
            System.out.println(" El libro '" + libro.getTitulo() + "' NO está disponible.");
        }
    }

    // 3. Método para devolver el libro
    public void devolver() {
        if (activo) {
            libro.setDisponible(true);
            this.activo = false;
            System.out.println(" El libro '" + libro.getTitulo() + "' ha sido devuelto.");
        } else {
            System.out.println(" Este préstamo ya fue finalizado.");
        }
    }

    // 4. Métodos Getters
    public Libro getLibro() { return libro; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public LocalDate getFechaDevolucion() { return fechaDevolucion; }
    public boolean isActivo() { return activo; }

} 