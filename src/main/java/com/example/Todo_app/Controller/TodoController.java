package com.example.Todo_app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Todo_app.Service.TodoService;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;
    // Serviceを注入

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
