plugins {
    kotlin("jvm") version "2.2.20"
}

group = "unica.ds4h.miage.donati"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.google.genai:google-genai:1.4.1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}