package com.example.jparelationship.entity

import jakarta.persistence.*

@Entity
class UserAddress(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    val user: User,
    val name: String
)