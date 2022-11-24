val kotlinVersion = "1.7.10"

buildscript {
    val kotlinVersion = "1.7.10"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = kotlinVersion))
        classpath(kotlin("serialization", version = kotlinVersion))
        classpath("io.realm.kotlin:gradle-plugin:1.4.0")
    }
}

publishing {
    repositories {
        maven {
            //...
        }
    }
}

plugins {
    val kotlinVersion = "1.7.10"
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version("7.3.1").apply(false)
    kotlin("multiplatform").version(kotlinVersion).apply(false)
    `maven-publish`
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
