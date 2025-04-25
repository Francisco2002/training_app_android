package com.daily.bases.trainingapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.daily.bases.trainingapp.R
import com.daily.bases.trainingapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.txtGreeting
        val name = "Francisco"
        val greeting = getString(R.string.greeting, name)

        textView.text = greeting

        val trainingRange: TextView = binding.txtTrainingRange
        val range = "01/01/2025 - 01/04/2025"
        val rangeString = getString(R.string.training_range_message, range)

        trainingRange.text = rangeString
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}