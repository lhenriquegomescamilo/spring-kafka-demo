package com.camilo.demo.users

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class UserConsumer {
    private val logger: Logger = LoggerFactory.getLogger(javaClass)

    @KafkaListener(topics = [USER_TOPIC], groupId = "group_id")
    fun consume(message: String) {
        logger.info("#### --> Consumed message $message")
    }
}