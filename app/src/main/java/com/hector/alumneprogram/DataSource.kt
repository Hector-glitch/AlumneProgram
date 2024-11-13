package com.hector.alumneprogram

object DataSource {
    val alumnos = mapOf(
        "1º" to listOf(Alumno("Ana", 14), Alumno("Luis", 15)),
        "2º" to listOf(Alumno("Maria", 16), Alumno("Carlos", 17)),
        "3º" to listOf(Alumno("Jorge", 18), Alumno("Elena", 17)),
        "4º" to listOf(Alumno("Lucia", 19), Alumno("Roberto", 18))
    )

    fun getAlumnosPorCurso(curso: String): List<Alumno> {
        return alumnos[curso] ?: emptyList()
    }
}
