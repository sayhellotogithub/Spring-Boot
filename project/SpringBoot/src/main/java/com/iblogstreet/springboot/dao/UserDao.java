package com.iblogstreet.springboot.dao;

import com.iblogstreet.springboot.pojo.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Armyone
 * @date 2018/7/27 10:23
 * @desc
 */
@Mapper
public interface UserDao {
    /**
     * 根据用户名来查询用户列表
     *
     * @param name
     * @return
     */
    @Select("select id,username,age,phone,email from user where username like concat('%',#{username},'%')")
    List<User> getUserList(String name);

    /**
     * 根据用户名来查询用户列表
     *
     * @param age
     * @return
     */
    @Results(id = "userResult", value = {
            @Result(property = "email", column = "phone"),
            @Result(property = "phone", column = "email")
    })
    @Select("select id,username,age,phone,email from user where age=#{age}")
    List<User> getUserListByAge(int age);
}
