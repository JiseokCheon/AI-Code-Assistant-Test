package com.example.java_demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileManagerTest {


	/**
	 * This is the test class for FileManager.java.
	 * It contains methods to test the function ReadFileContent of the FileManager java class.
	 **/

	@Test
	void testReadFileContent() {
		try {
			// create a temp file and write some data to it
			Path tempFilePath = Files.createTempFile("temp", "txt");
			String text = "this is some test content";
			Files.write(tempFilePath, text.getBytes());

			// run the test method
			String result = FileManager.ReadFileContent(tempFilePath.toString());

			// assert that the file content matches the data that was written to the file
			Assertions.assertEquals(text, result);

			// delete the temp file
			Files.delete(tempFilePath);
		} catch (IOException e) {
			Assertions.fail("IOException occurred: " + e.getMessage());
		}
	}

	@Test
	void testReadFileContentWhenFileDoesNotExist() {
		// run the test method on a non-existent file
		String result = FileManager.ReadFileContent("nonExistentFile.txt");

		// assert that the file content matches the error message that is expected
		Assertions.assertEquals("nonExistentFile.txt (No such file or directory)", result);
	}
}