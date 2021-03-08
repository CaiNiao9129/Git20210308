package com.cduestc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author sh
 * @create 2019-06-16 17:05
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@EnableEurekaClient //添加eureka服务端
@EnableDiscoveryClient//服务发现
public class DeptProvider8002_App {
    public static void main(String[] args){
        SpringApplication.run(DeptProvider8002_App.class,args);
    }
}
