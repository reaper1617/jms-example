package com.nexign.activemqexample.service.impl;

import com.nexign.activemqexample.service.api.MessageHandler;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Service
public class MessageHandlerImpl implements MessageHandler {

    private static final Map<UUID, Object> RUNTIME_MAP = new ConcurrentHashMap<>();

    @JmsListener(destination = "${queue.in}")
    @SendTo("${queue.out}")
    @Override
    public String handle(@NonNull String message) {
        log.info("Message received: " + message);
        return message;
    }

//    @JmsListener(destination = "${queue.in}")
//    @SendTo("${queue.out}")
//    public Map<String,Object> handle(@NonNull Map<String,Object> message) {
//        log.info("Message received: " + message);
//        return message;
//    }

    @JmsListener(destination = "${queue.out}")
    public void handleOutputResult(@NonNull String message) {
        log.info("Received message in output topic: " + message);
        RUNTIME_MAP.put(UUID.randomUUID(), message);
    }




//    @JmsListener(destination = "${queue.out}")
//    public void handleOutputResult(@NonNull Map<String,Object> message) {
//        log.info("Received message in output topic: " + message);
//        RUNTIME_MAP.put(UUID.randomUUID(), message);
//    }
}
