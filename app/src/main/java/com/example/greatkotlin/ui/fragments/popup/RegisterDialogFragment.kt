package com.example.greatkotlin.ui.fragments.popup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.greatkotlin.R
import com.google.android.material.button.MaterialButton

class RegisterDialogFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        val username = view.findViewById<EditText>(R.id.username)
        val fullName = view.findViewById<EditText>(R.id.fullName)
        val email = view.findViewById<EditText>(R.id.email)
        val address = view.findViewById<EditText>(R.id.address)
        val password = view.findViewById<EditText>(R.id.passwordRegister)
        val confirmPassword = view.findViewById<EditText>(R.id.confirmPassword)
        val buttonRegister = view.findViewById<MaterialButton>(R.id.submitButton)
        val buttonCancel = view.findViewById<MaterialButton>(R.id.cancelButton)

        buttonCancel.setOnClickListener{
            dismiss()
        }

        buttonRegister.setOnClickListener {
            val usernameText = username.text.toString().trim()
            val fullNameText = fullName.text.toString().trim()
            val emailText = email.text.toString().trim()
            val addressText = address.text.toString().trim()
            val passwordText = password.text.toString().trim()
            val confirmPasswordText = confirmPassword.text.toString().trim()

            if (usernameText.isEmpty() || fullNameText.isEmpty() || emailText.isEmpty() || addressText.isEmpty() || passwordText.isEmpty() || confirmPasswordText.isEmpty()) {
                Toast.makeText(requireContext(), "Fill All Required", Toast.LENGTH_SHORT).show()
            } else {
                if (passwordText != confirmPasswordText) {
                    Toast.makeText(requireContext(), "Password Mismatch", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(requireContext(), "Successful Submit", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
