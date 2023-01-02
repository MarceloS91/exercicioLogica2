package com.example.exercicioagendamento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.navigation.fragment.findNavController

class SecondScreen : Fragment(R.layout.fragment_second_screen) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nickname = view.findViewById<EditText>(R.id.editTextNomeUsuarioLogin)

        view.findViewById<ImageView>(R.id.buttonLogin).setOnClickListener {
            val action = SecondScreenDirections.actionTela2ParaTela4(
                "${nickname.text}")

            findNavController().navigate(action)
        }
    }
}