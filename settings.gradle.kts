pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.architectury.dev")
        maven("https://maven.fabricmc.net")
        maven("https://maven.neoforged.net/releases")
        maven("https://maven.kikugie.dev/snapshots")
    }
}

plugins {
    id("dev.kikugie.stonecutter") version "0.9.7"
}

stonecutter {
    create(rootProject) {
        version("26.2-fabric", "26.2")
        version("26.2-neo", "26.2")

        version("1.21.5-fabric", "1.21.5")
        version("1.21.5-neo", "1.21.5")

        version("1.21.4-fabric", "1.21.4")
        version("1.21.4-neo", "1.21.4")

        version("1.21.1-neo", "1.21.1") // :pain:

        vcsVersion = "26.2-fabric"
    }
}

rootProject.name = "ModpackUtils"
