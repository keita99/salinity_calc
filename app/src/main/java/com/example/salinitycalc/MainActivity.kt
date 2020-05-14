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
            nStr = nStr + "0"
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
            nStr = format((nStr + "5").toDouble())
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
            if (nowInput == false) {
                nStr = "0"
                formula.text = "0"
                nowInput = true
            }
            //文字列にドットがなければ
            if (nStr.indexOf(".") == -1 ) {
                nStr = nStr + "."
                formula.text = nStr
            }
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
        button_C.setOnClickListener{
            formula.text = "0"
            nStr = "0"
        }

        //調味料ボタン
        //塩
        button_Flavor1.setOnClickListener{
            numTemp = nStr.toDouble()
            preOder = "*"
            nStr = "0.006" //塩分濃度0.6%（ハードコード）
            formula.text = arithmetic_Operations()
            preOder = ""
        }
        //醤油
        button_Flavor2.setOnClickListener{
            numTemp = nStr.toDouble()
            preOder = "*"
            nStr = "0.0375" //塩分濃度3.75%（ハードコード）
            formula.text = arithmetic_Operations()
            preOder = ""
        }
    }
}

//四則演算
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

//doubleの末尾の０を消してstringで返す
fun format(d: Double): String {
    val regex = Regex(".0+\$")
    return regex.replace(d.toString(), "")
/*    if (d == d.toInt().toDouble()) {
        return String.format("%d", d.toInt())
    }
    else {
        return String.format("%s", d)
    }*/
}