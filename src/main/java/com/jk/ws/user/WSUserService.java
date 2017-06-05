package com.jk.ws.user;

import com.jk.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by dell on 2017/6/5.
 */
@WebService
public interface WSUserService {

    @WebMethod
    List<User> selectUserList();

    @WebMethod
    void addUser(@WebParam(name = "user") User user);

    @WebMethod
    void deleteUserById(@WebParam(name = "id") Integer id);

    @WebMethod
    void updateUserById(@WebParam(name = "user" )User user);
}
