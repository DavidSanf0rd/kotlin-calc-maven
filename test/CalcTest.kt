/**
 * Created by sanf0rd on 16/01/17.
 */

package com.sanford.tests

import calculator.*
import org.junit.Test
import kotlin.test.assertEquals

class CalcTest {

    @Test fun sum() : Unit {
        assertEquals(calculator.sum(5,2), 7, "It is not summing right")
    }

    @Test fun sub() : Unit {
        assertEquals(calculator.sub(5,2), 3, "It is not subtracting right")
    }


    @Test fun mult() : Unit {
        assertEquals(calculator.mult(5,2), 10, "It is not multiplicating right")
    }

    @Test fun div() : Unit {
        assertEquals(calculator.div(15,5), 3, "It is not dividing right")
    }
}
