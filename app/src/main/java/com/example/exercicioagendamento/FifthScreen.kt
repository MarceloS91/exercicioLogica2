package com.example.exercicioagendamento

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
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

   /*         var login = view?.findViewById<EditText>(R.id.editTextNomeUsuarioLogin)?.text.toString()
            var password = view?.findViewById<EditText>(R.id.editTextSenhaLogin)?.text.toString()

            if (loginValidation(login, password)) {
                findNavController().navigate(R.id.actionTela2ParaTela4)
            }
            else {
                view?.findViewById<EditText>(R.id.editTextNomeUsuarioLogin)?.text?.clear()
                view?.findViewById<EditText>(R.id.editTextSenhaLogin)?.text?.clear()
                Toast.makeText(getActivity(), "Login/Senha incorretos", Toast.LENGTH_SHORT).show()
            }*/

        }
        view.findViewById<ImageView>(R.id.buttonMedium).setOnClickListener{
            findNavController().navigate(R.id.actionTela4ParaMedium)
        }
        view.findViewById<ImageView>(R.id.buttonHard).setOnClickListener{
            findNavController().navigate(R.id.actionTela4ParaHard)
        }
    }

    /*fun loginValidation(login: String, password: String): Boolean {
        val sharedPrefEmail = activity?.getSharedPreferences("sharedPreferencesFile", Context.MODE_PRIVATE)?.getString("email", null)
        val sharedPrefPassword = activity?.getSharedPreferences("sharedPreferencesFile", Context.MODE_PRIVATE)?.getString("password", null)

        return login == sharedPrefEmail && password == sharedPrefPassword*/


   /* fun loginValidation(login: String, password: String): Boolean {
        val data = args.nickname

        return == data[11] && password == data[12]*/
    }
