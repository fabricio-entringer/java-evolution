package com.example.javasamples.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Demonstrates new Files methods introduced in Java 11
 */
public class FilesMethods {

    /**
     * Reads all content from a file into a string
     */
    public String readString(Path path) throws IOException {
        return Files.readString(path);
    }
    
    /**
     * Writes a string to a file
     */
    public void writeString(Path path, String content) throws IOException {
        Files.writeString(path, content);
    }
}
