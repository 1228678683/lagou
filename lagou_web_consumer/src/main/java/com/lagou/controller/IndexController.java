package com.lagou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String Indexdemo(Model model){
        model.addAttribute("word","默默");
        return "index";
    }

    /**
     * 全局页面返回
     * @param moduleName
     * @return
     */
    @RequestMapping("{moduleName}")
    public String module(@PathVariable String moduleName) {
        return moduleName;
    }
}
