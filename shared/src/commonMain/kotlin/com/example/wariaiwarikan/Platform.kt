package com.example.wariaiwarikan

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform