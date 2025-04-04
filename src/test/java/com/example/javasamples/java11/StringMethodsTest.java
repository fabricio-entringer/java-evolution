package com.example.javasamples.java11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class StringMethodsTest {
    
    private final StringMethods stringMethods = new StringMethods();
    
    @Test
    void testIsBlank() {
        assertTrue(stringMethods.isStringBlank(""));
        assertTrue(stringMethods.isStringBlank("   "));
        assertFalse(stringMethods.isStringBlank("Hello"));
        assertFalse(stringMethods.isStringBlank("  Hello  "));
    }
    
    @Test
    void testLines() {
        String multiline = "Line 1\nLine 2\nLine 3";
        List<String> lines = stringMethods.getLines(multiline);
        
        assertEquals(3, lines.size());
        assertEquals("Line 1", lines.get(0));
        assertEquals("Line 2", lines.get(1));
        assertEquals("Line 3", lines.get(2));
    }
    
    @Test
    void testStrip() {
        assertEquals("Hello", stringMethods.stripWhitespace("  Hello  "));
        assertEquals("Hello", stringMethods.stripLeadingWhitespace("  Hello"));
        assertEquals("Hello", stringMethods.stripTrailingWhitespace("Hello  "));
    }
    
    @Test
    void testRepeat() {
        assertEquals("HelloHelloHello", stringMethods.repeatString("Hello", 3));
        assertEquals("", stringMethods.repeatString("Hello", 0));
    }
}
