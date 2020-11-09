package com.zhuawa.springdemo.controller;

import com.zhuawa.demo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * demo测试
 */
@RestController
public class DemoController {
    @Resource(name = "demo")
    private DemoService demoService;

    @GetMapping("/say")
    public String sayWhat() {
        return demoService.say();
    }
}
