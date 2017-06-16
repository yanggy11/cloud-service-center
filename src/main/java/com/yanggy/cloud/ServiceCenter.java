package com.yanggy.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by yangguiyun on 2017/6/12.
 */

@EnableEurekaServer
@SpringBootApplication
public class ServiceCenter {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCenter.class, args);
    }
}
