package com.example.javasamples.java12;

/**
 * Demonstrates new String methods introduced in Java 12
 */
public class StringMethods {

    /**
     * Indents each line of the string by the specified number of spaces
     */
    public String indentString(String str, int spaces) {
        return str.indent(spaces);
    }
    
    /**
     * Transforms a string using the provided function
     */
    public String transformString(String str) {
        return str.transform(s -> new StringBuilder(s).reverse().toString());
    }
}
