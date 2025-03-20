package com.arashi.springbootmall.service.impl;

import com.arashi.springbootmall.dao.UserDao;
import com.arashi.springbootmall.dto.UserRegisterRequest;
import com.arashi.springbootmall.model.User;
import com.arashi.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
