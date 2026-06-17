plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

fun quoteBuildConfig(value: String): String {
    val escaped = value
        .replace("\\", "\\\\")
        .replace("\"", "\\\"")
        .replace("\n", "\\n")
    return "\"$escaped\""
}

fun loadR2Env(): Map<String, String> {
    val envFile = rootProject.layout.projectDirectory.file("../r2-video-player/.env").asFile
    if (!envFile.exists()) return emptyMap()

    return envFile.readLines()
        .map { it.trim() }
        .filter { it.isNotBlank() && !it.startsWith("#") && it.contains("=") }
        .associate { line ->
            val key = line.substringBefore("=").trim()
            val rawValue = line.substringAfter("=").trim()
            val value = rawValue
                .removeSurrounding("\"")
                .removeSurrounding("'")
            key to value
        }
}

val r2Env = loadR2Env()

android {
    namespace = "com.xiuzai.r2player"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.xiuzai.r2player"
        minSdk = 26
        targetSdk = 36
        versionCode = 11
        versionName = "1.0"

        buildConfigField("String", "R2_APP_TITLE", quoteBuildConfig(r2Env["APP_TITLE"] ?: "R2 Player"))
        buildConfigField("String", "ALIST_BASE_URL", quoteBuildConfig(r2Env["ALIST_BASE_URL"].orEmpty()))
        buildConfigField("String", "ALIST_TOKEN", quoteBuildConfig(r2Env["ALIST_TOKEN"].orEmpty()))
        buildConfigField("String", "ALIST_USERNAME", quoteBuildConfig(r2Env["ALIST_USERNAME"].orEmpty()))
        buildConfigField("String", "ALIST_PASSWORD", quoteBuildConfig(r2Env["ALIST_PASSWORD"].orEmpty()))
        buildConfigField(
            "String",
            "ALIST_ROOT_PATHS",
            quoteBuildConfig(r2Env["ALIST_ROOT_PATHS"] ?: r2Env["ALIST_ROOT_PATH"] ?: "/"),
        )
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }

    buildFeatures {
        compose = true
        buildConfig = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    val composeBom = platform("androidx.compose:compose-bom:2024.10.01")

    implementation("androidx.core:core-ktx:1.17.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.activity:activity-compose:1.10.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
    implementation("com.google.android.material:material:1.12.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("androidx.media3:media3-exoplayer:1.5.1")
    implementation("androidx.media3:media3-exoplayer-hls:1.5.1")
    implementation("androidx.media3:media3-ui:1.5.1")

    implementation(composeBom)
    androidTestImplementation(composeBom)

    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")

    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}
