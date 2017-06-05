package com.jk.user.controller;

import com.jk.user.service.UserService;
import com.jk.ws.user.User;
import com.jk.ws.user.imp.WSUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dell on 2017/6/5.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @Autowired
    private WSUserService wsUserService;

    @RequestMapping("selectUser")
    public ModelAndView selectUser() {
        List<User> users = wsUserService.selectUserList();
        for (User u : users) {
            System.out.println("============>  "+u.getId()+"   ============>  "+u.getName());
        }
        System.out.println("查询完成。");
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",users);
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping("addUser")
    public ModelAndView addUser(User user){
        wsUserService.addUser(user);
        System.out.println("添加成功。");
        return new ModelAndView("redirect:/selectUser.do");
    }

    @RequestMapping("deleteUserById")
    public ModelAndView deleteUserById(Integer id){
        wsUserService.deleteUserById(id);
        System.out.println("删除成功。");
        return new ModelAndView("redirect:/selectUser.do");
    }

    @RequestMapping("updateUserById")
    public ModelAndView updateUserById(User user){
        wsUserService.updateUserById(user);
        System.out.println("修改成功。");
        return new ModelAndView("redirect:/selectUser.do");
    }

    @RequestMapping("toAdd")
    public ModelAndView toAdd(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("add");
        return mv;
    }
}
