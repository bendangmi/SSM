package com.bdm.dao.impl;

import com.bdm.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-14:51
 */
@Component("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book save ... 1");
    }
}
