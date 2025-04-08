package com.example.javasamples.java21;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StructuredConcurrencyTest {
    
    private final StructuredConcurrency concurrency = new StructuredConcurrency();
    
    @Test
    void testFetchUserProfile() throws Exception {
        var profile = concurrency.fetchUserProfile("user123");
        assertEquals("John Doe", profile.data().name());
        assertEquals(30, profile.data().age());
        assertEquals(100, profile.stats().postCount());
        assertEquals(500, profile.stats().followerCount());
    }
    
    @Test
    void testFetchFromMirrors() throws Exception {
        String result = concurrency.fetchFromMirrors("resource123");
        assertTrue(result.startsWith("Data from"),
            "Result should be from one of the servers");
    }
}