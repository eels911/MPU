package ru.mpu.mpu.presentation

internal sealed class SignUpViewActions {
    class SignUp(
        val email: String,
        val password: String
    ) : SignUpViewActions()
}