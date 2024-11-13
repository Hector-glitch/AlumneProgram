package com.hector.alumneprogram

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hector.alumneprogram.databinding.ItemAlumnoBinding

class AlumnoAdapter(private val alumnos: List<Alumno>) : RecyclerView.Adapter<AlumnoAdapter.AlumnoViewHolder>() {

    inner class AlumnoViewHolder(val binding: ItemAlumnoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumnoViewHolder {
        val binding = ItemAlumnoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AlumnoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlumnoViewHolder, position: Int) {
        val alumno = alumnos[position]
        holder.binding.nombreTextView.text = alumno.nombre
        holder.binding.edadTextView.text = alumno.edad.toString()
    }

    override fun getItemCount(): Int = alumnos.size
}

