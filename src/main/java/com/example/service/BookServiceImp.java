package com.example.service;

import com.example.mapper.BookDao;
import com.example.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zyf on 2017/11/30.
 */
@Service
public class BookServiceImp implements BookService{
    @Autowired
    private BookDao bookDao;

    @Override
    public Book findone(String name) {
        return bookDao.findByName(name);
    }

    @Override
    public List<Book> findAll(Integer one) {
        return bookDao.randomlist(one);
    }
}
