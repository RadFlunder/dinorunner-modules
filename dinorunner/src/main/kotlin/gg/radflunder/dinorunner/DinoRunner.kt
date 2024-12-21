package gg.radflunder.dinorunner

import gg.radflunder.dinorunner.client.TestPacketCommand
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.DedicatedServerModInitializer
import net.fabricmc.api.ModInitializer
import net.minecraft.util.Identifier
import net.silkmc.silk.core.logging.logger

class DinoRunner : ModInitializer, ClientModInitializer, DedicatedServerModInitializer {

    override fun onInitialize() {

    }

    override fun onInitializeClient() {
        logger().info("INITIALIZED CLIENT")
        TestPacketCommand.init()

    }

    private val MOD_ID = "dinorunner"
    fun String.toId() = Identifier.of(MOD_ID, this)

    override fun onInitializeServer() {

    }
}
