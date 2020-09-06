package com.camilo.demo.users

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/users"])
class UserController(
        @Autowired val userProducer: UserProducer
) {

    @PostMapping(value = ["/publish"])
    fun sendMessageToTopics(@RequestParam("message") message: String) = userProducer.sendMessage(message)
}