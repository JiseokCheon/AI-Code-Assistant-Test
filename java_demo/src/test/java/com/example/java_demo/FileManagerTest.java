package com.example.java_demo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class FileManagerTest {

	@TempDir
	Path tempDir;

	@Test
	public void testReadFileContentWhenFileExistsAndHasContentThenReturnContent() throws IOException {
		// Arrange
		File file = new File(tempDir + "/testFile.txt");
		FileWriter writer = new FileWriter(file);
		String expectedContent = "Hello, World!";
		writer.write(expectedContent);
		writer.close();

		// Act
		String actualContent = FileManager.ReadFileContent(file.getAbsolutePath());

		// Assert
		assertEquals(expectedContent, actualContent, "The content of the file is not read correctly.");
	}

	@Test
	public void testReadFileContentWhenFileDoesNotExistThenReturnNull() {
		// Arrange
		String filePath = tempDir + "/nonExistentFile.txt";

		// Act
		String content = FileManager.ReadFileContent(filePath);

		// Assert
		assertNull(content, "The method does not return null when the file does not exist.");
	}

	@Test
	public void testReadFileContentWhenIOExceptionOccursThenReturnErrorMessage() throws IOException {
		// Arrange
		File file = new File(tempDir + "/testFile.txt");
		FileWriter writer = new FileWriter(file);
		String expectedContent = "Hello, World!";
		writer.write(expectedContent);
		writer.close();
		file.setReadOnly(); // This will cause an IOException when trying to read the file

		// Act
		String actualContent = FileManager.ReadFileContent(file.getAbsolutePath());

		// Assert
		assertEquals("Permission denied", actualContent,
			"The method does not return the correct error message when an IOException occurs.");
	}
}