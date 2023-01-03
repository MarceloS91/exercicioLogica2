package com.example.exercicioagendamento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController


class HardCadastro : Fragment(R.layout.fragment_hard_cadastro) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nome = view.findViewById<EditText>(R.id.hardNome)

        val endereco = view.findViewById<EditText>(R.id.hardEndereco)

        //       val radioButton = view.findViewById<RadioButton>(R.id.radioButtonGrade)//

        val data = view.findViewById<EditText>(R.id.hardData)

        val time = view.findViewById<EditText>(R.id.hardHorario)

        val description = view.findViewById<EditText>(R.id.hardDescricao)

        view.findViewById<Button>(R.id.buttonHardAgendar).setOnClickListener {
            val action = HardCadastroDirections.actionHardCadastroToHardAgendamento(
                "${nome.text}",
                "${endereco.text}",
                "${data.text}",
                "${time.text}",
                "${description.text}",

            )

            findNavController().navigate(action)

        }
    }
}