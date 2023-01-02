package com.example.exercicioagendamento

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.exercicioagendamento.databinding.ActivityMainBinding
import com.example.exercicioagendamento.databinding.ActivityMainBinding.inflate

class FirstScreen : Fragment(R.layout.first_screen) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonLogin).setOnClickListener {
            findNavController().navigate(R.id.actionTela1ParaTela2)
        }
        view.findViewById<Button>(R.id.buttonCadastrar).setOnClickListener {
            findNavController().navigate(R.id.actionTela1ParaTela3)
        }

    }

}

