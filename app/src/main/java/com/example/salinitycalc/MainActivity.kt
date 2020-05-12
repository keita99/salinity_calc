package com.example.salinitycalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_MESSAGE = "com.example.salinitycalc.MESSAGE"
//var num = 0
var numTemp = 0
var preOder =""
//var nStr = ""
var nowInput = true

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //数字ボタン
        button0.setOnClickListener{
            if (nowInput == false) {
                formula.text = ""
                nowInput = true
            }
            formula.text = (("${formula.text}0".toString()).toInt()).toString()
        }
        button1.setOnClickListener{
            if (nowInput == false) {
                formula.text = ""
                nowInput = true
            }
            formula.text = (("${formula.text}1".toString()).toInt()).toString()
        }
        button2.setOnClickListener{
            if (nowInput == false) {
                formula.text = ""
                nowInput = true
            }
            formula.text = (("${formula.text}2".toString()).toInt()).toString()
        }
        button3.setOnClickListener{
            if (nowInput == false) {
                formula.text = ""
                nowInput = true
            }
            formula.text = (("${formula.text}3".toString()).toInt()).toString()
        }
        button4.setOnClickListener{
            if (nowInput == false) {
                formula.text = ""
                nowInput = true
            }
            formula.text = (("${formula.text}4".toString()).toInt()).toString()
        }
        button5.setOnClickListener{
            if (nowInput == false) {
                formula.text = ""
                nowInput = true
            }
            formula.text = (("${formula.text}5".toString()).toInt()).toString()
        }
        button6.setOnClickListener{
            if (nowInput == false) {
                formula.text = ""
                nowInput = true
            }
            formula.text = (("${formula.text}6".toString()).toInt()).toString()
        }
        button7.setOnClickListener{
            if (nowInput == false) {
                formula.text = ""
                nowInput = true
            }
            formula.text = (("${formula.text}7".toString()).toInt()).toString()
        }
        button8.setOnClickListener{
            if (nowInput == false) {
                formula.text = ""
                nowInput = true
            }
            formula.text = (("${formula.text}8".toString()).toInt()).toString()
        }
        button9.setOnClickListener{
            if (nowInput == false) {
                formula.text = ""
                nowInput = true
            }
            formula.text = (("${formula.text}9".toString()).toInt()).toString()
        }

        //計算ボタン
        button_Add.setOnClickListener{
            if (nowInput == true) {
//                formula.text = (arithmetic_Operations(formula.text.toString().toInt())).toString()
                when(preOder) {
                    "+"-> formula.text = (numTemp + formula.text.toString().toInt()).toString()
                    "-"-> formula.text = (numTemp - formula.text.toString().toInt()).toString()
                    "*"-> formula.text = (numTemp * formula.text.toString().toInt()).toString()
                    "/"-> formula.text = (numTemp / formula.text.toString().toInt()).toString()
                }
            }
            numTemp = formula.text.toString().toInt()
            preOder = "+"
            nowInput = false
        }

        button_Sum.setOnClickListener{
            if (nowInput == true) {
//                formula.text = (arithmetic_Operations(formula.text.toString().toInt())).toString()
                when(preOder) {
                    "+"-> formula.text = (numTemp + formula.text.toString().toInt()).toString()
                    "-"-> formula.text = (numTemp - formula.text.toString().toInt()).toString()
                    "*"-> formula.text = (numTemp * formula.text.toString().toInt()).toString()
                    "/"-> formula.text = (numTemp / formula.text.toString().toInt()).toString()
                }
            }
            numTemp = formula.text.toString().toInt()
            preOder = "-"
            nowInput = false
        }

        button_Multi.setOnClickListener{
            if (nowInput == true) {
//                formula.text = (arithmetic_Operations(formula.text.toString().toInt())).toString()
                when(preOder) {
                    "+"-> formula.text = (numTemp + formula.text.toString().toInt()).toString()
                    "-"-> formula.text = (numTemp - formula.text.toString().toInt()).toString()
                    "*"-> formula.text = (numTemp * formula.text.toString().toInt()).toString()
                    "/"-> formula.text = (numTemp / formula.text.toString().toInt()).toString()
                }
            }
            numTemp = formula.text.toString().toInt()
            preOder = "*"
            nowInput = false
        }

        button_Div.setOnClickListener{
            if (nowInput == true) {
//                formula.text = (arithmetic_Operations(formula.text.toString().toInt())).toString()
                when(preOder) {
                    "+"-> formula.text = (numTemp + formula.text.toString().toInt()).toString()
                    "-"-> formula.text = (numTemp - formula.text.toString().toInt()).toString()
                    "*"-> formula.text = (numTemp * formula.text.toString().toInt()).toString()
                    "/"-> formula.text = (numTemp / formula.text.toString().toInt()).toString()
                }
            }
            numTemp = formula.text.toString().toInt()
            preOder = "/"
            nowInput = false
        }

        button_Equal.setOnClickListener{
            if (nowInput == true) {
//                formula.text = (arithmetic_Operations(formula.text.toString().toInt())).toString()
                when(preOder) {
                    "+"-> formula.text = (numTemp + formula.text.toString().toInt()).toString()
                    "-"-> formula.text = (numTemp - formula.text.toString().toInt()).toString()
                    "*"-> formula.text = (numTemp * formula.text.toString().toInt()).toString()
                    "/"-> formula.text = (numTemp / formula.text.toString().toInt()).toString()
                }
            }
            numTemp = formula.textAlignment.toString().toInt()
            preOder = ""
            nowInput = false
        }

        button_AC.setOnClickListener{
            formula.text = "0"
            numTemp = 0
            preOder = ""
            nowInput = true
        }
    }
}


fun arithmetic_Operations(num: Int):Int {
    var ret = 0
    when (preOder) {
        "+" -> ret = num + numTemp
        "-" -> ret =  num - numTemp
        "*" -> ret =  num * numTemp
        "/" -> ret = num / numTemp
    }
    return ret
}