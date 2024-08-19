package com.example.java_demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {


    public static String readFileContent(String filePath) {
        BufferedReader br = null;
        String data = null;

        try {
            br = new BufferedReader(new FileReader(filePath));
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
            data = ioe.getMessage();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        return data;
    }
    public static void createNewFile() {

        // create a file object for the current location
        File file = new File("newFile.txt");

        try {

            // trying to create a file based on the object
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("The new file is created.");
            }
            else {
                System.out.println("The file already exists.");
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }

    public static void writeToFile(String data) {
        try {
            // Creates a Writer using FileWriter
            FileWriter output = new FileWriter("output.txt");

            // Writes string to the file
            output.write(data);
            System.out.println("Data is written to the file.");

            // Closes the writer
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void writeToFileCheck(String data) {
        File file = new File("output.txt");
        if(file.exists()){
            System.out.println("File exists");
            try {
                FileWriter output = new FileWriter("output.txt");

                // Writes string to the file
                output.write(data);
                System.out.println("Data is written to the file.");

                // Closes the writer
                output.close();
            }
            catch (Exception e) {
                e.getStackTrace();
            }
        }else{
            System.out.println("File does not exist");
        }

    }

}