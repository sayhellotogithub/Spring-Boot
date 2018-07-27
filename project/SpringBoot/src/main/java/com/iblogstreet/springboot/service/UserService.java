package com.iblogstreet.springboot.service;


import com.iblogstreet.springboot.pojo.User;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Armyone
 * @date 2018/7/27 10:28
 * @desc
 */

public interface UserService {
    List<User> getUserList(String name);
    /**
     * 根据用户名来查询用户列表
     *
     * @param age
     * @return
     */
    @Select("select id,username,age,phone,email from user where age=#{age}")
    List<User> getUserListByAge(int age);
}
