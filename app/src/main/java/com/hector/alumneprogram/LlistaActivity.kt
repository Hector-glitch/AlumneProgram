package com.hector.alumneprogram


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.hector.alumneprogram.databinding.ActivityLlistaBinding

class LlistaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLlistaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_llista)

        // Recibir curso seleccionado
        val curso = intent.getStringExtra("curso") ?: ""
        val alumnos = DataSource.getAlumnosPorCurso(curso)

        // Configurar RecyclerView
        binding.recyclerViewAlumnos.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewAlumnos.adapter = AlumnoAdapter(alumnos)

        // Botón para volver a MainActivity
        binding.buttonBack.setOnClickListener {
            finish() // Vuelve a la actividad anterior
        }
    }
}