package com.zmj.main.springboothessianclient.controller;

import com.zmj.main.springboothessianclient.client.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: SayHelloController
 *
 * @author jason
 * @version 1.0
 * @date 2019/1/18
 * @Description:
 */
@RestController
public class SayHelloController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/test")
    public String test() {
        return helloWorldService.sayHello("Hessian.Client");
    }

}