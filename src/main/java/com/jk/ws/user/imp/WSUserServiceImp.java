package com.jk.ws.user.imp;

import com.jk.entity.User;
import com.jk.user.mapper.UserMapper;
import com.jk.ws.user.WSUserService;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by dell on 2017/6/5.
 */
@WebService
public class WSUserServiceImp implements WSUserService {

    @Resource
    private UserMapper userMapper;

    @WebMethod
    public List<User> selectUserList() {
        return userMapper.selectUserList();
    }

    @WebMethod
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @WebMethod
    public void deleteUserById(Integer id) {
        userMapper.deleteUserById(id);
    }

    @WebMethod
    public void updateUserById(User user) {
        userMapper.updateUserById(user);
    }
}
