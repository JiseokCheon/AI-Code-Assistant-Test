package com.example.java_demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TodoServiceImplTest {
	@Mock
	TodoService todoServiceMock;


	@InjectMocks
	TodoServiceImpl todoServiceImpl;

	// create method annotated with @Before
	@BeforeEach
	public void init() {
		// create object for the TodoServiceImpl class
		todoServiceImpl = new TodoServiceImpl(todoServiceMock);
	}

	// add unit test for the retrieveTodosRelatedToJava method
	@Test
	public void testRetrieveTodosRelatedToJava() {
		// create a list of strings
		List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Java", "Learn to Dance");
		// when the retrieveTodos method is called, return the list of strings
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		// create a list of strings
		List<String> filteredTodos = todoServiceImpl.retrieveTodosRelatedToJava("Dummy");
		// check if the list of strings is equal to the expected list of strings
		assertEquals(1, filteredTodos.size());
	}
}