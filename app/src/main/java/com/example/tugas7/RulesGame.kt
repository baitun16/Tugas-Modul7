package com.example.tugas7

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.fragment.app.Fragment

class RulesGame : Fragment (){
    override fun onCreateView(inflater: LayoutInflater, container : ViewGroup?, savedInstanceState: Bundle?)
        = inflater.inflate(R.layout.rules1, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        view.findViewById<Button>(R.id.next).setOnClickListener{ view.findNavController()
            .navigate(R.id.action_rulesFragment_to_gameFragment)
        }
    }
}