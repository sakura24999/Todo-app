package com.example.Todo_app.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class TodoModel {
    // 主キー定義
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // プライベートフィールド
    private String task;
    private boolean completed;
    private LocalDateTime createdAt;

    // コンストラクタ
    public TodoModel() {} // デフォルトコンストラクタ(JPA用)
    public TodoModel(String task) {
        this.task = task;
        this.completed = false;
        this.createdAt = LocalDateTime.now();
    }

    // ゲッター(読み取り用)
    public String getTask() {
        return this.task;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    // セッター(書き込み用)
    public void setTask(String task) {
        this.task = task;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
