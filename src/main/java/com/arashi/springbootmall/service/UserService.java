package com.arashi.springbootmall.service;

import com.arashi.springbootmall.dto.UserRegisterRequest;
import com.arashi.springbootmall.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
