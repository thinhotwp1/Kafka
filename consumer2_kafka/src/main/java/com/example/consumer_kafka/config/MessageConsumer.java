package com.example.consumer_kafka.config;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    private static final String TOPIC_EKYC_SERVICE = "log_ekyc_service";

    @KafkaListener(topics = TOPIC_EKYC_SERVICE, groupId = "my_group")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
    }
}