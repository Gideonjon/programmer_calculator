package com.example.currency

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.currency.databinding.FragmentSplashBinding


class splash : Fragment() {
  private var _binding : FragmentSplashBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSplashBinding.inflate(inflater,container,false)
        val view = binding.root

        Handler().postDelayed({
            Navigation.findNavController(view).navigate(R.id.action_splash_to_screen2)
        },3000)


        return view
    }

}