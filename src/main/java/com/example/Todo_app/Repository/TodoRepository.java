package com.example.Todo_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Todo_app.Model.TodoModel;

public class TodoRepository {
    @Repository
    public interface InnerTodoRepository extends JpaRepository<TodoModel, Long> {
        // 現段階では基本的なCRUD操作のみ
    }
}
