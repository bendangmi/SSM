package com.bdm.service.impl;

import com.bdm.controller.Code;
import com.bdm.dao.BookDao;
import com.bdm.domain.Book;
import com.bdm.exception.BusinessException;
import com.bdm.exception.SystemException;
import com.bdm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/8/1-7:46
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        final int save = bookDao.save(book);
        return save > 0;
    }

    @Override
    public boolean update(Book book) {
        final int update = bookDao.update(book);
        return update > 0;
    }

    @Override
    public boolean deleteById(Integer id) {
        final int delete = bookDao.delete(id);
        return delete > 0;
    }

    @Override
    public Book getById(Integer id) {
        if(id < 1){
            System.out.println("id = 1");
            throw new BusinessException(Code.BUSINESS_ERR, "请不要恶意访问，否则将追究责任！");
        }

        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
