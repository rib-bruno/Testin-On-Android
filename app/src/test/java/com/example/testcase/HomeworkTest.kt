package com.example.testcase




import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {

    @Test
    fun fib() {
    }

    @Test
    fun checkBraces() {
        val resultCheckBraces = Homework.checkBraces(
            string = "(a * b))"
        )
        assertThat(resultCheckBraces).isFalse()

    }
}