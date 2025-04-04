package com.example.javasamples.java11;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates new String methods introduced in Java 11
 */
public class StringMethods {

    /**
     * Checks if a string is blank (empty or only whitespace)
     */
    public boolean isStringBlank(String str) {
        return str.isBlank();
    }
    
    /**
     * Splits a string into lines
     */
    public List<String> getLines(String multilineString) {
        return multilineString.lines().collect(Collectors.toList());
    }
    
    /**
     * Strips leading and trailing whitespace
     */
    public String stripWhitespace(String str) {
        return str.strip();
    }
    
    /**
     * Strips leading whitespace
     */
    public String stripLeadingWhitespace(String str) {
        return str.stripLeading();
    }
    
    /**
     * Strips trailing whitespace
     */
    public String stripTrailingWhitespace(String str) {
        return str.stripTrailing();
    }
    
    /**
     * Repeats a string n times
     */
    public String repeatString(String str, int times) {
        return str.repeat(times);
    }
}
