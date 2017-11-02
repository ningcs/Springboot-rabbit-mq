package com.example.demo.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by ningcs on 2017/10/30.
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate template;

    public void send(String msg) {
        System.out.println(msg);
        template.convertAndSend("queue","hello,rabbit~");
    }
}