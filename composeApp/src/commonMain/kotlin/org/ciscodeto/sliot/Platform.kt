package org.ciscodeto.sliot

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform