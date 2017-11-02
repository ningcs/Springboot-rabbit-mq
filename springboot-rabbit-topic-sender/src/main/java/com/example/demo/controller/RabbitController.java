package com.example.demo.controller;

import com.example.demo.sender.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ningcs on 2017/10/30.
 */
@RestController
@RequestMapping("rabbit")
public class RabbitController {

    @Autowired
    private HelloSender helloSender;

    @RequestMapping(value = "/hello",method = {RequestMethod.GET, RequestMethod.POST})
    public String helloSender(){
        helloSender.send("hello,rabbit~");
        return "发送成功";
    }
}
