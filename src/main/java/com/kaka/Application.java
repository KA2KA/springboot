package com.kaka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wuwanggao@163.com
 */
@SpringBootApplication
@MapperScan(basePackages = "com.kaka.users.dao")//设置mybatis的Dao
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
