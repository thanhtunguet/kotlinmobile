package info.thanhtunguet.truesight.enums

enum class OrderType(val order: String) {
    ASC("ASC"),
    DESC("DESC");

    companion object {
        fun fromString(value: String) = OrderType.values().first { it.order == value }
    }
}