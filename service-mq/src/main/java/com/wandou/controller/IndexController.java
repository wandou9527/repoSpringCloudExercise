package com.wandou.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);


    @GetMapping
    public String indexWandou() {
        logger.info("请求 index 时间戳：" + System.currentTimeMillis());
        return "index";
    }



}
