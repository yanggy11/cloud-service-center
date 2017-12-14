#spring cloud 配置中心搭建

使用 netflix提供的ureka搭建服务注册中心。

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
  port: 8080 #端口号

spring:
  application:
    name: cloud-config
  
eureka:
  instance:
      hostname: localhost #设置主机名
  client:
    fetchRegistry : false  #是否检索服务，只是作为注册中心，不需要检索服务，故设置为FALSE
    registerWithEureka: false # 是否向 Eureka 注册服务。服务注册中心服务，没有作为集群，所以不需要自注册，设置为 false
  server:
      waitTimeInMsWhenSyncEmpty: 0
```
