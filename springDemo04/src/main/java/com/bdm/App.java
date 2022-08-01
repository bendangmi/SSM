package com.bdm;

import com.bdm.config.SpringConfig;
import com.bdm.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-21:03
 */
public class App {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        final BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.update();
    }
}
