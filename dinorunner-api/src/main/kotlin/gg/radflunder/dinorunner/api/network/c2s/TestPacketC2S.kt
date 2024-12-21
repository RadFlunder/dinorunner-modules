package gg.radflunder.dinorunner.api.network.c2s

import kotlinx.serialization.Serializable
import net.minecraft.util.Identifier
import net.silkmc.silk.network.packet.c2sPacket

@Serializable
data class MessagePacket(
    val player: String,
    val message: String
)

val testMessageC2S = c2sPacket<MessagePacket>(Identifier.of("dinorunner", "message-packet"))