package com.example.controller;

import com.example.service.BookServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by zyf on 2017/11/24.
 */
@Controller
@RequestMapping("/book")
public class BookController {
//    @Resource
//    private BookDao bookDao;
    @Resource
    private BookServiceImp bookserviceImp;
    @RequestMapping("/find")
    public ModelAndView query(){
        ModelAndView mv =new ModelAndView();
        mv.addObject("books",bookserviceImp.findAll(5));
        mv.setViewName("books");
        return mv;
    }
}
