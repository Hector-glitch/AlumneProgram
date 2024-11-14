package com.hector.alumneprogram

object DataSource {
    val alumnos = mapOf(
        "1rSMX" to listOf(Alumno("Ana", 14), Alumno("Luis", 15), Alumno("Pere", 14), Alumno("Joan", 14),),
        "2nSMX" to listOf(Alumno("Maria", 16), Alumno("Marc", 14), Alumno("Pedro", 14), Alumno("Carlos", 17)),
        "1rDAM" to listOf(Alumno("Jorge", 18), Alumno("Carlos", 14), Alumno("Laika", 14), Alumno("Elena", 17)),
        "2nDAM" to listOf(Alumno("Lucia", 19), Alumno("Marta", 14), Alumno("Calisto", 14), Alumno("Robert", 18))
    )

    fun getAlumnosPorCurso(curso: String): List<Alumno> {
        return alumnos[curso] ?: emptyList()
    }
}
