package com.example.a40fragmentnavigatedemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ThankyouFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_thankyou, container, false)

        val tv :TextView = view.findViewById(R.id.tvResult)

        val args = ThankyouFragmentArgs.fromBundle((requireArguments()))
        tv.text = "Your score : " + String.format("%.2f",args.percentage) + "%"

        return view
    }
}