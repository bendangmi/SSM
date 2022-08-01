package com.bdm;

import com.bdm.config.SpringConfig;
import com.bdm.dao.BookDao;
import com.bdm.service.BookService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-14:54
 */
public class App {
    public static void main(String[] args) {

//        final ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 使用注解开发
        final AnnotationConfigApplicationContext cpx = new AnnotationConfigApplicationContext(SpringConfig.class);
        final BookDao bookDao = cpx.getBean("bookDao", BookDao.class);
        final BookService bookService = cpx.getBean("bookService", BookService.class);
        bookDao.save();
        bookService.save();
//        cpx.close();

        final DataSource bean = cpx.getBean(DataSource.class);
        System.out.println(bean);


    }
}
