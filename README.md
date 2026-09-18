# Sistema de Gestión de Biblioteca - POO II

## Descripción del Sistema
Este proyecto es una solución orientada a objetos en Java para gestionar los procesos principales de una biblioteca (registro de autores, libros impresos, libros digitales y préstamos). 

El diseño fue trasladado desde un diagrama de clases UML a código Java, garantizando alta cohesión, bajo acoplamiento y el cumplimiento de las mejores prácticas de desarrollo y control de versiones con Git y GitHub.

## Estructura del Proyecto
- `modelo/Autor.java`: Representa a los autores y gestiona la relación de **Agregación** con la lista de sus libros.
- `modelo/Libro.java`: Clase base que implementa el pilar de **Encapsulamiento** para resguardar la información básica.
- `modelo/LibroDigital.java`: Subclase que extiende de `Libro` (**Herencia** y **Polimorfismo**) e incorpora atributos digitales.
- `modelo/Prestamo.java`: Clase que gestiona los préstamos en el sistema mediante una relación de **Composición** con la clase `Libro`.
- `Main.java`: Clase de pruebas e integración que instancia los objetos y demuestra la correcta ejecución del sistema.

## Principios SOLID Aplicados
1. **SRP (Single Responsibility Principle):** Cada clase posee una única responsabilidad en el dominio del problema.
2. **OCP (Open/Closed Principle):** Se extiende la funcionalidad a través de `LibroDigital` sin modificar la clase base `Libro`.
3. **LSP (Liskov Substitution Principle):** Las instancias de `LibroDigital` pueden sustituir a las de `Libro` en las colecciones del sistema de forma transparente.

## Integrantes del Grupo
- Vanessa Roldán Monsalve 
- Maria Alejandra Correa Berrío 
- Daniela Carvajal Espinosa 