package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class MyFileReader {

    String fileName;
    String filePath;

    public MyFileReader(String fileName, String filePath) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    // method to read student data from csv file
    public StringBuilder ReadCSV(){

        StringBuilder content = new StringBuilder();
        String line;
        try (
            FileReader fileReader = new FileReader(filePath + fileName)) {
            BufferedReader reader = new BufferedReader(fileReader);
            while(reader.readLine() != null){
                line = reader.readLine();
                content.append(line);
            }
            return content;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}