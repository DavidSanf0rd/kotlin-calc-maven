/**
 * Created by sanf0rd on 16/01/17.
 */

package com.sanford.tests

import Calculator
import org.junit.Test
import kotlin.test.assertEquals

class CalcTest {

    @Test fun sum() : Unit {
        val calc = Calculator()
        assertEquals(calc.sum(5,2), 7, "It is not summing right")
    }

    @Test fun sub() : Unit {
        val calc = Calculator()
        assertEquals(calc.sub(5,2), 3, "It is not subtracting right")
    }


    @Test fun mult() : Unit {
        val calc = Calculator()
        assertEquals(calc.mult(5,2), 10, "It is not multiplicating right")
    }

    @Test fun div() : Unit {
        val calc = Calculator()
        assertEquals(calc.div(15,5), 3, "It is not dividing right")
    }
}
