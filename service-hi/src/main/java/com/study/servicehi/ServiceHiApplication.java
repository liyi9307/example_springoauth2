package com.study.servicehi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/*主要是相关的配置与auth-server相同
* 注册地址(设置没有权限限制)：/user/registry
*       curl -d "username=liyi&password=123456" "192.168.1.108:8763/user/registry"
* 访问不需要权限的地址：/hello
*       curl -H "Authorization:bearer 2163f699-7c10-4418-b6e5-19b984341322" -X GET 192.168.1.108:8763/hello
* 访问权限地址（ADMIN,可在数据库中进行设置）：/admin
*       curl -H "Authorization:bearer 2163f699-7c10-4418-b6e5-19b984341322" -X GET 192.168.1.108:8763/admin
* */
@SpringBootApplication
@EnableEurekaClient
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }

}

