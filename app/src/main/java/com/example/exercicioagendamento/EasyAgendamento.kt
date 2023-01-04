package com.example.exercicioagendamento

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class EasyAgendamento : Fragment(R.layout.fragment_easy_agendamento) {

    private val args: EasyAgendamentoArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var nomeSchedule = view.findViewById<TextView>(R.id.nomeAgendamentoEasy)

        var enderecoSchedule = view.findViewById<TextView>(R.id.enderecoAgendamentEasy)

        var dataSchedule = view.findViewById<TextView>(R.id.dataEasy)

        var timeSchedule = view.findViewById<TextView>(R.id.horarioEasy)

        var descricaoSchedule = view.findViewById<TextView>(R.id.descricaoEasy)

        var radioSchedule = view.findViewById<TextView>(R.id.textRadioButton)

//        nomeSchedule.text = args.nome as Editable

        nomeSchedule.setText(args.nome)
        enderecoSchedule.setText(args.endereco)
        dataSchedule.setText(args.date)
        timeSchedule.setText(args.time)
        descricaoSchedule.setText(args.description)


/*        radioSchedule.setText(args.radio)*/

        view.findViewById<Button>(R.id.buttonEasyConcluido).setOnClickListener{
            findNavController().navigate(R.id.actionEasyParaAgendamentoConcluido)
        }
    }
}

