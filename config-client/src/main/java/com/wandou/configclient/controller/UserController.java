package com.wandou.configclient.controller;

import com.wandou.configclient.mapper.UserMapper;
import com.wandou.configclient.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author liming
 * @date 2018/11/25 18:51
 * @description
 */
@RequestMapping("user/")
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/list")
    @ResponseBody
    public List<User> listUser() {
        List<User> users = userMapper.selectList(null);
        return users;
    }


}
