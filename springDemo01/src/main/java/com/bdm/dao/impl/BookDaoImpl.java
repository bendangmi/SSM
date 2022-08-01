package com.bdm.dao.impl;

import com.bdm.dao.BookDao;
import com.bdm.service.BookService;
import com.bdm.service.impl.BookServiceImpl;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/29-21:12
 */
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
