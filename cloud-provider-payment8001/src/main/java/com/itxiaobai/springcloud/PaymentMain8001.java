package com.itxiaobai.springcloud;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
@MapperScan("com.itxiaobai.mapper")
public class PaymentMain8001
{
    public static void main(String[] args) {
            SpringApplication.run(PaymentMain8001.class, args);
    }
}
