package info.thanhtunguet.truesight

import kotlinx.serialization.Serializable

@Serializable
abstract class AbstractEntity {
    @Serializable
    var errors: Map<String, String?>? = null

    @Serializable
    var warnings: Map<String, String?>? = null

    @Serializable()
    var informations: Map<String, String?>? = null
}
