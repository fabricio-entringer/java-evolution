package com.example.javasamples.java21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.ExecutionException;

class ScopedValuesTest {
    
    private final ScopedValues scopedValues = new ScopedValues();
    
    @Test
    void testRunWithUserContext() {
        String result = scopedValues.runWithUserContext("testUser");
        assertEquals("Processing request for user: testUser", result);
    }
    
    @Test
    void testProcessRequest() {
        String result = scopedValues.processRequest("user123", "req456");
        assertTrue(result.contains("user123"));
        assertTrue(result.contains("req456"));
        assertTrue(result.matches("Request \\[req456\\] from user \\[user123\\] at time \\[\\d+\\]"));
    }
    
    @Test
    void testRunInVirtualThreads() throws InterruptedException, ExecutionException {
        assertDoesNotThrow(() -> scopedValues.runInVirtualThreads());
    }
}