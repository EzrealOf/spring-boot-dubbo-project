package com.ezreal.manager.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @ApiOperation(value = "hello word 测试", httpMethod = "GET")
    @GetMapping("/api/manager/hello")
    public String hello() {
        return "hello world";
    }
}
