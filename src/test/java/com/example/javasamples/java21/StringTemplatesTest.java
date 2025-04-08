package com.example.javasamples.java21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringTemplatesTest {
    
    private final StringTemplates stringTemplates = new StringTemplates();
    
    @Test
    void testGreetPerson() {
        String result = stringTemplates.greetPerson("John", 30);
        assertEquals("Hello John, you are 30 years old!", result);
    }
    
    @Test
    void testGetPersonInfo() {
        String result = stringTemplates.getPersonInfo("Alice", 1990);
        assertTrue(result.contains("Name: Alice"));
        assertTrue(result.contains("Birth Year: 1990"));
        assertTrue(result.contains("Age: 35"));
        assertTrue(result.contains("Senior Citizen: No"));
    }
    
    @Test
    void testCreateJsonString() {
        String result = stringTemplates.createJsonString("Bob", 25, "New York");
        assertTrue(result.contains("\"name\": \"Bob\""));
        assertTrue(result.contains("\"age\": 25"));
        assertTrue(result.contains("\"city\": \"New York\""));
        assertTrue(result.contains("\"isAdult\": true"));
    }
}