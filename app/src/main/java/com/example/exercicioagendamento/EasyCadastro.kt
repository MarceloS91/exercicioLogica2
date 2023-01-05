package com.example.exercicioagendamento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_easy_cadastro.*


class EasyCadastro : Fragment(R.layout.fragment_easy_cadastro) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nome = view.findViewById<EditText>(R.id.editTextEasyNome)

        val endereco = view.findViewById<EditText>(R.id.editTextEasyEndereco)

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
            )

            findNavController().navigate(action)

        }
    }
}

/*  when {
          view.findViewById<RadioButton>(R.id.radioButtonEasyManha).isChecked ->
              view.findViewById<Button>(R.id.buttonEasyAgendar).setOnClickListener {
                  view.findViewById<TextView>(R.id.textRadioButton).setText("Manhã")
              }
            }*/

/*   fun (){
       val periodo = view.findViewById<RadioGroup>(R.id.radioButtonGrade)

       when {
           view.findViewById<RadioButton>(R.id.radioButtonEasyManha).isChecked ->
              view.findViewById<Button>(R.id.buttonEasyAgendar).setOnClickListener {
                  view.findViewById<TextView>(R.id.textRadioButton).setText("Manhã")
         *//*         view.findViewById<TextView>(R.id.textRadioButton).text = periodo*//*
                       }
                    }
                 }*/

/*"${radioButton.}"*/




