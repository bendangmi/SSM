package com.bdm;

import com.bdm.dao.UserDao;
import com.bdm.factory.UserDaoFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-9:16
 */
public class App3 {
    public static void main(String[] args) throws Exception {
        // 使用spring创建的对象为单例
        final ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        final UserDao userDao1 = (UserDao) ctx.getBean("userDao");
        final UserDao userDao2 = (UserDao) ctx.getBean("userDao");
        System.out.println(userDao1 + "\n" + userDao2);
//        userDao1.save();
        // 自己创建的不是单例
        System.out.println("**********************");
        final UserDaoFactoryBean userDaoFactoryBean = new UserDaoFactoryBean();
        final UserDao object1 = userDaoFactoryBean.getObject();
        final UserDao object2 = userDaoFactoryBean.getObject();
        System.out.println(object1 + "\n" + object2);
//        object1.save();
    }
}
