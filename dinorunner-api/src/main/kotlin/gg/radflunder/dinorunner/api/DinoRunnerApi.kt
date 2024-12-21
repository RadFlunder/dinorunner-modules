package gg.radflunder.dinorunner.api

import net.fabricmc.api.ModInitializer
import net.silkmc.silk.core.logging.logger

class DinoRunnerApi : ModInitializer {

    override fun onInitialize() {
        logger().info("INITIALIZED API")
    }
}
