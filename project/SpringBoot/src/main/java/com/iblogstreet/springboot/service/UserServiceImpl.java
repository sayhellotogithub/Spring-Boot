package com.iblogstreet.springboot.service;

import com.iblogstreet.springboot.dao.UserDao;
import com.iblogstreet.springboot.pojo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Armyone
 * @date 2018/7/27 10:29
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> getUserList(String name) {
        return userDao.getUserList(name);
    }

    @Override
    public List<User> getUserListByAge(int age) {
        return userDao.getUserListByAge(age);
    }
}
