package com.nexign.activemqexample.service.impl;

import com.google.gson.Gson;
import com.nexign.activemqexample.model.MessageMock;
import com.nexign.activemqexample.service.api.MessageSender;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.jms.*;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class MessageSenderImpl implements MessageSender {

    private final JmsTemplate jmsTemplate;

    @Value("${queue.in}")
    private String queueName;

    public MessageSenderImpl(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @PostConstruct
    void postConstruct() {
        log.info("Input queue: " + queueName);
    }

    @Override
    public String send(@NonNull String message) {
        log.info("Sending message " + message);
//        jmsTemplate.send(queueName, session -> {
//           TextMessage msg =  session.createTextMessage();
//           msg.setStringProperty("role","Driver");
//           return msg;
//        });
//        Map<String, Object> map = new HashMap<>();
//        todo: test, delete!
//        map.put("role", "\'Driver\'");
//        jmsTemplate.convertAndSend(queueName, map);

//        jmsTemplate.send(queueName, new MessageCreator() {
//            @Override
//            public Message createMessage(Session session) throws JMSException {
//                MapMessage msg =  session.createMapMessage();
//                msg.setStringProperty("role", "Driver");
//                return msg;
//            }
//        });
        jmsTemplate.send(queueName, s -> s.createTextMessage(returnTestXml()));
        return message;
    }

    private String returnTestXml(){
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<root>\n" +
                "  <role>Driver</role>\n" +
                "</root>";
    }
}
