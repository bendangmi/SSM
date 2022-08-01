package com.bdm;

import com.bdm.dao.BookDao;
import com.bdm.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/29-21:55
 */
public class App2 {
    public static void main(String[] args) {
        // 3.获取IoC容器
        ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4.获取bean
        final BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

        // 获取bookService bean
        final BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

    }
}
