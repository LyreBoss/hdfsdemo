package com.demo.yun;

/**
 * Created by lyre on 2018/12/17
 **/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@SpringBootApplication //Spring Boot核心注解，用于开启自动配置
@ComponentScan(value = "com.demo.yun")
public class DemoApplication extends SpringBootServletInitializer {

    @RequestMapping("/")
    String index(){
        return "Hello Spring Boot";
    }


    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }



}
