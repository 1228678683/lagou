package com.lagou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient   //eureka客户端
@EnableFeignClients    //添加feign的支持
public class web_consumer_8083 {
    public static void main(String[] args) {
        SpringApplication.run(web_consumer_8083.class);
    }
}
