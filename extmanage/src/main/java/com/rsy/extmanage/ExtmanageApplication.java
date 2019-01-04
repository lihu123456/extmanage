package com.rsy.extmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.rsy.extmanage.dao")
public class ExtmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExtmanageApplication.class, args);
    }

}

