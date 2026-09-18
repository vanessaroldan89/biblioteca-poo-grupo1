package modelo;

// Clase LibroDigital

public class LibroDigital extends Libro {
    private double tamanoArchivoMB;
    private String formato; // Ejemplo: "PDF" , "EUPB"

// Constructor que invoca al constructor de la superclase (Libro)
public LibroDigital (String titulo, String isbn, Autor autor, double tamanoArchivoMB, String formato) {
    super(titulo, isbn, autor);
    this.tamanoArchivoMB = tamanoArchivoMB;
    this.formato = formato;
}

// Getters y Setters
public double getTamanoArchivoMB() {
    return tamanoArchivoMB;
}

public void setTamanoArchivoMB(double tamanoArchivoMB) {
    this.tamanoArchivoMB = tamanoArchivoMB;
}

public String getFormato() {
    return formato;
}

public void setFormato(String formato) {
    this.formato = formato;
}

// 1. SOBREESCRITURA (@Override): Polimorfismo en acción
@Override
public void mostrarDetalles() {
    System.out.println("[LIBRO DIGITAL] ISBN: " + getIsbn() +
                       " | Titulo: " + getTitulo() +
                       " | Autor: " + getAutor().getNombre() +
                       " | Formato: " + formato +
                       " | Tamano: " + tamanoArchivoMB + "MB" +
                       " | Disponible: " + (isDisponible() ? "Si" : "No"));

}

// 2. SOBRECARGA DE MÉTODOS 1: Sin parámetros
public void descargar () {
    System.out.println("Iniciando la descarga de '" + getTitulo() + "' en formato " + formato + " (" + tamanoArchivoMB + " MB)...");
}

// 3. SOBRECARGA DE MÉTODOS 2: Con parámetro (calcula tiempo)
public void descargar (int velocidadKbps) {
    double tiempoEstimadoSeg = (tamanoArchivoMB * 8000) / velocidadKbps;
    System.out.println("Descargando '" + getTitulo() + "' a " + velocidadKbps + " Kbps. Tiempo estimado: " + String.format("%.2f", tiempoEstimadoSeg) + " segundos.");
}
}