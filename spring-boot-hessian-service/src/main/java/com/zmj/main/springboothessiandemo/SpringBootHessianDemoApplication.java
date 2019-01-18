package com.zmj.main.springboothessiandemo;

import com.zmj.main.springboothessiandemo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;


@SpringBootApplication
public class SpringBootHessianDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHessianDemoApplication.class, args);
    }

    @Autowired
    private HelloWorldService helloWorldService;

    @Bean(name = "/HelloWorldService")
    public HessianServiceExporter accountService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(helloWorldService);
        exporter.setServiceInterface(HelloWorldService.class);
        return exporter;
    }

}

