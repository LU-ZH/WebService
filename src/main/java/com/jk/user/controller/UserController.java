package com.jk.user.controller;

import com.jk.user.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by dell on 2017/6/5.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;
}
