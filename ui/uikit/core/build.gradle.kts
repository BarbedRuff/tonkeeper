plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "uikit"
    compileSdk = Build.compileSdkVersion
    defaultConfig {
        minSdk = Build.minSdkVersion
        consumerProguardFiles("consumer-rules.pro")
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    api(project(Dependence.UIKit.color))
    api(project(Dependence.UIKit.icon))
    api(project(Dependence.UIKit.list))

    implementation(Dependence.KotlinX.coroutines)
    implementation(Dependence.AndroidX.core)
    implementation(Dependence.AndroidX.activity)
    implementation(Dependence.AndroidX.fragment)
    implementation(Dependence.AndroidX.appCompat)
    implementation(Dependence.AndroidX.splashscreen)
    implementation(Dependence.UI.material)
    implementation(Dependence.fresco) {
        exclude(group = "com.facebook.soloader", module = "soloader")
        exclude(group = "com.facebook.fresco", module = "soloader")
        exclude(group = "com.facebook.fresco", module = "nativeimagefilters")
        exclude(group = "com.facebook.fresco", module = "nativeimagetranscoder")
        exclude(group = "com.facebook.fresco", module = "memory-type-native")
        exclude(group = "com.facebook.fresco", module = "imagepipeline-native")
    }
}
