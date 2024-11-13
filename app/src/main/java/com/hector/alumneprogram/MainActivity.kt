package com.hector.alumneprogram

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.hector.alumneprogram.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Configura el Spinner
        val cursos = arrayOf("1rSMX", "2nSMX", "1rDAM", "2nDAM") // Agrega más cursos según necesites
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, cursos)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerCursos.adapter = adapter

        // Botón para ir a LlistaActivity
        binding.buttonSelect.setOnClickListener {
            val cursoSeleccionado = binding.spinnerCursos.selectedItem.toString()
            val intent = Intent(this, LlistaActivity::class.java)
            intent.putExtra("curso", cursoSeleccionado)
            startActivity(intent)
        }
    }
}
