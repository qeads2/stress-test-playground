package com.example.commonmvc.controller.dto

import com.example.commonmvc.domain.User
import java.time.LocalDateTime

data class UserDTO (
    val id: Int,
    val name: String,
    val createdAt: LocalDateTime
) {
    companion object {
        fun of(userDTO: User): UserDTO {
            return UserDTO(
                id = userDTO.id,
                name = userDTO.name,
                createdAt = userDTO.createdAt
            )
        }
    }
}