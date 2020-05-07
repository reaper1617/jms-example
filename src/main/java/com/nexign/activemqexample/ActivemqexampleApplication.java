package com.nexign.activemqexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActivemqexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivemqexampleApplication.class, args);
    }

}
