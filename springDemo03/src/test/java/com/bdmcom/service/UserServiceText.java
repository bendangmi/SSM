package com.bdmcom.service;

import com.bdmcom.confing.SpringConfig;
import com.bdmcom.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-20:32
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceText {

    @Autowired
    private UserService userService;

    @Test
    public void testFindById(){
        final User byId = userService.findById(2);
        System.out.println(byId);
    }
}
