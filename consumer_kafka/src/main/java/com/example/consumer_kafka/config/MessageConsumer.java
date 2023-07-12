package com.example.consumer_kafka.config;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    private static final String TOPIC_KAFKA_SERVICE = "log_kafka_service";

    @KafkaListener(topics = TOPIC_KAFKA_SERVICE, groupId = "my_group")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
    }
}