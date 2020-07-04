package com.example.salinitycalc

import android.content.Intent
import android.icu.math.BigDecimal
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.Preference
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.settings_activity.*

const val EXTRA_MESSAGE = "com.example.salinitycalc.MESSAGE"
//var num = 0
var numTemp = BigDecimal.ZERO
var preOder =""
var nStr = BigDecimal.ZERO
var nowInput = "" // "num", "ope", "fla", "dot"

class MainActivity : AppCompatActivity() {
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                // User chose the "Settings" item, show the app settings UI...
/*                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.settings_container, SettingsActivity.SettingsFragment())
                    .commit()*/
                val intent = Intent(this,SettingsActivity::class.java)
                startActivity(intent)
                true
            }

            else -> {
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                super.onOptionsItemSelected(item)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //数字ボタン
        button0.setOnClickListener{
            formula.text = num_Plus("0")
        }
        button1.setOnClickListener{
            formula.text = num_Plus("1")
        }

        button2.setOnClickListener{
            formula.text = num_Plus("2")
        }
        button3.setOnClickListener {
            formula.text = num_Plus("3")
        }
        button4.setOnClickListener{
            formula.text = num_Plus("4")
        }
        button5.setOnClickListener{
            formula.text = num_Plus("5")
        }
        button6.setOnClickListener{
            formula.text = num_Plus("6")
        }
        button7.setOnClickListener{
            formula.text = num_Plus("7")
        }
        button8.setOnClickListener{
            formula.text = num_Plus("8")
        }
        button9.setOnClickListener{
            formula.text = num_Plus("9")
        }

        button_Dot.setOnClickListener {
            if (nowInput == "ope") {
                nStr = BigDecimal.ZERO
                formula.text = "0"
                nowInput = "num"
            }
            //文字列にドットがなければ
            if (nStr.toString().indexOf(".") == -1 ) {
                formula.text = nStr.toString() + "."
                nowInput = "dot"
            }
        }

        //計算ボタン
        button_Add.setOnClickListener{
            if (nowInput != "ope" && nowInput!="fla" && nowInput!="tere") { formula.text = arithmetic_Operations()}
            preOder = "+"
            nowInput = "ope"
        }

        button_Sum.setOnClickListener{
            if (nowInput != "ope" && nowInput!="fla" && nowInput!="tere") { formula.text = arithmetic_Operations()}
            preOder = "-"
            nowInput = "ope"
        }

        button_Multi.setOnClickListener{
            if (nowInput != "ope" && nowInput!="fla" && nowInput!="tere") { formula.text = arithmetic_Operations()}
            preOder = "*"
            nowInput = "ope"
        }

        button_Div.setOnClickListener{
            if (nowInput != "ope" && nowInput!="fla" && nowInput!="tere") { formula.text = arithmetic_Operations()}
            preOder = "/"
            nowInput = "ope"
        }

        button_Equal.setOnClickListener{
            if (nowInput != "ope" && nowInput!="fla" && nowInput!="tere") { formula.text = arithmetic_Operations()}
            preOder = ""
            nowInput = "ope"
        }

        button_AC.setOnClickListener{
            formula.text = "0"
            nStr = BigDecimal.ZERO
            numTemp = BigDecimal.ZERO
            preOder = ""
            nowInput = ""
        }
        button_C.setOnClickListener{
            formula.text = "0"
            nStr = BigDecimal.ZERO
        }

        //調味料ボタン
        //塩
        button_Flavor1.setOnClickListener{
            if (nowInput == "fla") return@setOnClickListener
            formula.text = arithmetic_Operations()
            nStr = BigDecimal(resources.getString(R.string.flavor1_salinity))
            preOder = "*"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "fla"
        }

        //醤油
        button_Flavor2.setOnClickListener{
            if (nowInput== "fla") return@setOnClickListener
            formula.text = arithmetic_Operations()
            nStr = BigDecimal(resources.getString(R.string.flavor2_salinity))
            preOder = "*"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "fla"
        }
        button_Flavor3.setOnClickListener{
            if (nowInput== "fla") return@setOnClickListener
            formula.text = arithmetic_Operations()
            nStr = BigDecimal(resources.getString(R.string.flavor3_salinity))
            preOder = "*"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "fla"
        }
        button_Flavor4.setOnClickListener{
            if (nowInput== "fla") return@setOnClickListener
            formula.text = arithmetic_Operations()
            nStr = BigDecimal(resources.getString(R.string.flavor4_salinity))
            preOder = "*"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "fla"
        }
        button_Flavor5.setOnClickListener{
            if (nowInput== "fla") return@setOnClickListener
            formula.text = arithmetic_Operations()
            nStr = BigDecimal(resources.getString(R.string.flavor5_salinity))
            preOder = "*"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "fla"
        }
        button_Flavor6.setOnClickListener{
            if (nowInput== "fla") return@setOnClickListener
            formula.text = arithmetic_Operations()
            nStr = BigDecimal(resources.getString(R.string.flavor6_salinity))
            preOder = "*"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "fla"
        }

        //風袋計算
        button_Tere1.setOnClickListener{
            formula.text = arithmetic_Operations()
            nStr = BigDecimal(resources.getString(R.string.tere1_weight))
            preOder = "-"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "tere"
        }
        button_Tere2.setOnClickListener{
            formula.text = arithmetic_Operations()
            nStr = BigDecimal(resources.getString(R.string.tere2_weight))
            preOder = "-"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "tere"
        }
        button_Tere3.setOnClickListener{
            formula.text = arithmetic_Operations()
            nStr = BigDecimal(resources.getString(R.string.tere3_weight))
            preOder = "-"
            formula.text = arithmetic_Operations()
            preOder = ""
            nowInput = "tere"
        }
        
    }
}

//四則演算
fun arithmetic_Operations(): String{
    when(preOder) {
        "+"-> nStr = numTemp.add(nStr)
        "-"-> nStr = numTemp.min(nStr)
        "*"-> nStr = numTemp.multiply(nStr)
        "/"-> nStr = numTemp.divide(nStr, 3, BigDecimal.ROUND_HALF_UP)
    }
    numTemp = nStr
    return format(nStr.toString())
}

//数値列の末尾に数値を追加
fun num_Plus(s: String): String{
    if (nowInput == "ope" || nowInput == "fla" || nowInput == "tere") { nStr = BigDecimal.ZERO }
    if (nStr.equals(0)) return "0"
    if (nowInput != "dot") {
        nStr = BigDecimal(nStr.toString() + s)
    }
    else {
        nStr = BigDecimal(nStr.toString() + "." + s)
    }

    nowInput = "num"
    return nStr.toString()
}

//stringの末尾の０を消してstringで返す
fun format(s: String): String {
    val regex = Regex(".0+\$")
    return regex.replace(s, "")
}