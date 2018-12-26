package com.demo.yun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

/**
 * 首页
 * Created by lyre on 2018/12/17
 **/
@Controller
@RequestMapping("page")
public class IndexController {






    @RequestMapping("index")
    public String  index(Model model){
        model.addAttribute("test" ,"lvguoqing");
        return "home";
    }

}
