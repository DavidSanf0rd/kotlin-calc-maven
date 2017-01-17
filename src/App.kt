/**
 * Created by sanf0rd on 15/01/17.
 */

package com.sanford

import calculator.*
import kotlin.io.*

fun main(args: Array<String>) {

    var y: Int = 1;

    loop@ while (y == 1) {
        println("Escolha uma operação:")
        println("1 - Soma")
        println("2 - Subtração")
        println("3 - Multiplicação")
        println("4 - Divisão")

        println("0 - Sair")

        var input: Int? = readLine()?.toInt()

        if (input == null) continue@loop

        var fNumber: Int?
        var sNumber: Int?

        when (input) {
            1, 2, 3, 4 -> {
                println("Digite o primeiro número: ")
                fNumber = readLine()?.toInt()

                if (fNumber == null) continue@loop

                println("Digite o segundo número: ")
                sNumber = readLine()?.toInt()

                if (sNumber == null) continue@loop

                when (input) {
                    1 -> println("Resultado = ${calculator.sum(fNumber, sNumber)}")
                    3 -> println("Resultado = ${calculator.mult(fNumber, sNumber)}")
                    2 -> println("Resultado = ${calculator.sub(fNumber, sNumber)}")
                    4 -> println("Resultado = ${calculator.div(fNumber, sNumber)}")
                }
            }
            0 -> y = 0
        }
    }
}