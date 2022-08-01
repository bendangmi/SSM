package com.bdm.controller;

import com.bdm.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Date;
import java.util.List;

@Controller
//类上方配置的请求映射与方法上面配置的请求映射连接在一起，形成完整的请求映射路径
//@RequestMapping(value="/user",produces = "application/json;charset=utf-8") ，配置produces属性可以解决乱码问题
@RequestMapping(value = "/user",produces = "application/json;charset=utf-8")
public class UserController {
    //请求路径映射
    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'module':'user save'}";
    }
    //请求路径映射
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete ...");
        return "{'module':'user delete'}";
    }

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(@RequestParam("username") String name, int age){
        System.out.println("普通参数传递-=======> " + name);
        System.out.println("普通参数传递-=======> " + age);
        return "{'module':'common param'}";
    }

    @RequestMapping("/commonParam1")
    @ResponseBody
    public String commonParam1(User user){
        System.out.println("普通参数传递-=======> " + user.getName());
        System.out.println("普通参数传递-=======> " + user.getAge());
        System.out.println(user);
        return "{'module':'common param'}";
    }

    // 集合参数
    @RequestMapping("/like")
    @ResponseBody
    public String like(@RequestParam List<String>likes){
        System.out.println(likes);
        return "{'module':'common param'}";
    }

    // 数组返回类型
    @RequestMapping("/json")
    @ResponseBody
    public String json(@RequestBody List<String>likes){
        System.out.println(likes);
        return "{'module':'common param'}";
    }

    // JOSN对象
    @RequestMapping("/commonParamJSON")
    @ResponseBody
    public String commonParamJSON(@RequestBody User user){
        System.out.println("普通参数传递-=======> " + user.getName());
        System.out.println("普通参数传递-=======> " + user.getAge());
        return "{'module':'common param'}";
    }

    // 日期参数
    @RequestMapping("/dateParam")
    @ResponseBody
    public String dataParam(Date date, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1){
        System.out.println("参数传递 data ===>" + date);
        System.out.println("参数传递 data1 ===>" + date1);
        return "{'bdm':'20'}";
    }


}
