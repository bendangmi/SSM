package com.bdm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/31-12:24
 */
// 使用@Controller定义MVC bean
@Controller
public class UserController {

    // 设置当前操作的访问路径
    @RequestMapping("/save")
    // 设置当前操作的返回值类型
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'name':'bdm'}";
    }
}
