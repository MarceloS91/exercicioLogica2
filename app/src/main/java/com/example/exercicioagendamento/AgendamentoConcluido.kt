package com.example.exercicioagendamento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class AgendamentoConcluido : Fragment(R.layout.fragment_agendamento_concluido) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<ImageView>(R.id.buttonAgendamentoConcluido).setOnClickListener {
            findNavController().navigate(R.id.actionAgendamentoConcluidoTohistoricoAgendamentos)

        view.findViewById<TextView>(R.id.textViewAgendamentoConcluido).setOnClickListener {
            findNavController().navigate(R.id.actionAgendamentoConcluidoTohistoricoAgendamentos)

            }
        }
    }
}
