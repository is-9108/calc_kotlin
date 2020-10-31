package com.example.calculator_kotlin

class Input{
    fun input(num: String, result: String): String{
        var resultNum: String
        if(result == "0"){
            resultNum = num
        }else{
            resultNum = result + num
        }
        return resultNum
    }

    fun inputPoint(point: String, result: String): String{
        var res: String = ""
        if(result.contains(".")){
            return result
        }else{
            res = result + point
            return res
        }
    }

}