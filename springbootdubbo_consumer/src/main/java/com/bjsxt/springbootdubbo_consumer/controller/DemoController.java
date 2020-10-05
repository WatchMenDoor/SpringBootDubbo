package com.bjsxt.springbootdubbo_consumer.controller;

import com.bjsxt.springbootdubbo_consumer.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/getmsg")
    public String getMsg(String str){
        return this.demoService.getMsg(str);
    }
}