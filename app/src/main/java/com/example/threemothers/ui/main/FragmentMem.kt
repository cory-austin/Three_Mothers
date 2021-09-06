package com.example.threemothers.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import com.example.threemothers.R
import com.example.threemothers.databinding.FragmentMemBinding



class FragmentMem : Fragment() {

    private var _binding: FragmentMemBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.frameLayout2.setOnClickListener { handleClick() }
    }

    private fun handleClick() {
        if (binding.frameLayout2.alpha.equals(1F)) {
            binding.frameLayout2.alpha = 0F
        } else {
            binding.frameLayout2.alpha = 1F
        }
    }

    companion object {
        fun newInstance(): FragmentMem = FragmentMem()
    }




}