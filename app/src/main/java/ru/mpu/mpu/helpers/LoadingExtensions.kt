package ru.mpu.helpers

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.launch
import ru.mpu.mpu.helpers.emit
import java.lang.Exception

private fun <T> CoroutineScope.emit(sharedFlow: MutableSharedFlow<T>, event: T) {
    this.launch {
        sharedFlow.emit(event)
    }
}

suspend fun <T> ViewModel.launchOnIO(
    loader: MutableSharedFlow<ViewEvent>? = null,
    request: suspend () -> T,
    onSuccess: suspend (T) -> Unit,
    onError: suspend (Exception) -> Unit
) {
    if (loader != null)
        emit(loader, ViewEvent.Loading.Enabled)
    viewModelScope.launch(Dispatchers.IO) {
        try {
            val data = request.invoke()
            onSuccess.invoke(data)
        } catch (e: Exception) {
            onError.invoke(e)
        }
        if (loader != null)
            emit(loader, ViewEvent.Loading.Disabled)
    }
}