package com.bdm.service.impl;

import com.bdm.dao.BookDao;
import com.bdm.dao.impl.BookDaoImpl;
import com.bdm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-14:52
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    // 自动装配
    @Autowired
    @Qualifier("bookDao2")
   private BookDao bookDao;

    public void save(){
        System.out.println("book service save ...");
        bookDao.save();
    }

    // 初始化
    @PostConstruct
    public void init(){
        System.out.println("init ...");
    }

    // 销毁
    @PreDestroy
    public void destroy(){
        System.out.println("destroy ...");
    }
}
