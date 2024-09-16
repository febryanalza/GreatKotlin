package com.example.greatkotlin.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.greatkotlin.R
import com.example.greatkotlin.utils.FailLogin

class RegisterDialogFragment : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register_dialog, container, false)
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        val etusername = view.findViewById<EditText>(R.id.usernamelogin)
//        val etpassword = view.findViewById<EditText>(R.id.passwordlogin)
//        val buttonLogin = view.findViewById<Button>(R.id.buttonLogin)
//        val forgotPassword = view.findViewById<EditText>(R.id.forgotPassword)
//
//        forgotPassword.setOnClickListener{
//            Toast.makeText(requireContext(), "HAHAHA, GOBLOKK", Toast.LENGTH_SHORT).show()
//        }
//        buttonLogin.setOnClickListener{
//            val username = etusername.text.toString()
//            val password = etpassword.text.toString()
//
//            if(username == "user123" && password == "1234"){
//                dismiss()
//            }else{
//                FailLogin.showAlertDialog(
//                    requireContext(),
//                    "Can't Login",
//                    "Make sure your username and password is correct",
//                    onPositifClick = {
//                        dismiss()
//                    }
//
//                )
//            }
//        }
//
//    }

}