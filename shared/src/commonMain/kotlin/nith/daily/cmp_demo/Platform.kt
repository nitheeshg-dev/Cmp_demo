package nith.daily.cmp_demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform