plugins {
    id("java")
    id("eclipse")
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

group = "GUIShop"
version = "1.0.0"

repositories {
    mavenCentral()
    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }
    maven {
        url = uri("https://repo.aikar.co/content/groups/aikar/")
    }
    maven {
        url = uri("https://jitpack.io")
    }
    flatDir {
        dirs("lib")
    }
}

dependencies{
    annotationProcessor("org.projectlombok", "lombok", "1.18.22")
    implementation("com.github.stefvanschie.inventoryframework", "IF", "0.10.4")
    compileOnly("org.spigotmc", "spigot-api", "1.18-R0.1-SNAPSHOT")
    compileOnly("org.projectlombok", "lombok", "1.18.22")
    compileOnly("com.github.MilkBowl", "VaultAPI", "1.7")
}

tasks{
    compileJava{
        options.encoding = "UTF-8"
    }
}