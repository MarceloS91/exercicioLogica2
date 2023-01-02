package com.example.exercicioagendamento

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class ThirtScreen : Fragment(R.layout.fragment_thirt_screen) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nickname = view.findViewById<EditText>(R.id.editTextCadastroNomeUsuario)

        view.findViewById<ImageView>(R.id.buttonCadastro).setOnClickListener {
            val action = ThirtScreenDirections.actionTela3ParaTela4("${nickname.text}")

            findNavController().navigate(action)



        }
    }
}