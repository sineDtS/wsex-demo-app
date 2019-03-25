package com.websockets.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Greeting {

    private String content;

    public Greeting(String content) {
        this.content = content;
    }
}
