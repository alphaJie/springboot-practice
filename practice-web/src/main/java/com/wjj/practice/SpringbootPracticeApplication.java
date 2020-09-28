package com.wjj.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.wjj.practice")
public class SpringbootPracticeApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringbootPracticeApplication.class,args);
    }
}
