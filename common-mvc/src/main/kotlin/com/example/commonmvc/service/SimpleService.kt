package com.example.commonmvc.service

import com.example.commonmvc.domain.User
import com.example.commonmvc.event.TestCreated
import com.example.commonmvc.repository.SimpleRepository
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service


@Service
class SimpleService(
    private val simpleRepository: SimpleRepository,
    private val eventPublisher: ApplicationEventPublisher,

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

    fun springEventTest() {
        eventPublisher.publishEvent(TestCreated(1))
    }
}