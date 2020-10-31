package com.example.calculator_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val calc = Calculation()
    val input = Input()
    var num: Double = 0.0
    var result: String = "0"
    var ope: String = "+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = findViewById<TextView>(R.id.resultTextView)
        text.setText(result)


        //number
        val nine = findViewById<Button>(R.id.nine)
        val eight = findViewById<Button>(R.id.eight)
        val seven = findViewById<Button>(R.id.seven)
        val six = findViewById<Button>(R.id.six)
        val five = findViewById<Button>(R.id.five)
        val four = findViewById<Button>(R.id.four)
        val three = findViewById<Button>(R.id.three)
        val two = findViewById<Button>(R.id.two)
        val one = findViewById<Button>(R.id.one)
        val zero = findViewById<Button>(R.id.zero)
        val point = findViewById<Button>(R.id.point)

        nine.setOnClickListener {
            result = input.input("9",result)
            text.setText(result)
        }
        eight.setOnClickListener {
            result = input.input("8",result)
            text.setText(result)
        }
        seven.setOnClickListener {
            result = input.input("7",result)
            text.setText(result)
        }
        six.setOnClickListener {
            result = input.input("6",result)
            text.setText(result)
        }
        five.setOnClickListener {
            result = input.input("5",result)
            text.setText(result)
        }
        four.setOnClickListener {
            result = input.input("4",result)
            text.setText(result)
        }
        three.setOnClickListener {
            result = input.input("3",result)
            text.setText(result)
        }
        two.setOnClickListener {
            result = input.input("2",result)
            text.setText(result)
        }
        one.setOnClickListener {
            result = input.input("1",result)
            text.setText(result)
        }
        zero.setOnClickListener {
            result = input.input("0",result)
            text.setText(result)
        }
        point.setOnClickListener {
            result = input.inputPoint(".", result)
            text.setText(result)
        }

        //Calculation
        val div = findViewById<Button>(R.id.divButton)
        val mul = findViewById<Button>(R.id.mulButton)
        val sub = findViewById<Button>(R.id.subButton)
        val add = findViewById<Button>(R.id.addButton)
        val equal = findViewById<Button>(R.id.equal)
        val clear = findViewById<Button>(R.id.clearButton)

        add.setOnClickListener {
            operation(ope, num,result.toDouble()).toString()
            result = "0"
            ope = "+"
            text.setText(num.toString())
        }
        sub.setOnClickListener {
            operation(ope, num,result.toDouble()).toString()
            result = "0"
            ope = "-"
            text.setText(num.toString())
        }
        mul.setOnClickListener {
            operation(ope, num,result.toDouble()).toString()
            result = "0"
            ope = "*"
            text.setText(num.toString())
        }
        div.setOnClickListener {
            operation(ope, num,result.toDouble()).toString()
            result = "0"
            ope = "/"
            text.setText(num.toString())
        }
        equal.setOnClickListener {
            operation(ope, num,result.toDouble()).toString()
            result = "0"
            ope = "+"
            text.setText(num.toString())
        }



        clear.setOnClickListener {
            result = "0"
            text.setText("0")
        }
    }

    fun operation(ope: String , num1 :Double, num2: Double){
        when(ope){
            "+" -> num = calc.add(num1, num2)
            "-" -> num = calc.sub(num1, num2)
            "*" -> num = calc.mul(num1, num2)
            "/" -> num = calc.div(num1, num2)
        }
    }
}