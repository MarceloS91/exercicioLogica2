package com.example.exercicioagendamento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController


class EasyCadastro : Fragment(R.layout.fragment_easy_cadastro) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nome = view.findViewById<EditText>(R.id.editTextEasyNome)

        val endereco = view.findViewById<EditText>(R.id.editTextEasyEndereco)

 //       val radioButton = view.findViewById<RadioButton>(R.id.radioButtonGrade)//

        val data = view.findViewById<EditText>(R.id.editTextEasyDate)

        val time = view.findViewById<EditText>(R.id.editTextEasyHorario)

        val description = view.findViewById<EditText>(R.id.editTextEasyDescricao)

        view.findViewById<Button>(R.id.buttonEasyAgendar).setOnClickListener {
            val action = EasyCadastroDirections.actionEasyParaAgendamento(
                "${nome.text}",
                "${endereco.text}",
               "${data.text}",
                "${time.text}",
                "${description.text}",

 //              "${endereco.text}",
//                "${radioButton.text}",
//                "${data.text}",
//                "${time.text}",
//                "${description.text}"
            )

            findNavController().navigate(action)

        }
    }
}



