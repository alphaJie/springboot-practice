package com.wjj.practice.web;

import com.wjj.practice.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("sayHello")
    public String sayHello(){
        return demoService.sayHello();
    }
}
