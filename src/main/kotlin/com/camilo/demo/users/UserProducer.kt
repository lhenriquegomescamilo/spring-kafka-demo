package com.camilo.demo.users

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class UserProducer(
        val kafkaTemplate: KafkaTemplate<String, String>
) {
    private val logger: Logger = LoggerFactory.getLogger(javaClass)

    fun sendMessage(message: String) {
        logger.info("##### --> Producing message $message")
        kafkaTemplate.send(USER_TOPIC, message)
    }
}