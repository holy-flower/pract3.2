package com.example.pract32

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewConfiguration
import android.view.ViewGroup
import android.widget.Button
import com.example.pract32.databinding.ActivityMainBinding
import com.example.pract32.databinding.FragmentSecondBinding
import com.example.pract32.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        view.findViewById<Button>(R.id.buttonBack).setOnClickListener {
            (activity as MainActivity).navigateBack()
        }
        return view
    }
}