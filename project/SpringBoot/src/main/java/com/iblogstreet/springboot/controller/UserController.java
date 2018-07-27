package com.iblogstreet.springboot.controller;


import com.iblogstreet.springboot.pojo.User;
import com.iblogstreet.springboot.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Armyone
 * @date 2018/7/27 10:33
 * @desc
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/get-userlist-by-name")
    public List<User> getUserListByName(String name) {
        System.out.println("name:" + name);
        return userService.getUserList(name);
    }

    @RequestMapping("/get-userlist-by-age")
    public List<User> getUserListByAge(int age) {
        System.out.println("age:" + age);
        return userService.getUserListByAge(age);
    }
}
