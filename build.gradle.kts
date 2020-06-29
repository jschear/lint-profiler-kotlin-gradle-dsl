
buildscript {
    repositories {
        google()
        jcenter()
    }
    val kotlinVersion by extra("1.3.72")
    dependencies {
        classpath("com.android.tools.build:gradle:4.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}