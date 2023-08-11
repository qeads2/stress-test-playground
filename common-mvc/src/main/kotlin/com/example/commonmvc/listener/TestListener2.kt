package com.example.commonmvc.listener

import com.example.commonmvc.event.TestCreated
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class TestListener2 {
    @EventListener
    fun testEventListener(testCreated: TestCreated) {
        println("testEventListener2: ${testCreated.id}")
    }
}