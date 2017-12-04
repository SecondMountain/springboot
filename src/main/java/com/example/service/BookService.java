package com.example.service;

import com.example.entity.Book;

import java.util.List;

/**
 * Created by zyf on 2017/11/30.
 */
public interface BookService {
    public Book findone(String name);
    public List<Book> findAll(Integer one);
}
