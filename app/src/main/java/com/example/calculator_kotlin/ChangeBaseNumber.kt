package com.example.calculator_kotlin

class ChangeBaseNumber{
    fun binnary(num: String): String{
        if(num.indexOf(".") < 1){
            val result = changeInteger(num,2)
            return result.toString()
        }else{
            val array = num.split("\\.".toRegex())
            val integer = array[0].toString()
            val decimals = "0." + array[1].toString()
            val result = changeInteger(integer,2)
            val decimalResult = changeDecimal(decimals,2)

            return (result + decimalResult).toString()
        }
    }


    fun octal(num: String): String{
        if(num.indexOf(".") < 1){
            val result = changeInteger(num,8)
            return result.toString()
        }else{
            val array = num.split("\\.".toRegex())
            val integer = array[0].toString()
            val decimals = "0." + array[1].toString()
            val result = changeInteger(integer,8)
            val decimalResult = changeDecimal(decimals,8)

            return (result + decimalResult).toString()
        }
    }
    fun hexadecimal(num: String): String{
        //小数点がない場合の処理
        //10以上時の処理
        val array = num.split("\\.".toRegex())
        val integer = array[0].toString()
        val decimals = "0." + array[1].toString()
        var resultString = ""
        var number = integer.toInt()
        //整数部計算
        var base = 1
        var result = 0
        while (number > 0){
            result += number % 16 * base
            number /= 16
            base *= 10
        }
        //少数部計算
        var decimalNumber = decimals.toDouble()
        var decimalBase = 0.1
        var decimalResult = 0.0
        var decimal = 1/16
        while (decimalNumber > 0.0){
            if(decimalNumber / decimal == 1.0){
                println("aaaa")
                decimalResult += decimalNumber / decimal * decimalBase
                println(decimalResult)
                println("while decimalResult: " + decimalResult)
                println("while decimalNumber: " + decimalNumber)
            }
            decimalNumber %= decimal
            decimal /= 16
            decimalBase /= 10
        }
        println(decimalResult)
        resultString = (result + decimalResult).toString()
        return resultString
    }


    fun changeInteger(num: String,baseInt: Int): Int{
        var number = num.toInt()
        var base = 1
        var result = 0
        val baseNumber = baseInt
        while (number > 0){
            result += number % baseNumber * base
            number /= baseNumber
            base *= 10
        }

        return result
    }
    fun changeDecimal(num: String,baseDecimal:Int): Double{
        var decimalNumber = num.toDouble()
        var decimalBase = 0.1
        var decimalResult = 0.0
        var decimal = 1.0/baseDecimal
        while (decimalNumber > 0.0){
            if(decimalNumber - decimal > 0){
                println("aaaa")
                println(decimalNumber)
                decimalResult += decimalNumber / decimal * decimalBase
                println(decimalResult)
                println("while decimalResult: " + decimalResult)
                println("while decimalNumber: " + decimalNumber)
            }
            decimalNumber %= decimal
            decimal /= baseDecimal
            decimalBase /= 10
        }
        return decimalResult
    }
}