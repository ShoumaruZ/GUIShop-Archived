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
    compileOnly("org.powernukkit", "powernukkit", "1.5.1.0-PN")
    compileOnly("fishnetwork.userapi", "UserAPI", "1.0.0")
    compileOnly("ru.nukkitx", "FormAPI", "1.0.9")
    compileOnly("ru.ragnok123", "menuAPI", "1.0")
}

tasks{
    compileJava{
        options.encoding = "UTF-8"
    }
}