package com.example.calcui1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPressed()
    }

    private fun intValues(x: EditText): Int {
        return try {
            x.text.toString().toInt()
        } catch (e: Exception) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show()
            0
        }
    }


    private fun btnAnimate(y: Button) {
        //Set button alpha to zero
        y.alpha = 0f

        //Animate the alpha value to 1f and set duration as 1.5 secs.
        y.animate().alpha(1f).duration = 500
    }

    private fun btnPressed() {
        btnPlus.setOnClickListener {
            tvResult.text = (intValues(etInput1) + intValues(etInput2)).toString()
            btnAnimate(btnPlus)
        }
        btnMinus.setOnClickListener {
            tvResult.text = (intValues(etInput1) - intValues(etInput2)).toString()
            btnAnimate(btnMinus)
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
            tvResult.text = (intValues(etInput1) * intValues(etInput2)).toString()
            btnAnimate(btnMultiply)
        }
    }
}
