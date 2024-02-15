
/**
 * Representa un libro con su título, autor y año de publicación.
 * @property titulo Título del libro.
 * @property autor Autor del libro.
 * @property anioPublicacion Año de publicación del libro.
 */
data class Libro(val titulo: String, val autor: String, val anioPublicacion: Int)

/**
 * Representa una revista con su título, número de edición y año de publicación.
 * @property titulo Título de la revista.
 * @property issue Número de edición de la revista.
 * @property anio Año de publicación de la revista.
 */

data class Revista(val titulo: String, val issue: Int, val anio: Int)

/**
 * Representa un DVD con su título, director y año de publicación.
 * @property titulo Título del DVD.
 * @property director Director del DVD.
 * @property anio Año de publicación del DVD.
 */
data class DVD(val titulo: String, val director: String, val anio: Int)


/**
 * Clase sellada que representa un usuario del sistema de préstamos.
 */
sealed class Usuario {

    /**
     * Representa un estudiante con su ID, nombre y carrera.
     * @property id ID del estudiante.
     * @property nombre Nombre del estudiante.
     * @property carrera Carrera del estudiante.
     */
    class Estudiante(val id: String, val nombre: String, val carrera: String): Usuario()

    /**
     * Representa un profesor con su ID, nombre y departamento.
     * @property id ID del profesor.
     * @property nombre Nombre del profesor.
     * @property departamento Departamento al que pertenece el profesor.
     */
    class Profesor(val id: String, val nombre: String, val departamento: String): Usuario()

    /**
     * Representa un visitante con su ID y nombre.
     * @property id ID del visitante.
     * @property nombre Nombre del visitante.
     */
    class Visitante(val id: String, val nombre: String): Usuario()
}

/**
 * Función que imprime la información de préstamo basada en el tipo de usuario.
 * @param usuario Usuario para el que se realizará el préstamo.
 */
fun prestamoLibro(usuario: Usuario) {
    when (usuario) {
        is Usuario.Estudiante -> println("El estudiante de ${usuario.carrera} con id ${usuario.id} y nombre ${usuario.nombre} puede tomar prestado por 3 días.")
        is Usuario.Profesor -> println("El profesor de ${usuario.departamento} con id ${usuario.id} y nombre ${usuario.nombre} puede tomar prestado por 5 días.")
        is Usuario.Visitante -> println("El visitante con id ${usuario.id} y nombre ${usuario.nombre} no puede acceder al préstamo.")
    }
}

fun main() {

    val estudiante: Usuario = Usuario.Estudiante("E401", "Juan", "Informática")
    val profesor: Usuario = Usuario.Profesor("P58", "Luis", "Ingeniería")
    val visitante: Usuario = Usuario.Visitante("V756", "Ana")

    val libro: Libro = Libro("Programación Volumen II", "Diego", 2024)



}