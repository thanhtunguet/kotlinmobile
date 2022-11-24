package info.thanhtunguet.truesight

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
