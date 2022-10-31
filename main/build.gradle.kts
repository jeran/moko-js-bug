plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("org.jetbrains.compose")
    id("dev.icerock.mobile.multiplatform-resources")
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("dev.icerock.moko:resources:0.20.1")
            }
        }
        val jsMain by getting {
            dependencies {
                implementation(compose.web.core)
            }
        }
    }
}

multiplatformResources {
    multiplatformResourcesPackage = "strings.resources"
}
