package com.zmj.main.springboothessianclient;

import com.zmj.main.springboothessianclient.client.HelloWorldService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;


@SpringBootApplication
public class SpringBootHessianDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHessianDemoApplication.class, args);
    }

    @Bean
    public HessianProxyFactoryBean helloClient() {
        HessianProxyFactoryBean factory = new HessianProxyFactoryBean();
        factory.setServiceUrl("http://localhost:9090/HelloWorldService");
        factory.setServiceInterface(HelloWorldService.class);
        return factory;
    }

}

