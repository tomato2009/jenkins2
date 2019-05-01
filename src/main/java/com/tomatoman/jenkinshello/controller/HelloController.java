package com.tomatoman.jenkinshello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc:
 * @Author: YanQing
 * @Date: 2019/4/29 18:36
 * @Version 1.0
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello Jenkins World";
    }

    @GetMapping("hello2")
    public String hello2() {
        return "Hello Jenkins World";
    }
}
