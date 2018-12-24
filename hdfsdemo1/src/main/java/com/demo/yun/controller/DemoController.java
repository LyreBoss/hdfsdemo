package com.demo.yun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Created by lyre on 2018/12/17
 */

@Controller
public class DemoController {


    /**
     * 页面入口
     */
    @RequestMapping("/demo")
    private String index() {
        return "/index";
    }
}
