package com.example.calculator_kotlin

class ChangeBaseNumber{
    fun binnary(num: String): String{
        val array = num.split("\\.".toRegex())
        val integer = array[0].toString()
        val decimals = "0." + array[1].toString()
        var resultString = ""
        var number = integer.toInt()
        //整数部計算
        var base = 1
        var result = 0
        while (number > 0){
            result += number % 2 * base
            number /= 2
            base *= 10
        }
        //少数部計算
        var decimalNumber = decimals.toDouble()
        var decimalBase = 0.1
        var decimalResult = 0.0
        var decimal = 0.5
        while (decimalNumber > 0.0){
            if(decimalNumber / decimal == 1.0){
                println("aaaa")
                decimalResult += decimalNumber / decimal * decimalBase
                println(decimalResult)
                println("while decimalResult: " + decimalResult)
                println("while decimalNumber: " + decimalNumber)
            }
            decimalNumber %= decimal
            decimal /= 2
            decimalBase /= 10
        }
        println(decimalResult)
        resultString = (result + decimalResult).toString()
        return resultString
    }


    fun octal(num: String): String{
        val array = num.split("\\.".toRegex())
        val integer = array[0].toString()
        val decimals = "0." + array[1].toString()
        var resultString = ""
        var number = integer.toInt()
        //整数部計算
        var base = 1
        var result = 0
        while (number > 0){
            result += number % 8 * base
            number /= 8
            base *= 10
        }
        //少数部計算
        var decimalNumber = decimals.toDouble()
        var decimalBase = 0.1
        var decimalResult = 0.0
        var decimal = 1/8
        while (decimalNumber > 0.0){
            if(decimalNumber / decimal == 1.0){
                println("aaaa")
                decimalResult += decimalNumber / decimal * decimalBase
                println(decimalResult)
                println("while decimalResult: " + decimalResult)
                println("while decimalNumber: " + decimalNumber)
            }
            decimalNumber %= decimal
            decimal /= 8
            decimalBase /= 10
        }
        println(decimalResult)
        resultString = (result + decimalResult).toString()
        return resultString
    }
    fun hexadecimal(num: String): String{
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
}