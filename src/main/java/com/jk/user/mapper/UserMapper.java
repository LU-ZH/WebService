package com.jk.user.mapper;

import com.jk.entity.User;

import java.util.List;

/**
 * Created by dell on 2017/6/5.
 */
public interface UserMapper {

    List<User> selectUserList();

    void addUser(User user);

    void deleteUserById(Integer id);

    void updateUserById(User user);
}
