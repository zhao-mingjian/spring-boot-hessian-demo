package com.zmj.main.springboothessiandemo.service.impl;

import com.zmj.main.springboothessiandemo.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Title: HelloWorldServiceImpl
 *
 * @author jason
 * @version 1.0
 * @date 2019/1/17
 * @Description:
 */
@Service("helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldServiceImpl.class);

    @Override
    public String sayHello(String name) {
        logger.info("来源于：{}", name);
        return "来源于：" + name;
    }

}