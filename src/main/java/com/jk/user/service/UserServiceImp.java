package com.jk.user.service;

import com.jk.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by dell on 2017/6/5.
 */
@Service
public class UserServiceImp implements UserService {

    @Resource
    private UserMapper userMapper;
}
