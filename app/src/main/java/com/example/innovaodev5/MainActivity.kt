package com.example.innovaodev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.innovaodev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim: ActivityMainBinding
    private val numberList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        tasarim = DataBindingUtil.setContentView(this,R.layout.activity_main)
        tasarim.mainActivity = this

        tasarim.sifir.setOnClickListener {
            if(!bindNumbers(tasarim.sifirText.text.toString())) {
                numberList.add(tasarim.sifirText.text.toString())
            }
            tasarim.sonuc.text = "${tasarim.sonuc.text}${tasarim.sifirText.text}"
        }

        tasarim.bir.setOnClickListener {

            if(!bindNumbers(tasarim.birText.text.toString())) {
                numberList.add(tasarim.birText.text.toString())
            }

            tasarim.sonuc.text = "${tasarim.sonuc.text}${tasarim.birText.text}"
        }

        tasarim.iki.setOnClickListener {
            if(!bindNumbers(tasarim.ikiText.text.toString())) {
                numberList.add(tasarim.ikiText.text.toString())
            }
            tasarim.sonuc.text = "${tasarim.sonuc.text}${tasarim.ikiText.text}"
        }

        tasarim.uc.setOnClickListener {
            if(!bindNumbers(tasarim.ucText.text.toString())) {
                numberList.add(tasarim.ucText.text.toString())
            }
            tasarim.sonuc.text = "${tasarim.sonuc.text}${tasarim.ucText.text}"
        }

        tasarim.dort.setOnClickListener {
            if(!bindNumbers(tasarim.dortText.text.toString())) {
                numberList.add(tasarim.dortText.text.toString())
            }
            tasarim.sonuc.text = "${tasarim.sonuc.text}${tasarim.dortText.text}"
        }

        tasarim.bes.setOnClickListener {
            if(!bindNumbers(tasarim.besText.text.toString())) {
                numberList.add(tasarim.besText.text.toString())
            }
            tasarim.sonuc.text = "${tasarim.sonuc.text}${tasarim.besText.text}"
        }

        tasarim.alti.setOnClickListener {
            if(!bindNumbers(tasarim.altiText.text.toString())) {
                numberList.add(tasarim.altiText.text.toString())
            }
            tasarim.sonuc.text = "${tasarim.sonuc.text}${tasarim.altiText.text}"
        }

        tasarim.yedi.setOnClickListener {
            if(!bindNumbers(tasarim.yediText.text.toString())) {
                numberList.add(tasarim.yediText.text.toString())
            }
            tasarim.sonuc.text = "${tasarim.sonuc.text}${tasarim.yediText.text}"
        }

        tasarim.sekiz.setOnClickListener {
            if(!bindNumbers(tasarim.sekizText.text.toString())) {
                numberList.add(tasarim.sekizText.text.toString())
            }
            tasarim.sonuc.text = "${tasarim.sonuc.text}${tasarim.sekizText.text}"
        }

        tasarim.dokuz.setOnClickListener {
            if(!bindNumbers(tasarim.dokuzText.text.toString())) {
                numberList.add(tasarim.dokuzText.text.toString())
            }
            tasarim.sonuc.text = "${tasarim.sonuc.text}${tasarim.dokuzText.text}"
        }

        tasarim.toplama.setOnClickListener {
            tasarim.sonuc.text = "${tasarim.sonuc.text}+"
        }

        tasarim.esittir.setOnClickListener {
            toplama(numberList)
            numberList.clear()

        }

        tasarim.delete.setOnClickListener {
            numberList.clear()
            tasarim.result = ""
        }

    }

    private fun toplama(list: List<String>) {

        val numberListDouble = arrayListOf<Double>()
        list.forEach {
            numberListDouble.add(it.toDouble())
        }
        val sumNumbers = numberListDouble.sum()
        tasarim.result = sumNumbers.toString()

    }


    private fun bindNumbers(addNumber: String): Boolean {

        return if(tasarim.sonuc.text.isNotEmpty() && tasarim.sonuc.text.last() != '+') {
            val bindedNumber = numberList.last() + addNumber
            numberList.removeLast()
            numberList.add(bindedNumber)
            true
        } else {
            false
        }

    }
}