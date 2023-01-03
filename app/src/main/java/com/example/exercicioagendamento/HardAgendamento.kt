package com.example.exercicioagendamento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class HardAgendamento : Fragment(R.layout.fragment_hard_agendamento) {

    private val args: HardAgendamentoArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var nomeSchedule = view.findViewById<TextView>(R.id.nomeDificil)

        var enderecoSchedule = view.findViewById<TextView>(R.id.enderecoDificil)

        var dataSchedule = view.findViewById<TextView>(R.id.dataDificil)

        var timeSchedule = view.findViewById<TextView>(R.id.horarioDificil)

        var descricaoSchedule = view.findViewById<TextView>(R.id.descricaoDificil)

        /*var radioSchedule = view.findViewById<RadioButton>(R.id.radioButtonEasy)nomeSchedule*/


//        nomeSchedule.text = args.nome as Editable

        nomeSchedule.setText(args.nome)
        enderecoSchedule.setText(args.endereco)
        dataSchedule.setText(args.date)
        timeSchedule.setText(args.time)
        descricaoSchedule.setText(args.description)

/*        radioSchedule.setText(args.radio)*/
    }
}