plugins {
    id("dev.kikugie.stonecutter")
}

stonecutter active "26.2-fabric"

tasks.register("chiseledBuild") {
    group = "project"
    dependsOn(stonecutter.tasks.named("build").map { it.values })
}

tasks.register("chiseledReleaseMod") {
    group = "project"
    dependsOn(stonecutter.tasks.named("publishMods").map { it.values })
}
