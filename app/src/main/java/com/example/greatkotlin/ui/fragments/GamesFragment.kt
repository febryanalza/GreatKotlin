package com.example.greatkotlin.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.greatkotlin.R
import com.example.greatkotlin.utils.DialogHelper

class GamesFragment:Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_games, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        DialogHelper.showAlertDialog(
            requireContext(),
            parentFragmentManager,
            "SORRY",
            "This page Under Maintenence",
            onPositifClick = {
                goBackToPreviousFragment()
            }
        )
    }
    private fun goBackToPreviousFragment(){
        childFragmentManager.popBackStack()
    }
}