package com.yaoyao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaoyao on 2020-03-22.
 */
@RestController
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        return "hello!";
    }

}
