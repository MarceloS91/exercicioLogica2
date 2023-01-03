package com.example.exercicioagendamento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class MediumCadastro : Fragment(R.layout.fragment_medium_cadastro) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val nome = view.findViewById<EditText>(R.id.mediumNome)

    val endereco = view.findViewById<EditText>(R.id.mediumEndereco)

    //       val radioButton = view.findViewById<RadioButton>(R.id.radioButtonGrade)//

    val data = view.findViewById<EditText>(R.id.mediumDate)

    val time = view.findViewById<EditText>(R.id.mediumTime)

    val description = view.findViewById<EditText>(R.id.mediumDescription)

    view.findViewById<Button>(R.id.buttonMediumAgendar).setOnClickListener {
        val action = MediumCadastroDirections.actionMediumCadastroToMediumAgendamento(
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