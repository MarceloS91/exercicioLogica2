package com.example.exercicioagendamento

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import org.w3c.dom.Text

class FifthScreen : Fragment(R.layout.fragment_fifth_screen) {


    private val args : FifthScreenArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textViewReceberNome).text = "${args.nickname}"

        view.findViewById<ImageView>(R.id.buttonEasy).setOnClickListener{
            findNavController().navigate(R.id.actionTela4ParaEasy)
        }

        view.findViewById<ImageView>(R.id.buttonMedium).setOnClickListener{
            findNavController().navigate(R.id.actionTela4ParaMedium)
        }
        view.findViewById<ImageView>(R.id.buttonHard).setOnClickListener{
            findNavController().navigate(R.id.actionTela4ParaHard)
        }
    }
}