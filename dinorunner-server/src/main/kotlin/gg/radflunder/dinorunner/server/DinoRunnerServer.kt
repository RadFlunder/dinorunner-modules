package gg.radflunder.dinorunner.server

import net.fabricmc.api.ModInitializer
import net.silkmc.silk.core.logging.logger

class DinoRunnerServer : ModInitializer {

    override fun onInitialize() {
        logger().info("INITIALIZED SERVER")
    }
}
