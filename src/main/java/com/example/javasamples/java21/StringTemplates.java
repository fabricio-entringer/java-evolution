package com.example.javasamples.java21;

import static java.lang.StringTemplate.STR;

/**
 * Demonstrates String Templates introduced in Java 21
 */
public class StringTemplates {
    
    /**
     * Uses basic string template interpolation
     */
    public String greetPerson(String name, int age) {
        return STR."Hello \{name}, you are \{age} years old!";
    }
    
    /**
     * Demonstrates string templates with expressions
     */
    public String getPersonInfo(String name, int birthYear) {
        int currentYear = 2025;
        int age = currentYear - birthYear;
        return STR."""
            Person Information:
            Name: \{name}
            Birth Year: \{birthYear}
            Age: \{age}
            Senior Citizen: \{age >= 65 ? "Yes" : "No"}
            """;
    }
    
    /**
     * Shows string templates with JSON formatting
     */
    public String createJsonString(String name, int age, String city) {
        return STR."""
            {
                "name": "\{name}",
                "age": \{age},
                "city": "\{city}",
                "isAdult": \{age >= 18}
            }""";
    }
}