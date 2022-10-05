package org.zsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.zsd.config.RpcProperties;

public class ServiceHello {
    @Autowired
    RpcProperties rpcProperties;
    public String hello(){
        return "hello world" + rpcProperties.getSecrete();
    }
}
