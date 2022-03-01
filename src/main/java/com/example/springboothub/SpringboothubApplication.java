package com.example.springboothub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//申明让spring boot自动给程序进行必要的配置，
// 这个配置等同于：@Configuration ，@EnableAutoConfiguration
// 和 @ComponentScan 三个配置。
//@SpringBootConfiguration:这个注解实际就是一个@Configuration，标识启动类也是一个配置类。
//@ComponentScan:组件扫描，可自动发现和装配一些Bean。
//@Autowired
//自动导入依赖的bean。
@SpringBootApplication
@MapperScan("com.example.springboothub.dao")
public class SpringboothubApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringboothubApplication.class, args);
    }

}
