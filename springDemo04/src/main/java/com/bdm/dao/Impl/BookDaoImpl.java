package com.bdm.dao.Impl;

import com.bdm.dao.BookDao;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/30-21:04
 */
@Repository
public class BookDaoImpl implements BookDao {


    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book save");
    }

    @Override
    public void update() {
        System.out.println("book update ...");
    }
}
