package com.example.product_kafka.model;

import lombok.Data;

@Data
public class Message {
    private int id;
    private String description;

    public Message(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public Message() {
    }
}
