package com.iblogstreet.springboot.web;

import com.iblogstreet.springboot.domain.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String sayhello(String name) {
        return "hello springboot " + name;
    }

    //    @RequestMapping("/getuser")
//    public User getUser() {
//        return new User("test", 19, "kkdfdfdf");
//    }
    @RequestMapping(value = "getuser/{name}", method = RequestMethod.GET)
    public User getUser(@PathVariable String name) {
        return new User(name, 19, "kkdfdfdf");
    }

    @RequestMapping("/getobjectuser")
    public User getObjectUser(User user) {
        return user;
    }

    @RequestMapping("/saveuser")
    public String saveUser(@Valid User user, BindingResult bindingResult) {
        System.out.println(user);
        StringBuilder stringBuilder = new StringBuilder();
        if (bindingResult.hasErrors()) {
            for (ObjectError objectError : bindingResult.getAllErrors()) {
                System.out.println(objectError.getCode() + " " + objectError.getDefaultMessage());
                stringBuilder.append(objectError.getCode() + " " + objectError.getDefaultMessage());
            }
        }
        return stringBuilder.toString();
    }

}
