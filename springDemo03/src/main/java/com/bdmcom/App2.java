package com.bdmcom;

import com.bdmcom.confing.SpringConfig;
import com.bdmcom.domain.User;
import com.bdmcom.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-20:22
 */
public class App2 {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        final UserService userService = ctx.getBean(UserService.class);

        final User user = userService.findById(2);
        System.out.println(user);
    }
}
