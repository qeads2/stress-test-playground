package com.example.jparelationship

import com.example.jparelationship.entity.User
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpaRelationShipApplication

fun main(args: Array<String>) {
    runApplication<JpaRelationShipApplication>(*args)
    val user = User(name = "test")
    println(user)
}