package ru.mpu.mpu.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import ru.mpu.lk.login.presentation.LoginState

class LoginViewModel:ViewModel() {

    private val stateConfigurator = StateConfigurator()

    private val viewStateMutable = MutableStateFlow(stateConfigurator.defineFragmentState())
    val viewState = viewStateMutable.asStateFlow()

//    fun obtainAction(action: SignUpViewActions) {
//        when (action) {
//            is SignUpViewActions.SignUp -> login(action.email, action.password)
//        }
//    }

//    private fun signUp(email: String, password: String) {
//        launchOnIO(
//            loader = viewEventMutable,
//            request = { interactor.signUp(email, password) },
//            onSuccess = {
//                if (it == null) {
//                    val text = stringProvider.getString(R.string.sign_up_error)
//                    emit(viewEventMutable, ViewEvent.AlmagestSnackbar(message = text, status = NotificationStatus.ERROR))
//                } else {
//                    interactor.addUserToList(it.uid)
//                    emit(clearFieldsMutableEvent, Unit)
//                    val text = stringProvider.getString(R.string.account_created)
//                    emit(viewEventMutable, ViewEvent.AlmagestSnackbar(message = text, status = NotificationStatus.SUCCESS))
//                }
//                viewStateMutable.value = stateConfigurator.defineFragmentState()
//            },
//            onError = {
//                val text = it.message ?: stringProvider.getString(R.string.default_error_message)
//                emit(viewEventMutable, ViewEvent.AlmagestSnackbar(message = text, status = NotificationStatus.ERROR))
//            }
//        )
//    }

//    fun loginViaUrl(
//        encodedUrl: String?,
//        login: String?,
//        listener: ExecutorManager.ResultListener<String?>
//    ) {
//        val campusOTP = CampusOTP()
//        try {
//            campusOTP.fromEncodedURL(encodedUrl, App.URL_PREFIX)
//        } catch (ex: Ex) {
//            listener.onError(ex)
//            return
//        }
//        val task: ExecutorTask = ExecutorTask<String>()
//            .onBackground {
//                app.createGroup(campusOTP.serviceURL, getDeviceId(), campusOTP.userOTP, login)
//                ""
//            }
//            .onSuccess { result -> listener.onSuccess("") }
//            .onError(listener::onError)
//        executorManager.execute(task)
//    }

    private inner class StateConfigurator {
        fun defineFragmentState(): LoginState {
            return LoginState.DefaultState()
        }
    }
}


