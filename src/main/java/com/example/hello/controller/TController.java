package com.example.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TController {

    @RequestMapping("hello")
    public String hello(String pa){
        return "return::" + pa;
    }
}


// 201912021129 - 1
// 201912021131 第二次修改