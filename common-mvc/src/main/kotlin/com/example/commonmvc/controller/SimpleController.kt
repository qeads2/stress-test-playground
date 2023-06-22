package com.example.commonmvc.controller

import com.example.commonmvc.controller.dto.UserDTO
import com.example.commonmvc.service.SimpleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/api")
class SimpleController(
    private val simpleService: SimpleService
) {
    @GetMapping("/users")
    fun getUsers(): List<UserDTO> {
        return simpleService.getUsers()
            .map { UserDTO.of(it) }
    }

    @PostMapping("/users")
    fun prepareUsers() {
        simpleService.prepareUsers()
    }
}