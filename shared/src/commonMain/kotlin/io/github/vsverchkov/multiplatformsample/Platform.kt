package io.github.vsverchkov.multiplatformsample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform