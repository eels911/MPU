package ru.mpu.mpu.presentation

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import ru.mpu.lk.login.presentation.KeyboardManager

abstract class BaseFragment(@LayoutRes res: Int) : Fragment(res) {
    override fun onDestroy() {
        super.onDestroy()
        (requireActivity() as? KeyboardManager)?.hideKeyboard()
    }
}