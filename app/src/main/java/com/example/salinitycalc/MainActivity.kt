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
var nowInput = "" // "num", "ope", "fla"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //数字ボタン
        button0.setOnClickListener{
            if (nowInput == "ope" || nowInput == "fla") { nStr = "" }
            if (nStr == "0") return@setOnClickListener
            nStr = nStr + "0"
            formula.text = nStr
            nowInput = "num"
        }
        button1.setOnClickListener{
            if (nowInput == "ope" || nowInput == "fla") { nStr = "" }
            nStr = format((nStr + "1").toDouble())
            formula.text = nStr
            nowInput = "num"
        }

        button2.setOnClickListener{
            if (nowInput == "ope" || nowInput == "fla") { nStr = "" }
            nStr = format((nStr + "2").toDouble())
            formula.text = nStr
            nowInput = "num"
        }
        button3.setOnClickListener {
            if (nowInput == "ope" || nowInput == "fla") { nStr = "" }
            nStr = format((nStr + "3").toDouble())
            formula.text = nStr
            nowInput = "num"
        }
        button4.setOnClickListener{
            if (nowInput == "ope" || nowInput == "fla") { nStr = "" }
            nStr = format((nStr + "4").toDouble())
            formula.text = nStr
            nowInput = "num"
        }
        button5.setOnClickListener{
            if (nowInput == "ope" || nowInput == "fla") { nStr = "" }
            nStr = format((nStr + "5").toDouble())
            formula.text = nStr
            nowInput = "num"
        }
        button6.setOnClickListener{
            if (nowInput == "ope" || nowInput == "fla") { nStr = "" }
            nStr = format((nStr + "6").toDouble())
            formula.text = nStr
            nowInput = "num"
        }
        button7.setOnClickListener{
            if (nowInput == "ope" || nowInput == "fla") { nStr = "" }
            nStr = format((nStr + "7").toDouble())
            formula.text = nStr
            nowInput = "num"
        }
        button8.setOnClickListener{
            if (nowInput == "ope" || nowInput == "fla") { nStr = "" }
            nStr = format((nStr + "8").toDouble())
            formula.text = nStr
            nowInput = "num"
        }
        button9.setOnClickListener{
            if (nowInput == "ope" || nowInput == "fla") { nStr = "" }
            nStr = format((nStr + "9").toDouble())
            formula.text = nStr
            nowInput = "num"
        }

        button_Dot.setOnClickListener {
            if (nowInput == "ope") {
                nStr = "0"
                formula.text = "0"
                nowInput = "num"
            }
            //文字列にドットがなければ
            if (nStr.indexOf(".") == -1 ) {
                nStr = nStr + "."
                formula.text = nStr
            }
        }

        //計算ボタン
        button_Add.setOnClickListener{
            if (nowInput != "ope" && nowInput!="fla") { formula.text = arithmetic_Operations()}
            preOder = "+"
            nowInput = "ope"
        }

        button_Sum.setOnClickListener{
            if (nowInput != "ope" && nowInput!="fla") { formula.text = arithmetic_Operations()}
            preOder = "-"
            nowInput = "ope"
        }

        button_Multi.setOnClickListener{
            if (nowInput != "ope" && nowInput!="fla") { formula.text = arithmetic_Operations()}
            preOder = "*"
            nowInput = "ope"
        }

        button_Div.setOnClickListener{
            if (nowInput != "ope" && nowInput!="fla") { formula.text = arithmetic_Operations()}
            preOder = "/"
            nowInput = "ope"
        }

        button_Equal.setOnClickListener{
            if (nowInput != "ope" && nowInput!="fla") { formula.text = arithmetic_Operations()}
            preOder = ""
            nowInput = "ope"
        }

        button_AC.setOnClickListener{
            formula.text = "0"
            nStr = "0"
            numTemp = 0.0
            preOder = ""
            nowInput = ""
        }
        button_C.setOnClickListener{
            formula.text = "0"
            nStr = "0"
        }

        //調味料ボタン
        //塩
        button_Flavor1.setOnClickListener{
            if (nowInput == "fla") return@setOnClickListener
            formula.text = arithmetic_Operations()
            nStr = resources.getString(R.string.flavor1_salinity)
            preOder = "*"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "fla"
        }
        //醤油
        button_Flavor2.setOnClickListener{
            if (nowInput== "fla") return@setOnClickListener
            formula.text = arithmetic_Operations()
            nStr = resources.getString(R.string.flavor2_salinity)
            preOder = "*"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "fla"
        }
        button_Flavor3.setOnClickListener{
            if (nowInput== "fla") return@setOnClickListener
            formula.text = arithmetic_Operations()
            nStr = resources.getString(R.string.flavor3_salinity)
            preOder = "*"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "fla"
        }
        button_Flavor4.setOnClickListener{
            if (nowInput== "fla") return@setOnClickListener
            formula.text = arithmetic_Operations()
            nStr = resources.getString(R.string.flavor4_salinity)
            preOder = "*"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "fla"
        }
        button_Flavor5.setOnClickListener{
            if (nowInput== "fla") return@setOnClickListener
            formula.text = arithmetic_Operations()
            nStr = resources.getString(R.string.flavor5_salinity)
            preOder = "*"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "fla"
        }
        button_Flavor6.setOnClickListener{
            if (nowInput== "fla") return@setOnClickListener
            formula.text = arithmetic_Operations()
            nStr = resources.getString(R.string.flavor6_salinity)
            preOder = "*"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "fla"
        }
    }
}

//四則演算
fun arithmetic_Operations(): String{
    when(preOder) {
        "+"-> nStr = format(numTemp + nStr.toDouble())
        "-"-> nStr = format(numTemp - nStr.toDouble())
        "*"-> nStr = format(numTemp * nStr.toDouble())
        "/"-> nStr = format(numTemp / nStr.toDouble())
    }
    numTemp = nStr.toDouble()
    return nStr
}

//doubleの末尾の０を消してstringで返す
fun format(d: Double): String {
    val regex = Regex(".0+\$")
    return regex.replace(d.toString(), "")
}