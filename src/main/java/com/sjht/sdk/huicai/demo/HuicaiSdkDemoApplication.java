package com.sjht.sdk.huicai.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HuicaiSdkDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuicaiSdkDemoApplication.class, args);
    }

}
