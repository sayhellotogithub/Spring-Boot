package com.iblogstreet.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String sayhello(String name) {
        return "hello spring " + name;
    }

   


}
