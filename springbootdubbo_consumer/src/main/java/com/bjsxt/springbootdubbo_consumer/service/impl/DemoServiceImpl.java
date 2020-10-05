package com.bjsxt.springbootdubbo_consumer.service.impl;

import com.bjsxt.dubbo.service.DemoDubboService;
import com.bjsxt.springbootdubbo_consumer.service.DemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service // 使用的是 Spring 的 @Service 注解
public class DemoServiceImpl implements DemoService {
    @Reference
    private DemoDubboService demoDubboService;
    @Override
    public String getMsg(String str) {
        return this.demoDubboService.showMsg(str);
    }
}