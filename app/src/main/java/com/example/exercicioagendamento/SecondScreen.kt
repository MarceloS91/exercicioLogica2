package com.example.exercicioagendamento

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class SecondScreen : Fragment(R.layout.fragment_second_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<ImageView>(R.id.buttonLogin).setOnClickListener {

            var login = view?.findViewById<EditText>(R.id.editTextNomeUsuarioLogin)?.text.toString()
            var password = view?.findViewById<EditText>(R.id.editTextSenhaLogin)?.text.toString()

            if (login == "fulanin" && password == "fulanin") {

                val nickname = view.findViewById<EditText>(R.id.editTextNomeUsuarioLogin)

                val action = SecondScreenDirections.actionTela2ParaTela4(
                    "${nickname.text}")

                findNavController().navigate(action)

            } else {
                view?.findViewById<EditText>(R.id.editTextNomeUsuarioLogin)?.text?.clear()
                view?.findViewById<EditText>(R.id.editTextSenhaLogin)?.text?.clear()
                Toast.makeText(getActivity(), "Login/Senha incorretos", Toast.LENGTH_SHORT).show()
            }

//            findNavController().navigate(action)

        }
    }

    fun loginValidation (login: String, password: String): Boolean {
        val sharedPrefEmail =
            activity?.getSharedPreferences("sharedPreferencesFile", Context.MODE_PRIVATE)
                ?.getString("email", null)
        val sharedPrefPassword =
            activity?.getSharedPreferences("sharedPreferencesFile", Context.MODE_PRIVATE)
                ?.getString("password", null)

        return login == sharedPrefEmail && password == sharedPrefPassword
    }
}

/* fun loginValidation(login: String, password: String): Boolean {
       val data = args.nickname

       return == data[11] && password == data[12]*/