package org.okarmus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mateusz on 06.12.16.
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @RequestMapping
    public String getHello() {
        return "hello";
    }
}
