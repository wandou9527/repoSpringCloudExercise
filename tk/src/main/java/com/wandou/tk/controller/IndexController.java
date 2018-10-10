package com.wandou.tk.controller;

import com.wandou.tk.mapper.UserMapper;
import com.wandou.tk.po.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController {

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

//    @Autowired
//    private UserMapper userMapper;

    @Value("${foo2}")
    private String foo2;

    @GetMapping
    public String indexWandou() {
        logger.info("请求 index 时间戳：" + System.currentTimeMillis());
        return "index";
    }

    @ResponseBody
    @RequestMapping("/user_list")
    public List<User> userList() {
        return null;
    }

    @ResponseBody
    @RequestMapping("/foo2")
    public String foo2() {
        return foo2;
    }



}
