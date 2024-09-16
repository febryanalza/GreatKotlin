package com.example.greatkotlin.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.greatkotlin.R
import com.example.greatkotlin.utils.FailLogin
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class LoginDialogFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        val etusername = view.findViewById<TextInputEditText>(R.id.usernamelogin)
        val etpassword = view.findViewById<TextInputEditText>(R.id.passwordlogin)
        val buttonLogin = view.findViewById<MaterialButton>(R.id.buttonLogin)
        val forgotPassword = view.findViewById<TextView>(R.id.forgotPassword)
        val backButton = view.findViewById<ImageView>(R.id.BackButton)

        forgotPassword.setOnClickListener{
            Toast.makeText(requireContext(), "HAHAHA, GOBLOKK, \nNAMBAH KERJAAN AJA", Toast.LENGTH_SHORT).show()
        }
        backButton.setOnClickListener{
            dismiss()
        }
        buttonLogin.setOnClickListener{
            val username = etusername.text.toString()
            val password = etpassword.text.toString()

            if(username == "user123" && password == "1234"){
                dismiss()
            }else{
                FailLogin.showAlertDialog(
                    requireContext(),
                    "Can't Login",
                    "Make sure your username and password is correct",
                    onPositifClick = {
                        dismiss()
                    }

                )
            }
        }

    }

}