package ru.mpu.mpu

import android.app.Application
import ru.mpu.mpu.di.AppComponent
import ru.mpu.mpu.di.AppModule
import ru.mpu.mpu.di.DaggerAppComponent

class App: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().appModule(AppModule(context = this)).build()

    }
}