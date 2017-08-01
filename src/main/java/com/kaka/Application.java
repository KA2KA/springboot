package com.kaka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.kaka.dao")//设置mybatis的Dao
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
