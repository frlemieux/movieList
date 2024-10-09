// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.android.library) apply false
}

buildscript {
    dependencies {
        classpath(libs.secrets.gradle.plugin)
    }
}

subprojects {
    tasks.register("unitTestAll") {
        group = "verification"
        description = "Runs all the unit tests in the project: :test for testInternalDebugUnitTest for android modules"
        pluginManager.withPlugin("kotlin-android") {
            dependsOn("testDebugUnitTest")
        }
    }
}


