package com.example.pract32

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.pract32.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        view.findViewById<Button>(R.id.buttonNext).setOnClickListener {
            (activity as MainActivity).navigateToFragment(ThirdFragment())
        }

        view.findViewById<Button>(R.id.buttonBack).setOnClickListener {
            (activity as MainActivity).navigateBack()
        }
        return view
    }
}