plugins {
    kotlin("multiplatform") version "1.4.32"
}

group = "nl.jolanrensen"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
                freeCompilerArgs += listOf(
                    "-Xopt-in=kotlin.RequiresOptIn",
                    "-Xopt-in=kotlin.experimental.ExperimentalTypeInference"
                )
            }
        }
        testRuns["test"].executionTask.configure {
            useJUnit()
        }
    }
    js(LEGACY) {
        compilations.all {
            kotlinOptions {
                freeCompilerArgs += listOf(
                    "-Xopt-in=kotlin.RequiresOptIn",
                    "-Xopt-in=kotlin.experimental.ExperimentalTypeInference"
                )
            }
        }
        browser {
            commonWebpackConfig {
                cssSupport.enabled = true
            }
        }
    }
    val hostOs = System.getProperty("os.name")
    val isMingwX64 = hostOs.startsWith("Windows")
    val nativeTarget = when {
        hostOs == "Mac OS X" -> macosX64("native")
        hostOs == "Linux" -> linuxX64("native")
        isMingwX64 -> mingwX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    nativeTarget.compilations.all {
        kotlinOptions {
            freeCompilerArgs += listOf(
                "-Xopt-in=kotlin.RequiresOptIn",
                "-Xopt-in=kotlin.experimental.ExperimentalTypeInference"
            )
        }
    }


    sourceSets {
        val commonMain by getting {
            dependencies {
//                implementation(kotlin("stdlib-common"))
                implementation(kotlin("script-runtime"))
//                implementation(kotlin("reflect"))
//                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.1.0")
            }
        }
        val commonTest by getting {
            dependencies {
//                implementation(kotlin("stdlib-common"))
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jvmMain by getting {
            dependencies {
//                implementation(kotlin("stdlib-common"))

            }
        }
        val jvmTest by getting {
            dependencies {
//                implementation(kotlin("test-common"))
//                implementation(kotlin("stdlib-common"))
//                implementation(kotlin("test"))
                implementation(kotlin("test-junit"))
            }
        }
        val jsMain by getting {
            dependencies {
//                implementation(kotlin("stdlib-js"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
        val nativeMain by getting {
            dependencies {

            }
        }
        val nativeTest by getting
    }
}
