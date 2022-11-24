package info.thanhtunguet.truesight

import info.thanhtunguet.truesight.enums.OrderType
import info.thanhtunguet.truesight.serializers.OrderTypeSerializer
import kotlinx.serialization.Serializable

abstract class AbstractEntityFilter : AbstractEntity() {
    @Serializable
    var skip: Int = 0

    @Serializable
    var take: Int = 10

    @Serializable
    var orderBy: String? = null

    @Serializable(with = OrderTypeSerializer::class)
    var orderType: OrderType? = null
}