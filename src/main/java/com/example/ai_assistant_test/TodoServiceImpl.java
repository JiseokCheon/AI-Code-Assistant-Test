package com.example.ai_assistant_test;


// Importing required classes
import java.util.ArrayList;
import java.util.List;

// Main class
public class TodoServiceImpl {

    // Creating a reference of
    // TodoService interface
    private final TodoService todoService;

    // Constructor
    public TodoServiceImpl(TodoService todoService)
    {

        // This keyword refers to same instance itself
        this.todoService = todoService;
    }

  
    /**
     * Retrieves a list of todos related to Java for the given user.
     *
     * @param user the user for whom to retrieve the todos
     * @return a list of todos related to Java
     */
    public List<String> retrieveTodosRelatedToJava(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = todoService.retrieveTodos(user);

        for (String todo : todos) {
            // Filtering the string that contains "Java" keyword
            if (todo.contains("Java")) {
                filteredTodos.add(todo);
            }
        }

        return filteredTodos;
    }
}