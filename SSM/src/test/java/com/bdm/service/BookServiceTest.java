package com.bdm.service;

import com.bdm.config.SpringConfig;
import com.bdm.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/8/1-8:43
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testGetById(){
        final Book book = bookService.getById(1);
        System.out.println(book);
    }

    @Test
    public void textGetAll(){
        final List<Book> bookList = bookService.getAll();
       bookList.forEach(System.out::println);
    }

    @Test
    public void delete(){
        final boolean b = bookService.deleteById(15);

    }
}
