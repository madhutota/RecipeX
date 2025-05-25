package dev.madhu

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform