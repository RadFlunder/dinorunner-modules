rootProject.name = "dinorunner-modules"

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.fabricmc.net/")
    }
}

include("dinorunner")
include("dinorunner-server")
include("dinorunner-api")
