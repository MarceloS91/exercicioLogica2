package com.example.exercicioagendamento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class MediumAgendamento : Fragment(R.layout.fragment_medium_agendamento) {

    private val args: MediumAgendamentoArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var nomeSchedule = view.findViewById<TextView>(R.id.nomeMedium)

        var enderecoSchedule = view.findViewById<TextView>(R.id.enderecoMedium)

        var dataSchedule = view.findViewById<TextView>(R.id.dataMedium)

        var timeSchedule = view.findViewById<TextView>(R.id.horarioMedium)

        var descricaoSchedule = view.findViewById<TextView>(R.id.descricaoMedium)

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
