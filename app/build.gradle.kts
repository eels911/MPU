plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
}

android {
    namespace = "ru.mpu.mpu"
    compileSdk = 33
    buildFeatures {
        viewBinding = true
    }
    defaultConfig {
        applicationId = "ru.mpu.mpu"
        minSdk = 27
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation (files("../libs/org.denom.common-android.jar"))
    implementation (files("../libs/org.denom.crypt.jar"))
    implementation (files("../libs/android.team.sls.common.aar"))
    implementation (files("../libs/android.team.sls.zxing.aar"))
    implementation (files("../libs/android.team.sls.camera.aar"))
    implementation (files("../libs/android.team.sls.mobilecard.aar"))
    implementation (files("../libs/android.team.sls.mobilecard.storage.aar"))
    implementation (files("../libs/android.team.sls.ticketvrclient.aar"))

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation( "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
    implementation("android.arch.lifecycle:extensions:1.1.1")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.5.1")
    implementation ("androidx.navigation:navigation-ui-ktx:2.5.1")

    implementation ("com.google.dagger:dagger:2.42")
    kapt ("com.google.dagger:dagger-compiler:2.42")
    implementation("javax.inject:javax.inject:1")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.2")

    // RxJava
    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")
    implementation("io.reactivex.rxjava2:rxkotlin:2.4.0")
    implementation("io.reactivex.rxjava2:rxjava:2.2.21")
    implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1")
    implementation("com.jakewharton.rxbinding2:rxbinding-kotlin:2.2.0")
}