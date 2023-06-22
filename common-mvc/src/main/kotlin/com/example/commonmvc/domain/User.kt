package com.example.commonmvc.domain

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "user")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    val createdAt: LocalDateTime
)