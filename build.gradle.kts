plugins {
    id("java")
    id("eclipse")
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

group = "GuiShop"
version = "1.0.0"

repositories {
    mavenCentral()
    flatDir {
        dirs("lib")
    }
}

dependencies{
    compileOnly("ru.ragnok123", "menuAPI", "1.0")
    compileOnly("org.powernukkit", "powernukkit", "1.5.1.0-PN")
}

tasks{
    compileJava{
        options.encoding = "UTF-8"
    }
}