plugins {
    application
    id("com.github.ben-manes.versions") version "0.51.0"
    id("org.sonarqube") version "7.1.0.6387"
    checkstyle
}

sonar {
    properties {
        property("sonar.projectKey", "AlekseyKurnakov_java-project-61")
        property("sonar.organization", "alekseykurnakov")
    }
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("hexlet.code.App")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

checkstyle {
    toolVersion = "10.17.0"
    configFile = file("config/checkstyle/checkstyle.xml")
    isIgnoreFailures = false
}

