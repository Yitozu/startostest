package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: s
 * @date: 2022/1/7 16:51
 * @description:
 */
@RestController
public class TestController {
    @GetMapping("test")
    public String test(){
        return "hello";
    }
}
