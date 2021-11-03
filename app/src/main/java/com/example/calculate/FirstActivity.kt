package com.example.calculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.sqrt

class FirstActivity : AppCompatActivity() , View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        val button_0:Button=findViewById(R.id.button_0)
        button_0.setOnClickListener(this)
        val button_1:Button=findViewById(R.id.button_1)
        button_1.setOnClickListener(this)
        val button_2:Button=findViewById(R.id.button_2)
        button_2.setOnClickListener(this)
        val button_3:Button=findViewById(R.id.button_3)
        button_3.setOnClickListener(this)
        val button_4:Button=findViewById(R.id.button_4)
        button_4.setOnClickListener(this)
        val button_5:Button=findViewById(R.id.button_5)
        button_5.setOnClickListener(this)
        val button_6:Button=findViewById(R.id.button_6)
        button_6.setOnClickListener(this)
        val button_7:Button=findViewById(R.id.button_7)
        button_7.setOnClickListener(this)
        val button_8:Button=findViewById(R.id.button_8)
        button_8.setOnClickListener(this)
        val button_9:Button=findViewById(R.id.button_9)
        button_9.setOnClickListener(this)
        val button_clear:Button=findViewById(R.id.button_clear)
        button_clear.setOnClickListener(this)
        val button_switch:Button=findViewById(R.id.button_switch)
        button_switch.setOnClickListener(this)
        val button_square:Button=findViewById(R.id.button_square)
        button_square.setOnClickListener(this)
        val button_add:Button=findViewById(R.id.button_add)
        button_add.setOnClickListener(this)
        val button_redu:Button=findViewById(R.id.button_redu)
        button_redu.setOnClickListener(this)
        val button_mul:Button=findViewById(R.id.button_mul)
        button_mul.setOnClickListener(this)
        val button_divi:Button=findViewById(R.id.button_divi)
        button_divi.setOnClickListener(this)
        val button_point:Button=findViewById(R.id.button_point)
        button_point.setOnClickListener(this)
        val button_equal:Button=findViewById(R.id.button_equal)
        button_equal.setOnClickListener(this)
    }

    private var sum = 0.0
    var flag = ' '
    var nflag = 1
    override fun onClick(v: View?){
        val output:TextView=findViewById(R.id.ouput)
        var numst = output.text.toString()
        when(v?.id){
            R.id.button_0->{
                if(nflag == 2) {
                    numst = " "
                    output.setText(numst)
                    nflag = 1
                }
                val allnum:String = numst + "0"
                output.setText(allnum)
            }
            R.id.button_1->{
                if(nflag == 2) {
                    numst = " "
                    output.setText(numst)
                    nflag = 1
                }
                val allnum:String = numst + "1"
                output.setText(allnum)
            }
            R.id.button_2->{
                if(nflag == 2) {
                    numst = " "
                    output.setText(numst)
                    nflag = 1
                }
                val allnum:String = numst + "2"
                output.setText(allnum)
            }
            R.id.button_3->{
                if(nflag == 2) {
                    numst = " "
                    output.setText(numst)
                    nflag = 1
                }
                val allnum:String = numst + "3"
                output.setText(allnum)
            }
            R.id.button_4->{
                if(nflag == 2) {
                    numst = " "
                    output.setText(numst)
                    nflag = 1
                }
                val allnum:String = numst + "4"
                output.setText(allnum)
            }
            R.id.button_5->{
                if(nflag == 2) {
                    numst = " "
                    output.setText(numst)
                    nflag = 1
                }
                val allnum:String = numst + "5"
                output.setText(allnum)
            }
            R.id.button_6->{
                if(nflag == 2) {
                    numst = " "
                    output.setText(numst)
                    nflag = 1
                }
                val allnum:String = numst + "6"
                output.setText(allnum)
            }
            R.id.button_7->{
                if(nflag == 2) {
                    numst = " "
                    output.setText(numst)
                    nflag = 1
                }
                val allnum:String = numst + "7"
                output.setText(allnum)
            }
            R.id.button_8->{
                if(nflag == 2) {
                    numst = " "
                    output.setText(numst)
                    nflag = 1
                }
                val allnum:String = numst + "8"
                output.setText(allnum)
            }
            R.id.button_9->{
                if(nflag == 2) {
                    numst = " "
                    output.setText(numst)
                    nflag = 1
                }
                val allnum:String = numst + "9"
                output.setText(allnum)
            }
            R.id.button_clear->{
                output.setText(" ")
                sum = 0.0
                flag = ' '
                nflag = 1
            }
            R.id.button_switch->{
                if(numst != " ") {
                    val num: Double = numst.toDouble()
                    sum = -num
                    val sumst: String = sum.toString()
                    output.setText(sumst)
                }
            }
            R.id.button_square->{
                if(numst != " ") {
                    val num: Double = numst.toDouble()
                    if (num < 0.0)
                        Toast.makeText(this, "被开方数不能为0", Toast.LENGTH_LONG).show()
                    else {
                        sum = sqrt(num)
                        val str: String = String.format("%.9f", sum)
                        output.setText(str)
                    }
                }
            }
            R.id.button_add->{
                if(numst != " ") {
                    val num: Double = numst.toDouble()
                    nflag = 2
                    if (flag == ' ') {
                        flag = '+'
                        sum = num
                    } else if (flag == '+') {
                        sum += num
                        val sumst: String = sum.toString()
                        output.setText(sumst)
                    }
                }
            }
            R.id.button_redu->{
                if(numst != " ") {
                    val num: Double = numst.toDouble()
                    nflag = 2
                    if (flag == ' ') {
                        flag = '-'
                        sum = num
                    } else if (flag == '-') {
                        sum -= num
                        val sumst: String = sum.toString()
                        output.setText(sumst)
                    }
                }
            }
            R.id.button_mul->{
                if(numst != " ") {
                    val num: Double = numst.toDouble()
                    nflag = 2
                    if (flag == ' ') {
                        flag = '*'
                        sum = num
                    } else if (flag == '*') {
                        sum *= num
                        val sumst: String = sum.toString()
                        output.setText(sumst)
                    }
                }
            }
            R.id.button_divi->{
                if(numst != " ") {
                    val num: Double = numst.toDouble()
                    nflag = 2
                    if (flag == ' ') {
                        flag = '/'
                        sum = num
                    } else if (flag == '/') {
                        if (num == 0.0)
                            Toast.makeText(this, "除数不能为0", Toast.LENGTH_LONG).show()
                        else {
                            sum /= num
                            val str: String = String.format("%.9f", sum)
                            //sum = str.toDouble()
                            //val sumst: String = sum.toString()
                            output.setText(str)
                        }
                    }
                }
            }
            R.id.button_point->{
                if(numst != " ") {
                    val allnum: String = numst + "."
                    output.setText(allnum)
                }
            }
            R.id.button_equal->{
                if(numst != " ") {
                    val num: Double = numst.toDouble()
                    when (flag) {
                        '+' -> sum += num
                        '-' -> sum -= num
                        '*' -> sum *= num
                        '/' -> {
                            if (num == 0.0) {
                                Toast.makeText(this, "除数不能为0", Toast.LENGTH_LONG).show()
                                sum = 0.0
                            } else {
                                sum /= num
                                val str: String = String.format("%.9f", sum)
                                sum = str.toDouble()
                            }
                        }
                        else -> sum = 0.0
                    }
                    val sumst: String = sum.toString()
                    output.setText(sumst)
                    flag = ' '
                    sum = 0.0
                }
            }
        }
    }
}