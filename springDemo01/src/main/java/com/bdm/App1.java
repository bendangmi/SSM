package com.bdm;

import com.bdm.dao.BookDao;
import com.bdm.dao.OrderDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-10:05
 */
public class App1 {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 方式一：获取bean，按bean名称获取
        final OrderDao orderDao = (OrderDao) cpx.getBean("orderDao");

        // 方式二：获取bean，使用bean名称获取并指定类型
        final BookDao bookDao = cpx.getBean("bookDao", BookDao.class);
        bookDao.save();

        // 方式三：获取bean，使用bean类型获取
        final BookDao bean = cpx.getBean(BookDao.class);
        bean.save();
    }
}
