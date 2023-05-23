package com.example.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kalkulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btTmbh.setOnClickListener(){
            tambah()
        }
        binding.btKrg.setOnClickListener(){
            kurang()
        }
        binding.btKli.setOnClickListener(){
            perkalian()
        }
        binding.btBgi.setOnClickListener(){
            pembagian()
        }
        binding.btClr.setOnClickListener(){
            clear()
        }
        setContentView(binding.root)
    }
    private fun clear(){
        binding.etAngka1.text.clear()
        binding.etAngka2.text.clear()
        binding.tvHasil.text ="Hasil"
    }
    private fun tambah(){
        var input1 =binding.etAngka1.text.toString().toInt()
        var input2 = binding.etAngka2.text.toString().toInt()
        var hasil =input1 + input2
        var jumlah = "$input1 + $input2 = $hasil"
        binding.tvHasil.text = jumlah
    }
    private fun kurang(){
        var input1 =binding.etAngka1.text.toString().toInt()
        var input2 = binding.etAngka2.text.toString().toInt()
        var hasil =input1 - input2
        var jumlah = "$input1 - $input2 = $hasil"
        binding.tvHasil.text = jumlah
    }
    private fun perkalian(){
        var input1 =binding.etAngka1.text.toString().toInt()
        var input2 = binding.etAngka2.text.toString().toInt()
        var hasil =input1 * input2
        var jumlah = "$input1 * $input2 = $hasil"
        binding.tvHasil.text = jumlah
    }
    private fun pembagian(){
        var input1 =binding.etAngka1.text.toString().toDouble()
        var input2 = binding.etAngka2.text.toString().toDouble()
        var hasil =input1 / input2
        var jumlah = "$input1 / $input2 = $hasil"
        binding.tvHasil.text = jumlah
    }
}