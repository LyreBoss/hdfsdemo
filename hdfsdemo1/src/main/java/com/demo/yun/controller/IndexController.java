package com.demo.yun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 * Created by lyre on 2018/12/17
 **/
@Controller
@RequestMapping("page")
public class IndexController {






    @RequestMapping("index")
    public String  index(){

        return "home";
    }

}
