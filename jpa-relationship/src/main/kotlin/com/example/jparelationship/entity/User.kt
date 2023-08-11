package com.example.jparelationship.entity

import jakarta.persistence.*

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0,
    @OneToOne
    val address: UserAddress? = null,
    val name: String
)