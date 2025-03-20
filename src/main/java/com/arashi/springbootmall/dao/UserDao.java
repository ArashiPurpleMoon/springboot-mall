package com.arashi.springbootmall.dao;

import com.arashi.springbootmall.dto.UserRegisterRequest;
import com.arashi.springbootmall.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
