package com.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lzy on 2017/12/20.
 */
@RestController
@EnableAutoConfiguration
public class helloController {
    @RequestMapping("/hello")
    public String index(){
        System.out.println("进入controller");
        return "hello world!!!";
    }
}
