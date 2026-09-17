import modelo.Autor;
import modelo.Libro;
import modelo.Prestamo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de Biblioteca");

        // 1. Crear objetos
        Autor autor1 = new Autor("Joshua Bloch", "EE.UU.");
        Libro libro1 = new Libro("Effective Java", "978-0134685991", autor1);
    
        // 2. Crear préstamo
        Prestamo prestamo1 = new Prestamo(libro1);

        // 3. Probar funciones
        System.out.println("Libro: " + libro1.getTitulo());
        
        prestamo1.prestar();
        prestamo1.prestar();
        prestamo1.devolver();
    }
}