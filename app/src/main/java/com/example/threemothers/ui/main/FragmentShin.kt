package com.example.threemothers.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.threemothers.R
import com.example.threemothers.databinding.FragmentAlephBinding
import com.example.threemothers.databinding.FragmentShinBinding


class FragmentShin : Fragment() {


    private var _binding: FragmentShinBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentShinBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.frameLayout3.setOnClickListener { handleClick() }
    }


    private fun handleClick() {
        if (binding.frameLayout3.alpha.equals(1F)) {
            binding.frameLayout3.alpha = 0F
        } else {
            binding.frameLayout3.alpha = 1F
        }
    }

    companion object {
        fun newInstance(): FragmentShin = FragmentShin()
    }
}