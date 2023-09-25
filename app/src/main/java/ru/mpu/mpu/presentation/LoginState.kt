package ru.mpu.lk.login.presentation

import androidx.constraintlayout.motion.utils.ViewState

sealed class LoginState: ViewState() {

    class DefaultState(): LoginState()

}
