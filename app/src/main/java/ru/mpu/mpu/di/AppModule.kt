package ru.mpu.mpu.di

import android.content.Context
import dagger.Module
import ru.mpu.mpu.presentation.GetUserNameUseCase
import ru.mpu.mpu.presentation.MainViewModelFactory
import ru.mpu.mpu.presentation.SaveUserNameUseCase

@Module
class AppModule(val context: Context) {

    fun provideContext(): Context {
        return context
    }

    fun provideMainViewModelFactory(
        getUserNameUseCase: GetUserNameUseCase,
        saveUserNameUseCase: SaveUserNameUseCase
    ): MainViewModelFactory {
        return MainViewModelFactory(
            getUserNameUseCase = getUserNameUseCase,
            saveUserNameUseCase = saveUserNameUseCase
        )
    }


}

