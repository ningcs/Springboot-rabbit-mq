//package com.example.demo.receiver;
//
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.stereotype.Component;
//
///**
// * Created by ningcs on 2017/10/30.
// */
//@Component
//public class HelloReceive {
//
////    @RabbitListener(queues="queue")    //监听器监听指定的Queue
////    public void processC(String str) {
////        System.out.println("Receive:"+str);
////    }
//
//    @RabbitListener(queues="topic.message")    //监听器监听指定的Queue
//    public void process1(String str) {
//        System.out.println("message:"+str);
//    }
//    @RabbitListener(queues="topic.messages")    //监听器监听指定的Queue
//    public void process2(String str) {
//        System.out.println("messages:"+str);
//    }
//
//}