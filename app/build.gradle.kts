plugins {
    // Плагин для Java
    id("java")

    // Плагин для запуска приложения
    id("application")

    // Плагин, который проверяет новые версии зависимостей
    id("com.github.ben-manes.versions") version "0.51.0"
}

repositories {
    mavenCentral()
}

application {
    // Главный класс приложения
    mainClass.set("hexlet.code.App")
}

// (опционально) Настройки Java версии
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}