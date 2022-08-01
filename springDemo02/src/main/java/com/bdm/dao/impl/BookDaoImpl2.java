package com.bdm.dao.impl;

import com.bdm.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-14:51
 */
@Component("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("book save ... 2" + name);
    }
}
