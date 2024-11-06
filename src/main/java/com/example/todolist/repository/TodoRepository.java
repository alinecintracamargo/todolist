package com.example.todolist.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todolist.entity.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long>{

    void findAll(Sort sort);

}
    
