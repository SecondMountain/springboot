package com.example.mapper;

import com.example.entity.Book;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
/**
 * Created by zyf on 2017/11/24.
 */

//public interface BookDao extends JpaRepository<Book,Integer> {
//
//    @Query("select name from book where book.name like %?1%")
//    public List<Book> findByName(String name);
//    @Query(value = "select 1 from book order by RAND() limit ?1")
//    public List<Book> randomlist(Integer n);
//}
//@Repository
//@Component
//@MapperScan
@Mapper
@Repository
public interface BookDao{
     public Book findByName(String name);

     public List<Book> randomlist(Integer n);
}

