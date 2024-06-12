plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    alias(libs.plugins.org.jetbrains.kotlin.kapt)
    // alias(libs.plugins.hilt)
    alias(libs.plugins.hilt)
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.jetpackcomapimvvm"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.jetpackcomapimvvm"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
   // implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    // implementation (libs.hilt.android)
    implementation(libs.annotations)
    implementation(libs.glide)
    // implementation(libs.androidx.hilt.lifecycle.viewmodel)
    implementation(libs.androidx.activity.ktx)
    //  annotationProcessor (libs.com.google.dagger.hilt.compiler2)

    // For instrumentation tests
    //   androidTestImplementation  (libs.google.hilt.android.testing)
    // androidTestAnnotationProcessor (libs.com.google.dagger.hilt.compiler2)

    // For local unit tests
    //
    // testImplementation (libs.google.hilt.android.testing)
    // testAnnotationProcessor (libs.com.google.dagger.hilt.compiler2)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)



    implementation (libs.androidx.lifecycle.viewmodel.ktx)


    implementation (libs.retrofit)
    implementation (libs.converter.gson)



    implementation (libs.androidx.room.runtime)
    implementation (libs.androidx.room.ktx)
    annotationProcessor (libs.androidx.room.compiler)


    implementation (libs.kotlinx.coroutines.core)
    implementation (libs.kotlinx.coroutines.android)

    testImplementation (libs.androidx.core.testing)
    androidTestImplementation (libs.androidx.core.testing.v210)
    testImplementation (libs.kotlinx.coroutines.test)
    androidTestImplementation (libs.kotlinx.coroutines.test.v164)
    //  kaptAndroidTest(libs.androidx.hilt.compiler)
    testImplementation(libs.androidx.runner)
    androidTestImplementation(libs.androidx.runner)
    androidTestImplementation(libs.androidx.core)
    //  implementation(libs.hilt.android)
    implementation( libs.multidex)
    //   ksp(libs.hilt.compiler)

    implementation(libs.dagger.hilt)
    kapt(libs.dagger.hilt.compiler)
    ksp("androidx.room:room-compiler:2.6.1")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation (libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.coil.compose)

}