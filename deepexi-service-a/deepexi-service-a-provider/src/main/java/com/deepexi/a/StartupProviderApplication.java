package com.deepexi.a;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by donh on 2018/11/5.
 * EnableDiscoveryClient 用于启动服务发现功能
 * EnableFeignClients 用于启动Fegin功能
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.deepexi.a.mapper")
public class StartupProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartupProviderApplication.class, args);
    }
}