package com.example.java_demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

public class FileManagerTest {

	// add unit test for the ReadFileContent Method
	@Test
	void testReadFileContent() {
		// check the condition
		assertEquals(FileManager.readFileContent("src/test/resources/test.txt"), "Hello World");
	}


	// add unit test for the writeToFile Method
	@Test
	void testWriteToFile() {
		// check the condition
		assertEquals(FileManager.writeToFile("Hello World"), "Success");
	}
}