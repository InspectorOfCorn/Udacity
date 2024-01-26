package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final String message;

    MessageService(String message) {
        System.out.println("Instantiated second bean");
        this.message = message;
    }

    public String uppercaseMessage() {
        return this.message.toUpperCase();
    }

    public String lowercaseMessage() {
        return this.message.toLowerCase();
    }
}