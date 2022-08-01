package com.bdm.controller;

import com.bdm.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/31-17:30
 */
@Controller
public class responseController {
    // 响应页面/跳转页面
    @RequestMapping("/index")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "index.jsp";
    }

    // 响应文本数据
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回文本数据");
        return "bdm yyds";
    }

    // 响应POJO对象
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        System.out.println("返回JSON对象数据");
        final User user = new User();
        user.setName("本当迷");
        return user;
    }

}
