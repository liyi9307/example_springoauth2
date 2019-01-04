package com.study.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
/* 1.导包，添加依赖
*  2.配置相关信息
*  3.实体类和dao
*  4.获取token地址：/oauth/token
*   通过curl执行命令：curl ${clientId}:${secret}@${host}:${service.port}/oauth/token -d grant_type=password
*   -d username=${username} -d password=${password}
*   curl service-hi:123456@192.168.1.108:8762/uaa/oauth/token -d grant_type=password -d username=pp -d password=123456
*
*
* */
@SpringBootApplication
@EnableEurekaClient
@EnableResourceServer
public class AuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthServerApplication.class, args);
    }


}

