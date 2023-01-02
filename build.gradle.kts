import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun getTestPath(): Any {
    return if (System.getenv("ReportPath")!= null){
        System.getenv("ReportPath")
    }else{
        "$buildDir/reports/tests/test"
    }
}

plugins {
    kotlin("jvm") version "1.7.10"
    application
    id("test-report-aggregation")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.cucumber:cucumber-java8:7.8.1")
    testImplementation("io.cucumber:cucumber-junit:7.10.0")
}

tasks.test {
    useJUnitPlatform()
    useJUnit()
    reports.html.destination = file(getTestPath())
    testLogging.showStandardStreams = true
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}
