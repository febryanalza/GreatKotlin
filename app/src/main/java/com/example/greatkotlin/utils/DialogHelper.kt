package com.example.greatkotlin.utils

import android.content.Context
import android.content.LocusId
import android.graphics.drawable.Icon
import android.widget.EditText
import androidx.appcompat.widget.DialogTitle
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
import androidx.core.app.NotificationCompat.MessagingStyle.Message
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import androidx.fragment.app.FragmentManager

object DialogHelper{
    fun showAlertDialog(
        context: Context,
        fragment: FragmentManager,
        title: String,
        message: String,
        positiveButtonText: String = "OK",
        onPositifClick: ()-> Unit ={}
    ){
        MaterialAlertDialogBuilder(context)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton(positiveButtonText){dialog, _ ->
                onPositifClick()
                dialog.dismiss()
            }.show()
    }
}