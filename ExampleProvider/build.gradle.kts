dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}

// Use an integer for version numbers
version = 1

cloudstream {
    description = "FIRST AZE TV DEPO"
    authors = listOf("moggedbyrex")
    status = 3
    tvTypes = listOf("Live")
    requiresResources = true
    language = "az"
    iconUrl = "https://files.catbox.moe/tkipct.jpg"
}

android {
    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}
