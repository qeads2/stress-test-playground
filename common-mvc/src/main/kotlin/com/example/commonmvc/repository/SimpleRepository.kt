package com.example.commonmvc.repository

import com.example.commonmvc.domain.User
import org.springframework.data.jpa.repository.JpaRepository


interface SimpleRepository: JpaRepository<User, Int> {
}