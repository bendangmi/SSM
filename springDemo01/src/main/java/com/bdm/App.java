package com.bdm;

import com.bdm.service.BookService;
import com.bdm.service.impl.BookServiceImpl;

/**
 * @code Description
 * @code author 本当迷
 * @code date 2022/7/29-21:22
 */
public class App {
    public static void main(String[] args) {
        final BookService bookService = new BookServiceImpl();
        bookService.save();

    }
}
