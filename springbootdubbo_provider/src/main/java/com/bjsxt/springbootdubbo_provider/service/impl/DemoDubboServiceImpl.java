package com.bjsxt.springbootdubbo_provider.service.impl;

import com.bjsxt.dubbo.service.DemoDubboService;
import org.apache.dubbo.config.annotation.Service;

@Service(loadbalance = "roundroubin" ,weight = 3)
public class DemoDubboServiceImpl implements DemoDubboService {
    @Override
    public String showMsg(String str) {
        System.out.println("8889===========");
        return "Hello Dubbo "+str;
    }
}