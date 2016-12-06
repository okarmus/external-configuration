package org.okarmus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mateusz on 06.12.16.
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @Value("${message}")
    private String message;

    @RequestMapping
    public String getHello() {
        return message;
    }
}
