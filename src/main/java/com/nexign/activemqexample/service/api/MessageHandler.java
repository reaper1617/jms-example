package com.nexign.activemqexample.service.api;

import com.nexign.activemqexample.model.MessageMock;
import lombok.NonNull;

import java.util.Map;

public interface MessageHandler {
    String handle(@NonNull String messageMock);
}
