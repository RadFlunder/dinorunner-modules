package gg.radflunder.dinorunner.client

import com.mojang.brigadier.arguments.StringArgumentType
import gg.radflunder.dinorunner.api.network.c2s.MessagePacket
import gg.radflunder.dinorunner.api.network.c2s.testMessageC2S
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback

object TestPacketCommand {
    fun init() {
        ClientCommandRegistrationCallback.EVENT.register { dispatcher, _ ->
            dispatcher.register(ClientCommandManager.literal("message")
                .then(ClientCommandManager.argument("message", StringArgumentType.string())
                    .executes { context ->
                        val message = StringArgumentType.getString(context, "message")
                        val player = context.source.player
                        1
                    }
                )
            )
        }
    }
}