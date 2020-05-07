package com.nexign.activemqexample.service.api;

import com.nexign.activemqexample.model.MessageMock;
import lombok.NonNull;

public interface MessageSender {
    String send(@NonNull String message);
}
