package com.example.consumer_kafka.config;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "my_topic", groupId = "my_group")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
    }
}