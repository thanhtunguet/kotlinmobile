package info.thanhtunguet.truesight

import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.serializers.LocalDateTimeIso8601Serializer
import kotlinx.serialization.Serializable

interface WithTimestamp {
    @Serializable(with = LocalDateTimeIso8601Serializer::class)
    var createdAt: LocalDateTime

    @Serializable(with = LocalDateTimeIso8601Serializer::class)
    var updatedAt: LocalDateTime

    @Serializable(with = LocalDateTimeIso8601Serializer::class)
    var deletedAt: LocalDateTime?
}