package com.example.stresstestplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StressTestPlaygroundApplication

fun main(args: Array<String>) {
    runApplication<StressTestPlaygroundApplication>(*args)
}
