package com.bdm.service.impl;

import com.bdm.dao.BookDao;
import com.bdm.dao.impl.BookDaoImpl;
import com.bdm.service.BookService;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/29-21:15
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
