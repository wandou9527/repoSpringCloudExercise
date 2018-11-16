package com.wandou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/echarts")
@Controller
public class EchartsController {

    @RequestMapping("/m1")
    public String m1() {

        return "jsp/echcarts.jsp";
    }

    @RequestMapping("/haha")
    public String haha() {
        return "jsp/haha.jsp";
    }
}
