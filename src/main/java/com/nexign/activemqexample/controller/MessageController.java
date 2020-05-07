package com.nexign.activemqexample.controller;

import com.nexign.activemqexample.service.api.MessageSender;
import com.nexign.activemqexample.util.RequestSample;
import lombok.NonNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final MessageSender messageSender;

    public MessageController(@NonNull MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @PostMapping("/send")
    public ResponseEntity<String> sendMock(@NonNull RequestSample sample) {
        String result = messageSender.send(sample.value());
        return ResponseEntity.ok(result);
    }
}
