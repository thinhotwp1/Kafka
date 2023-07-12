package com.example.product_kafka.controller;

import com.example.product_kafka.config.MessageProducer;
import com.example.product_kafka.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    MessageProducer sendMessage;

    @PostMapping("/send-kafka")
    public void sendLogKafka(@RequestBody Message message) {
        try {
            sendMessage.sendMessageKafka(message.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    @PostMapping("/send-ekyc")
    public void sendLogEkyc (@RequestBody Message message) {
        try {
            sendMessage.sendMessageEkyc(message.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
