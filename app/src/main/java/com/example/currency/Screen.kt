package com.example.currency

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.currency.databinding.FragmentScreenBinding
import com.example.currency.databinding.FragmentSplashBinding

class Screen : Fragment() {
    private var _binding: FragmentScreenBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,


        ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentScreenBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnBinary.setOnClickListener {
            binary()
        }
        binding.btnErase.setOnClickListener {
            erase()
        }
        binding.hexadecimal.setOnClickListener {
            hexaDecimal()
        }
        binding.btnDecimal.setOnClickListener {
            Toast.makeText(context, "Keep calm", Toast.LENGTH_SHORT).show()
        }
        binding.btnOctal.setOnClickListener {
            octal()
        }

        return view
    }

    private fun binary() {
        val num = binding.number.text.toString()
        val i = Integer.parseInt(num)
        val binary = Integer.toBinaryString(i)
        binding.textNumber.text = binary.toString()
    }

    private fun erase() {
        val text = 0
        binding.textNumber.text = text.toString()

        binding.number.setText("")
    }

    private fun octal() {
        val num = binding.number.text.toString()
        val i = Integer.parseInt(num)
        val octal = Integer.toOctalString(i)
        binding.textNumber.text = octal.toString()
    }

    private fun hexaDecimal() {
        val num = binding.number.text.toString()
        val i = Integer.parseInt(num)
        val hexa = Integer.toHexString(i)
        binding.textNumber.text = hexa.toString()
    }


}

