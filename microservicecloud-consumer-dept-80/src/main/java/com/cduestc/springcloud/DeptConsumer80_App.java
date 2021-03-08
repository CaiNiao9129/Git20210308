package com.cduestc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author sh
 * @create 2019-06-16 17:05
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
//该问题是由于在消费者项目中引入了mybatis-spring-boot-starter的依赖，
// 这个依赖会根据自动配置约束自己去配置数据源，而消费者项目中并没有dataSource相关的配置，所以出错。
//排除依赖
@EnableEurekaClient
public class DeptConsumer80_App {
    public static void main(String[] args){
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
