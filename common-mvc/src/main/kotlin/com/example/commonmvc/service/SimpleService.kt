package com.example.commonmvc.service

import com.example.commonmvc.domain.User
import com.example.commonmvc.repository.SimpleRepository
import org.springframework.stereotype.Service


@Service
class SimpleService(
    private val simpleRepository: SimpleRepository
) {
    fun getUsers(): List<User> {
        return simpleRepository.findAll()
    }

    fun prepareUsers() {
        Array(1000) { it }.forEach {
            simpleRepository.save(
                User(name = "user$it")
            )
        }
    }
}