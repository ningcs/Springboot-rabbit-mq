package com.example.demo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by ningcs on 2017/10/30.
 */
@Component
public class HelloReceive {

    @RabbitListener(queues="queue")    //监听器监听指定的Queue
    public void processC(String str) {
        System.out.println("Receive:"+str);
    }


}