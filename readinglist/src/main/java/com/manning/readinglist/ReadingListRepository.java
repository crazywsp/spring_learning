package com.manning.readinglist;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book, Long> {

    /*根据读者用户名查找阅读列表*/
    List<Book> findByReader(String reader);

}
