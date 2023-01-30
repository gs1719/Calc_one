package com.example.calcui1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPlus.setOnClickListener {
        tvResult.text= (intValues(etInput1)+intValues(etInput2)).toString()

        }
            btnMinus.setOnClickListener {
        tvResult.text= (intValues(etInput1)-intValues(etInput2)).toString()

        }
        btnDivision.setOnClickListener {
            btnAnimate(btnDivision)
            if (intValues(etInput2) == 0) {
                tvResult.text = "Divide by zero"
            } else {
                tvResult.text = (intValues(etInput1) / intValues(etInput2)).toString()
            }
        }
        btnMultiply.setOnClickListener {
        tvResult.text= (intValues(etInput1)*intValues(etInput2)).toString()

        }
    }

    private fun intValues(x:EditText): Int {
     return x.text.toString().toInt();
    }
}