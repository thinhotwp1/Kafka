package com.example.product_kafka.controller;

import com.example.product_kafka.config.MessageProducer;
import com.example.product_kafka.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    MessageProducer sendMessage;

    @PostMapping("/send")
    public void send(Message message){
        System.out.println("ProductController: "+message.toString());
        try {
            sendMessage.sendMessage(message.toString());
        }catch (Exception e){
            System.out.println("Error: "+ e);
        }
    }

    @PostMapping("/send1")
    public void send1(Message message){
        System.out.println("ProductController: "+message.toString());
    }
}
