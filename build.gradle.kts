plugins {
    kotlin("jvm") version "2.0.0"
}

group = "app.hendra"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.itextpdf:itextpdf:5.5.13.3")
    implementation("org.jetbrains.kotlinx:kandy-lets-plot:0.6.0")
    implementation("org.slf4j:slf4j-log4j12:2.0.13")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}