package com.xpossess.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Freestyle
 * @MapperScan(value = "包名") 批量扫描mapper 接口
 */
@MapperScan(value = "com.xpossess.springboot.mapper")
@SpringBootApplication
public class SpringBootDataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataMybatisApplication.class, args);
    }

}
