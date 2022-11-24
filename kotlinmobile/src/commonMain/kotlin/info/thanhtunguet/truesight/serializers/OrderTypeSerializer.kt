package info.thanhtunguet.truesight.serializers

import info.thanhtunguet.truesight.enums.OrderType
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

class OrderTypeSerializer : KSerializer<OrderType> {
    override fun deserialize(decoder: Decoder): OrderType {
        val order = decoder.decodeString()
        return OrderType.fromString(order)
    }

    override val descriptor: SerialDescriptor
        get() = PrimitiveSerialDescriptor(OrderType::class.simpleName!!, PrimitiveKind.INT)

    override fun serialize(encoder: Encoder, value: OrderType) {
        encoder.encodeString(value.order)
    }
}