#spring cloud 配置中心搭建
#引入maven 依赖
```
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-eureka-server</artifactId>
        </dependency>
```
#mian 类中加入@EnableUrekaServer注解，启用注册中心

#配置application.yml文件
```
server:
  port: 8888 #端口号

spring:
  application:
    name: cloud-config
  
eureka:
  client:
    register-with-eureka: false
    fetch-registry: false
```
