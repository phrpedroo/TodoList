package com.estudos.pedro.todoList.repository;

import com.estudos.pedro.todoList.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {


}
