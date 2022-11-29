package com.workshop.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/rest")
public class MessageResource {
    @Value("${message: Default Hello}")
    private String message;

    @Value("${cost.value}")
    private int value;

    @GetMapping("/message")
    public String message(){
        return String.valueOf(value);
    }
}
