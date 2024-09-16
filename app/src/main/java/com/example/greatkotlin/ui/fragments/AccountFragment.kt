package com.example.greatkotlin.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.greatkotlin.R
import com.google.android.material.button.MaterialButton

class AccountFragment:Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val buttonLogin = view.findViewById<MaterialButton>(R.id.Login)
        val buttonRegister = view.findViewById<MaterialButton>(R.id.Register)


        buttonLogin.setOnClickListener{
            val loginDialog = LoginDialogFragment()
            loginDialog.show(parentFragmentManager, "loginDialog")
        }
        buttonRegister.setOnClickListener{
            val loginDialog = RegisterDialogFragment()
            loginDialog.show(parentFragmentManager, "RegisterDialog")
        }

    }
}