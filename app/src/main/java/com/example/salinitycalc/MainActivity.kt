package com.example.salinitycalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_MESSAGE = "com.example.salinitycalc.MESSAGE"
//var num = 0
var numTemp: Double = 0.0
var preOder =""
var nStr = ""
var nowInput = true

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //数字ボタン
        button0.setOnClickListener{
            if (nowInput == false) {
                nStr = ""
                nowInput = true
            }
            nStr = format((nStr + "0").toDouble())
            formula.text = nStr
        }
        button1.setOnClickListener{
            if (nowInput == false) {
                nStr = ""
                nowInput = true
            }
            nStr = format((nStr + "1").toDouble())
            formula.text = nStr
        }

        button2.setOnClickListener{
            if (nowInput == false) {
                nStr = ""
                nowInput = true
            }
            nStr = format((nStr + "2").toDouble())
            formula.text = nStr
        }
        button3.setOnClickListener {
            if (nowInput == false) {
                nStr = ""
                nowInput = true
            }
            nStr = format((nStr + "3").toDouble())
            formula.text = nStr
        }
        button4.setOnClickListener{
            if (nowInput == false) {
                nStr = ""
                nowInput = true
            }
            nStr = format((nStr + "4").toDouble())
            formula.text = nStr
        }
        button5.setOnClickListener{
            if (nowInput == false) {
                nStr = ""
                nowInput = true
            }
            nStr = format((nStr + "5").toDouble())
            formula.text = nStr
        }
        button6.setOnClickListener{
            if (nowInput == false) {
                nStr = ""
                nowInput = true
            }
            nStr = format((nStr + "2").toDouble())
            nStr = ((nStr + "6").toDouble()).toString()
            formula.text = nStr
        }
        button7.setOnClickListener{
            if (nowInput == false) {
                nStr = ""
                nowInput = true
            }
            nStr = format((nStr + "7").toDouble())
            formula.text = nStr
        }
        button8.setOnClickListener{
            if (nowInput == false) {
                nStr = ""
                nowInput = true
            }
            nStr = format((nStr + "8").toDouble())
            formula.text = nStr
        }
        button9.setOnClickListener{
            if (nowInput == false) {
                nStr = ""
                nowInput = true
            }
            nStr = format((nStr + "9").toDouble())
            formula.text = nStr
        }

        button_Dot.setOnClickListener {
            // まだ
            if (nowInput == false) {
                formula.text = ""
                nowInput = true
            }
            formula.text = (("${formula.text}.".toString()).toDouble()).toString()
        }

        //計算ボタン
        button_Add.setOnClickListener{
            formula.text = arithmetic_Operations()
            preOder = "+"
        }

        button_Sum.setOnClickListener{
            formula.text = arithmetic_Operations()
            preOder = "-"
        }

        button_Multi.setOnClickListener{
            formula.text = arithmetic_Operations()
            preOder = "*"
        }

        button_Div.setOnClickListener{
            formula.text = arithmetic_Operations()
            preOder = "/"
        }

        button_Equal.setOnClickListener{
            formula.text = arithmetic_Operations()
            preOder = ""
        }

        button_AC.setOnClickListener{
            formula.text = "0"
            nStr = "0"
            numTemp = 0.0
            preOder = ""
            nowInput = true
        }
    }
}


fun arithmetic_Operations(): String{
    if (nowInput == true) {
        when(preOder) {
            "+"-> nStr = format(numTemp + nStr.toDouble())
            "-"-> nStr = format(numTemp - nStr.toDouble())
            "*"-> nStr = format(numTemp * nStr.toDouble())
            "/"-> nStr = format(numTemp / nStr.toDouble())
        }
    }
    numTemp = nStr.toDouble()
    nowInput = false
    return nStr
}

fun format(d: Double): String {
    if (d == d.toInt().toDouble()) {
        return String.format("%d", d.toInt())
    }
    else {
        return String.format("%s", d)
    }
}