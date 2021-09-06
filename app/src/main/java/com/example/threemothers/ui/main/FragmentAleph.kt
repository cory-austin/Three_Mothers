package com.example.threemothers.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.threemothers.R
import com.example.threemothers.databinding.FragmentAlephBinding
import com.example.threemothers.databinding.FragmentMemBinding


class FragmentAleph : Fragment() {

    private var _binding: FragmentAlephBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAlephBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance(): FragmentAleph = FragmentAleph()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.frameLayout.setOnClickListener { handleClick() }
    }

    private fun handleClick() {
        if (binding.frameLayout.alpha.equals(1F)) {
            binding.frameLayout.alpha = 0F
        } else {
            binding.frameLayout.alpha = 1F
        }
    }
}