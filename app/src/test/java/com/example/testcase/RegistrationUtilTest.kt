package com.example.testcase

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilTest {


    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Bruno",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isTrue()
//        assertThat("hello").isEqualTo("hello")
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Carl",
            password = "123",
            confirmedPassword = "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Bruno",
            password = "123456",
            confirmedPassword = "abcdefg"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Bruno",
            password = "",
            confirmedPassword = ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Bruno",
            password = "abcdefg5",
            confirmedPassword = "abcdefg5"
        )
        assertThat(result).isFalse()
    }


}