package com.example.Todo_app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Todo_app.Model.TodoModel;
import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoModel, Long> {
    // 完了状態で絞り込む
    List<TodoModel>findByCompleted(boolean completed);
}
